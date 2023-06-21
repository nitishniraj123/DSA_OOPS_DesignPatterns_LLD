package LLD.bookingConferenceRoom.models;

import java.util.List;


public class Floor {
    private String fId;
    private String bId;
    private List<ConferenceRoom> roomList;
    public Floor(String fId, String bId, List<ConferenceRoom> roomList) {
        this.fId = fId;
        this.bId = bId;
        this.roomList = roomList;
    }

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public List<ConferenceRoom> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<ConferenceRoom> roomList) {
        this.roomList = roomList;
    }
}
