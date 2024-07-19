package labEx7.repository;

import labEx7.model.BookingModel;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository {
    private List<BookingModel> bookingModelList = new ArrayList<>();

    public void addBooking(BookingModel bookingModel) {
        for (BookingModel existingBooking : bookingModelList) {
            if (existingBooking.getBookingId() == bookingModel.getBookingId()) {
                throw new DuplicateBookingException("Booking with ID " + bookingModel.getBookingId() + " already exists.");
            }
        }
        bookingModelList.add(bookingModel);
        System.out.println("Saved booking: " + bookingModel);
    }

    public void displayBookings() {
        if (bookingModelList.isEmpty()) {
            System.out.println("No bookings available.");
        } else {
            for (BookingModel booking : bookingModelList) {
                System.out.println(booking);
            }
        }
    }

    public BookingModel getBookingById(int bookingId) throws BookingNotFoundException {
        for (BookingModel booking : bookingModelList) {
            if (booking.getBookingId() == bookingId) {
                return booking;
            }
        }
        throw new BookingNotFoundException("Booking with ID " + bookingId + " not found.");
    }

    public void updateBooking(BookingModel updatedBooking) throws BookingNotFoundException {
        boolean found = false;
        for (int i = 0; i < bookingModelList.size(); i++) {
            if (bookingModelList.get(i).getBookingId() == updatedBooking.getBookingId()) {
                bookingModelList.set(i, updatedBooking);
                found = true;
                System.out.println("Updated booking: " + updatedBooking);
                break;
            }
        }
        if (!found) {
            throw new BookingNotFoundException("Booking with ID " + updatedBooking.getBookingId() + " not found.");
        }
    }

    public void deleteBooking(int bookingId) throws BookingNotFoundException {
        boolean removed = bookingModelList.removeIf(booking -> booking.getBookingId() == bookingId);
        if (removed) {
            System.out.println("Deleted booking with ID " + bookingId);
        } else {
            throw new BookingNotFoundException("Booking with ID " + bookingId + " not found.");
        }
    }
}
