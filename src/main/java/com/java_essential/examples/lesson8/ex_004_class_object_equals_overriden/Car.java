package com.java_essential.examples.lesson8.ex_004_class_object_equals_overriden;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Car {
    private int id;
    private String string;
    private String name;

    public Car(int id, String string) {
        this.id = id;
        this.string = string;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.string);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        //        if (!(obj instanceof Car)) { эквивалентная запись
        //            return false;
        //        }

        final Car other = (Car) obj;

        if (!Objects.equals(this.id, other.id)) {
            return false;
        }

        if (!Objects.equals(this.string, other.string)) {
            return false;
        }
        return true;
    }
}
