package LLD.bookingConferenceRoom.models;

public class User {
    private String uId;
    private String userEmail;
    private String userDisplayName;

    public User(String uId, String userEmail, String userDisplayName) {
        this.uId = uId;
        this.userEmail = userEmail;
        this.userDisplayName = userDisplayName;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + uId + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userDisplayName='" + userDisplayName + '\'' +
                '}';
    }
}
