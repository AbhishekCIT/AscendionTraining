package labEx2.labEx2_1;

import labEx2.employee.Employee;
import labEx2.manager.MeetingRoomManager;
import labEx2.meetingRooms.MeetingRoom;
import labEx2.meetingRooms.ZoomMeetingRoom;
import labEx2.bookings.MeetingBooking;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class LabEx2_1 {
    public static void main(String[] args) {
        MeetingRoomManager roomManager = new MeetingRoomManager();

        MeetingRoom mroom1 = new MeetingRoom("MR1", 30, 1);
        MeetingRoom mroom2 = new MeetingRoom("MR2", 30, 2);
        MeetingRoom mroom3 = new MeetingRoom("MR3", 30, 3);
        MeetingRoom mroom4 = new MeetingRoom("MR4", 30, 4);
        MeetingRoom mroom5 = new MeetingRoom("MR5", 30, 5);

        ZoomMeetingRoom zroom1 = new ZoomMeetingRoom("ZR1", 50, 1, "D1", "A1");
        ZoomMeetingRoom zroom2 = new ZoomMeetingRoom("ZR2", 50, 2, "D2", "A2");
        ZoomMeetingRoom zroom3 = new ZoomMeetingRoom("ZR3", 50, 3, "D3", "A3");
        ZoomMeetingRoom zroom4 = new ZoomMeetingRoom("ZR4", 50, 4, "D4", "A4");
        ZoomMeetingRoom zroom5 = new ZoomMeetingRoom("ZR5", 50, 5, "D5", "A5");

        roomManager.addMeeting(mroom1);
        roomManager.addMeeting(mroom2);
        roomManager.addMeeting(mroom3);
        roomManager.addMeeting(mroom4);
        roomManager.addMeeting(mroom5);
        roomManager.addMeeting(zroom1);
        roomManager.addMeeting(zroom2);
        roomManager.addMeeting(zroom3);
        roomManager.addMeeting(zroom4);
        roomManager.addMeeting(zroom5);

        Employee emp1 = new Employee("Sanjay", 1);
        Employee emp2 = new Employee("Selva", 4);
        Employee emp3 = new Employee("Dakshana", 7);
        Employee emp4 = new Employee("Nandhish", 8);
        Employee emp5 = new Employee("Abhishek", 10);

        roomManager.bookMeetingRoom(emp1, mroom1, LocalDate.of(2024, 6, 29), LocalTime.of(10, 0, 0), Duration.ofHours(1));
        roomManager.bookMeetingRoom(emp2, mroom3, LocalDate.of(2024, 6, 29), LocalTime.of(10, 0, 0), Duration.ofHours(1));
        roomManager.bookMeetingRoom(emp3, mroom5, LocalDate.of(2024, 6, 30), LocalTime.of(10, 0, 0), Duration.ofHours(1));
        roomManager.bookMeetingRoom(emp4, zroom1, LocalDate.of(2024, 6, 30), LocalTime.of(10, 0, 0), Duration.ofHours(1));
        roomManager.bookMeetingRoom(emp5, zroom5, LocalDate.of(2024, 6, 29), LocalTime.of(10, 0, 0), Duration.ofHours(1));

        List<MeetingBooking> todayMeetingBookings = roomManager.getBookingsByDate(LocalDate.of(2024, 6, 29));
        todayMeetingBookings.forEach(meetingBooking -> System.out.println(meetingBooking.getBookingDetails()));
    }
}
