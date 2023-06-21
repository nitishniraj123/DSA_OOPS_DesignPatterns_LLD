package LLD.bookingConferenceRoom.services;

import LLD.bookingConferenceRoom.models.Booking;

public interface IBookingService {
    String bookRoom(Booking booking);
    String cancelBooking(int bookingId);

    String getAllBooking(String userId);

    String getAllConferenceRoom(int buildingId);

}
