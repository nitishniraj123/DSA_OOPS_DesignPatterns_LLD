package LLD.bookingConferenceRoom.models;

import java.util.List;

public class Booking {
    private String userId;
    private String bookingId;
    private double startTime;
    private double endTime;
    private String biD;
    private String fid;

    private List<User> user ;

    public Booking(String userId, String bookingId, double startTime, double endTime, String biD, String fid, List<User> user) {
        this.userId = userId;
        this.bookingId = bookingId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.biD = biD;
        this.fid = fid;
        this.user = user;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public String getBiD() {
        return biD;
    }

    public void setBiD(String biD) {
        this.biD = biD;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "userId='" + userId + '\'' +
                ", bookingId=" + bookingId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", biD=" + biD +
                ", fid=" + fid +
                ", user=" + user +
                '}';
    }
}
