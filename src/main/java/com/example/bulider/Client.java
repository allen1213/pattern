package com.example.bulider;

public class Client {

    public static void main(String[] args) {

        new StringBuilder();

        CommonHouse commonHouse = new CommonHouse();

        HighHouse highHouse = new HighHouse();

        HouseDirector houseDirector = new HouseDirector(commonHouse);

        houseDirector.direct();
    }

}
