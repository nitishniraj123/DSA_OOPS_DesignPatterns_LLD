package LLD.bookingConferenceRoom.services;

import LLD.bookingConferenceRoom.models.Booking;

public interface INotificationService {
    String NotifyAllUser(Booking booking);
}
