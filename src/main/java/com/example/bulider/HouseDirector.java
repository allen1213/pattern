package com.example.bulider;

public class HouseDirector {

    HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House direct() {
        houseBuilder.buildBasic();
        houseBuilder.buildWall();;
        houseBuilder.roofed();
        return houseBuilder.build();
    }

}
