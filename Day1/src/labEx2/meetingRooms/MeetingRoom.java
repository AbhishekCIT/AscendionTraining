package labEx2.meetingRooms;

public class MeetingRoom {
    protected String id;
    protected int capacity;
    protected int floor;

    public MeetingRoom(String id, int capacity, int floor) {
        this.id = id;
        this.capacity = capacity;
        this.floor = floor;
    }

    public String getDetails() {
        return "ID - " + id + ", Capacity - " + capacity + ", Floor - " + floor;
    }
}
