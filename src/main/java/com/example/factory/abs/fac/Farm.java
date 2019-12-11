package com.example.factory.abs.fac;

import com.example.factory.abs.prod.Animal;
import com.example.factory.abs.prod.Plant;

public interface Farm {

    Animal newAnimal();

    Plant newPlant();

}
