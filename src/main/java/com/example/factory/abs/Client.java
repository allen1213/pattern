package com.example.factory.abs;

import com.example.factory.abs.fac.Farm;
import com.example.factory.abs.fac.SGFarm;

public class Client {

    public static void main(String[] args) {
        Farm farm = new SGFarm();
        farm.newAnimal();
    }
}
