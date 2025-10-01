package dev.kuchishkin.Exceptions.lesson4;


public class Hotel {
    private boolean[] bookedRooms;
    private final static int AMOUNT_OF_ROOMS = 100;

    public Hotel() {
        bookedRooms = new boolean[AMOUNT_OF_ROOMS];
    }

    public String bookRoom(int roomNumber) throws InvalidRoomNumberException, RoomNotAvailableException {
        if (roomNumber < 1 || roomNumber > AMOUNT_OF_ROOMS) {
            throw new InvalidRoomNumberException("Invalid room number: " + roomNumber + "; Room number should be between 1 and " + AMOUNT_OF_ROOMS);
        }
        if (bookedRooms[roomNumber - 1]) {
            throw new RoomNotAvailableException("Room number " + roomNumber + " is already booked");
        }
        bookedRooms[roomNumber - 1] = true;
        return ("Room number " + roomNumber + " booked successfully");
    }
}
