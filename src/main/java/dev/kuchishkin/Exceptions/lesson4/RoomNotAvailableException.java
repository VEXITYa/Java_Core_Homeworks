package dev.kuchishkin.Exceptions.lesson4;


public class RoomNotAvailableException extends RuntimeException {
    public RoomNotAvailableException(String message) {
        super(message);
    }
}
