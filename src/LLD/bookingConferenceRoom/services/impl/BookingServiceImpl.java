package LLD.bookingConferenceRoom.services.impl;

import LLD.bookingConferenceRoom.cache.BuildingsFloorRooms;
import LLD.bookingConferenceRoom.models.Booking;
import LLD.bookingConferenceRoom.services.IBookingService;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class BookingServiceImpl implements IBookingService {
    Logger logger = LoggerFactory.getLogger(BookingServiceImpl.class);
    BuildingsFloorRooms buildingsFloorRooms = BuildingsFloorRooms.getBuildingsFloorRooms();

    @Override
    public String bookRoom(Booking booking) {
            if(isBookingAvailable(booking)){

            }
            return null;
    }

    @Override
    public String cancelBooking(int bookingId) {
        return null;
    }

    @Override
    public String getAllBooking(String userId) {
        return null;
    }

    @Override
    public String getAllConferenceRoom(int buildingId) {
        return null;
    }

    private boolean isBookingAvailable(Booking booking){

        return false;
    }
}
