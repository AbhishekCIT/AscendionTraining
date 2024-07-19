package labEx8.repository;

import labEx8.model.BookingModel;

import java.sql.*;


import java.util.ArrayList;
import java.util.List;

public class BookingRepository {

    private Connection connection;


    public BookingRepository(){
        try {
            connection = DriverManager.getConnection("hvv:mysql://localhost:3306/AIR110","root","mysql");  //127.0.0.1
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public void addBooking(BookingModel bookingModel) throws DuplicateBookingException{
        String query = "INSERT INTO bookings (bookingId, source, destination, ticketClass, noOfPassengers, roundTrip) VALUES (?, ?, ?, ?, ?, ?)";

        try(PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setInt(1,bookingModel.getBookingId());
            preparedStatement.setString(2, bookingModel.getSource());
            preparedStatement.setString(3, bookingModel.getDestination());
            preparedStatement.setString(4, bookingModel.getTicketClass());
            preparedStatement.setInt(5,bookingModel.getNoOfPassengers());
            preparedStatement.setBoolean(6,bookingModel.isRoundTrip());

            preparedStatement.executeUpdate();
            System.out.println("Saved booking: " + bookingModel);

        } catch (SQLIntegrityConstraintViolationException e){
            throw new DuplicateBookingException("Booking with ID " + bookingModel.getBookingId() + " already exists.");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }




    public List<BookingModel> displayBookings() {

        String query = "SELECT * FROM bookings";

        List<BookingModel> bookingModelList = new ArrayList<>();

        try(Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()){
                BookingModel booking = new BookingModel(
                resultSet.getInt("bookingId"),
                resultSet.getString("source"),
                resultSet.getString("destination"),
                resultSet.getString("ticketClass"),
                resultSet.getInt("noOfPassengers"),
                resultSet.getBoolean("roundTrip"));
                bookingModelList.add(booking);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return bookingModelList;

    }




    public BookingModel getBookingById(int bookingId) throws BookingNotFoundException {

        String query = "SELECT * FROM bookings WHERE bookingId = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, bookingId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return new BookingModel(
                        resultSet.getInt("bookingId"),
                        resultSet.getString("source"),
                        resultSet.getString("destination"),
                        resultSet.getString("ticketClass"),
                        resultSet.getInt("noOfPassengers"),
                        resultSet.getBoolean("roundTrip"));

            } else {
                throw new BookingNotFoundException("Booking with ID " + bookingId + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new BookingNotFoundException("Error fetching booking with ID " + bookingId);
        }



    }

    public void updateBooking(BookingModel updatedBooking) throws BookingNotFoundException {
        String query = "UPDATE bookings SET source = ?, destination = ?, ticketClass = ?, noOfPassengers = ?, roundTrip = ? WHERE bookingId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, updatedBooking.getSource());
            preparedStatement.setString(2, updatedBooking.getDestination());
            preparedStatement.setString(3, updatedBooking.getTicketClass());
            preparedStatement.setInt(4, updatedBooking.getNoOfPassengers());
            preparedStatement.setBoolean(5, updatedBooking.isRoundTrip());
            preparedStatement.setInt(6, updatedBooking.getBookingId());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 0) {
                throw new BookingNotFoundException("Booking with ID " + updatedBooking.getBookingId() + " not found.");
            } else {
                System.out.println("Updated booking: " + updatedBooking);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBooking(int bookingId) throws BookingNotFoundException {

        String query = "DELETE FROM bookings WHERE bookingId = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, bookingId);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 0) {
                throw new BookingNotFoundException("Booking with ID " + bookingId + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
