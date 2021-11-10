package racingcar;

import java.util.Objects;

public class Car {
    public static final int STOP_LOWER_BOUNDARY = 0;
    public static final int RUN_LOWER_BOUNDARY = 4;
    public static final int RUN_UPPER_BOUNDARY = 10;

    public static final int START_POINT = 0;

    private final int number;
    private int distance;

    public Car(int number) {
        this.number = number;
        this.distance = START_POINT;
    }

    public void initialize() {
        this.distance = START_POINT;
    }

    public int runOrStop(int number) {
        if (number < STOP_LOWER_BOUNDARY || number > RUN_UPPER_BOUNDARY) {
            throw new IllegalArgumentException("Random Number should be between 0 to 10.");
        }

        if (number >= RUN_LOWER_BOUNDARY) {
            distance++;
        }

        return distance;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Car car = (Car) obj;
        return number == car.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Car(" + this.number + ") → ";
    }
}
