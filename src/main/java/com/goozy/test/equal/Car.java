package com.goozy.test.equal;

import java.util.Objects;

public class Car {
    private String name;
    private int code;
    private String status;
    private Wheel wheel;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Car car = (Car) o;
        return code == car.code &&
            Objects.equals(name, car.name) &&
            Objects.equals(wheel, car.wheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, wheel);
    }
}
