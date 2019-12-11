package com.example.factory.abs.fac;

import com.example.factory.abs.prod.Animal;
import com.example.factory.abs.prod.Cattle;
import com.example.factory.abs.prod.Plant;
import com.example.factory.abs.prod.Vegetable;

public class SGFarm implements Farm {
    @Override
    public Animal newAnimal() {
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        return new Vegetable();
    }
}
