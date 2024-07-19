package labEx7.ui;

import labEx7.model.BookingModel;
import labEx7.repository.BookingNotFoundException;
import labEx7.repository.BookingRepository;
import labEx7.repository.DuplicateBookingException;
import labEx7.util.MainMenuUtil;
import labEx7.util.MenuUtil;

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
                    bookingRepository.displayBookings();
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
