package LLD.bookingConferenceRoom.services;

import LLD.bookingConferenceRoom.models.Floor;

public interface IManageFloorsService {
    String addFloors(Floor floor, int bId);
}
