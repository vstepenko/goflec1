package ua.edu.duan.gof.car.factory;

import ua.edu.duan.gof.car.Coupe;
import ua.edu.duan.gof.car.Sedan;
import ua.edu.duan.gof.car.ford.FordCoupe;
import ua.edu.duan.gof.car.ford.FordSedan;

public class FordFactory implements CarFactory {

    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }
}
