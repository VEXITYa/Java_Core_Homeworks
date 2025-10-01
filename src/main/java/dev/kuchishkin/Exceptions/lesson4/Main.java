package dev.kuchishkin.Exceptions.lesson4;


public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println(hotel.bookRoom(1));
        try {
            System.out.println(hotel.bookRoom(1));
        } catch (InvalidRoomNumberException | RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(hotel.bookRoom(0));
        } catch (InvalidRoomNumberException | RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(hotel.bookRoom(132));
        } catch (InvalidRoomNumberException | RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
