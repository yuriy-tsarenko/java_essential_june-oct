package com.java_essential.examples.lesson8;

import com.java_essential.examples.lesson8.example.Bike;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class FinalDemo {
    private final Bike bike;

    public void setBikeId(int id) {
        this.bike.setId(id);
    }

    //ошибка компиляции
    //    public void changeValue(){
    //        Bike bike = new Bike(1, "aa", new Vehicle(1, ""));
    //        this.bike=bike;
    //    }
}
