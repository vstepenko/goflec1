package ua.edu.duan.gof.car.factory;

import ua.edu.duan.gof.car.Coupe;
import ua.edu.duan.gof.car.Sedan;
import ua.edu.duan.gof.car.toyota.ToyotaCoupe;
import ua.edu.duan.gof.car.toyota.ToyotaSedan;

public class ToyotaFactory implements CarFactory {

    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }
}
