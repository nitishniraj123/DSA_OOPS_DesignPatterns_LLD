package LLD.bookingConferenceRoom.models;

import java.util.List;

public class Building {
    private String bId;
    private List<Floor> floorList;

    public Building(String bId, List<Floor> floorList) {
        this.bId = bId;
        this.floorList = floorList;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    }

    @Override
    public String toString() {
        return "Building{" +
                "bId=" + bId +
                ", floorList=" + floorList +
                '}';
    }
}
