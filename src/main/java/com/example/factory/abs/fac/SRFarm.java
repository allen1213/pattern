package com.example.factory.abs.fac;

import com.example.factory.abs.prod.*;

public class SRFarm implements Farm{
    @Override
    public Animal newAnimal() {
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        return new Fruit();
    }
}
