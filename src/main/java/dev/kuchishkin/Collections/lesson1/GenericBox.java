package dev.kuchishkin.Collections.lesson1;


public class GenericBox<T> {
    private T value;

    GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isEqual(GenericBox<T> other) {
        return this.value.equals(other.value);
    }

    public void swap(GenericBox<T> other) {
        T temp = this.value;
        this.value = other.value;
        other.value = temp;
    }
}
