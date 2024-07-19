package labEx8.ui;

import labEx8.model.BookingModel;
import labEx8.repository.BookingNotFoundException;
import labEx8.repository.BookingRepository;
import labEx8.repository.DuplicateBookingException;
import labEx8.util.MainMenuUtil;
import labEx8.util.MenuUtil;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to AIR1010");
        BookingRepository bookingRepository = new BookingRepository();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int choice = MainMenuUtil.displayMainMenu();
            switch (choice) {
                case 1:
                    BookingModel bookingModel = MenuUtil.bookFlights();
                    try {
                        bookingRepository.addBooking(bookingModel);
                    } catch (DuplicateBookingException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    List<BookingModel> bookings = bookingRepository.displayBookings();
                    for (BookingModel booking : bookings) {
                        System.out.println(booking);
                    }
                    break;
                case 3:
                    System.out.print("Enter Booking ID to search: ");
                    int searchId = scanner.nextInt();
                    try {
                        BookingModel foundBooking = bookingRepository.getBookingById(searchId);
                        System.out.println("Found booking: " + foundBooking);
                    } catch (BookingNotFoundException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter Booking ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        BookingModel existingBooking = bookingRepository.getBookingById(updateId);
                        BookingModel updatedBooking = MenuUtil.bookFlights();
                        updatedBooking.setBookingId(updateId); // Ensure ID remains the same
                        bookingRepository.updateBooking(updatedBooking);
                    } catch (BookingNotFoundException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Enter Booking ID to delete: ");
                    int deleteId = scanner.nextInt();
                    try {
                        bookingRepository.deleteBooking(deleteId);
                    } catch (BookingNotFoundException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 6:
                        System.exit(0);
                        break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
