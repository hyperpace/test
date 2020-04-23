package com.goozy.test.equal;

import java.util.Objects;

public class Wheel {
    private String name;
    private String code;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Wheel wheel = (Wheel) o;
        return Objects.equals(name, wheel.name) &&
            Objects.equals(code, wheel.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code);
    }
}
