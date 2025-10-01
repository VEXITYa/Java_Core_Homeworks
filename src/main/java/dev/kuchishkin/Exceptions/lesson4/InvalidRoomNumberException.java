package dev.kuchishkin.Exceptions.lesson4;


public class InvalidRoomNumberException extends RuntimeException{
    InvalidRoomNumberException(String message) {
        super(message);
    }
}
