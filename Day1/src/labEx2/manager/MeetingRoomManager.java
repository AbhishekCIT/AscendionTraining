package labEx2.manager;

import labEx2.bookings.MeetingBooking;
import labEx2.employee.Employee;
import labEx2.meetingRooms.MeetingRoom;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MeetingRoomManager {
    private List<MeetingRoom> meetingRooms;
    private List<MeetingBooking> bookings;

    public MeetingRoomManager() {
        this.meetingRooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public void addMeeting(MeetingRoom roomInfo) {
        meetingRooms.add(roomInfo);
    }

    public MeetingBooking bookMeetingRoom(Employee employee, MeetingRoom room, LocalDate date, LocalTime time, Duration duration) {
        String bookingId = "Booking" + (bookings.size() + 1);
        MeetingBooking booking = new MeetingBooking(bookingId, employee, room, date, time, duration);
        bookings.add(booking);
        return booking;
    }

    public List<MeetingBooking> getBookingsByDate(LocalDate date) {
        List<MeetingBooking> filteredBookings = new ArrayList<>();
        for (MeetingBooking booking : bookings) {
            if (booking.getMeetingDate().equals(date)) {
                filteredBookings.add(booking);
            }
        }
        return filteredBookings;
    }
}
