package labEx2.bookings;

import labEx2.employee.Employee;
import labEx2.meetingRooms.MeetingRoom;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class MeetingBooking {
    private String bookingId;
    private Employee employee;
    private MeetingRoom meetingRoom;
    private LocalDate meetingDate;
    private LocalTime meetingTime;
    private Duration duration;

    public MeetingBooking(String bookingId, Employee employee, MeetingRoom meetingRoom, LocalDate meetingDate, LocalTime meetingTime, Duration duration) {
        this.bookingId = bookingId;
        this.employee = employee;
        this.meetingRoom = meetingRoom;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
        this.duration = duration;
    }

    public String getBookingDetails() {
        return "Booking ID - " + bookingId + ", Employee - " + employee.getEmployeeDetails() + ", Meeting Room - " + meetingRoom.getDetails() + ", Meeting Date - " + meetingDate + ", Meeting Time - " + meetingTime + ", Duration - " + duration;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }
}
