package com.example.bulider;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("CommonHouse buildBasic");
    }

    @Override
    public void buildWall() {
        System.out.println("CommonHouse buildWall");
    }

    @Override
    public void roofed() {
        System.out.println("CommonHouse roofed");
    }
}
