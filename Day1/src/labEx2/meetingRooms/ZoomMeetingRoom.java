package labEx2.meetingRooms;

public class ZoomMeetingRoom extends MeetingRoom {
    private String zoomDeviceId;
    private String zoomAccountID;

    public ZoomMeetingRoom(String id, int capacity, int floor, String zoomDeviceId, String zoomAccountID) {
        super(id, capacity, floor);
        this.zoomDeviceId = zoomDeviceId;
        this.zoomAccountID = zoomAccountID;
    }

    public String getZoomDetails() {
        return super.getDetails() + ", Zoom Device: " + zoomDeviceId + ", Zoom Account: " + zoomAccountID;
    }
}
