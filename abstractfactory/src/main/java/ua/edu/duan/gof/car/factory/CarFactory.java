package ua.edu.duan.gof.car.factory;

import ua.edu.duan.gof.car.Coupe;
import ua.edu.duan.gof.car.Sedan;

public interface CarFactory {

    Sedan createSedan();

    Coupe createCoupe();
}
