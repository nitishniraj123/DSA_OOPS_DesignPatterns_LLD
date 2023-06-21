package LLD.bookingConferenceRoom.cache;
import LLD.bookingConferenceRoom.models.Booking;
import LLD.bookingConferenceRoom.models.Building;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public  class BuildingsFloorRooms {
    private static BuildingsFloorRooms buildingsFloorRooms = null;
    static Map<String, Building> buildings                  =   new HashMap<>();
    static Map<String, Booking> allBookingsByUsers          =   new HashMap<>();
    static Map<String,List<Booking>> bookedMeetingRoom      =   new HashMap<>();

    private BuildingsFloorRooms(){}

    public static BuildingsFloorRooms getBuildingsFloorRooms(){
        if(null == buildingsFloorRooms){
            synchronized (BuildingsFloorRooms.class){
                if(null == buildingsFloorRooms){
                    buildingsFloorRooms = new BuildingsFloorRooms();
                }
            }
        }
        return buildingsFloorRooms;
    }
}
