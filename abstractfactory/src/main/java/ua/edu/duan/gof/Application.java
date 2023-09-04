package ua.edu.duan.gof;

import ua.edu.duan.gof.car.Coupe;
import ua.edu.duan.gof.car.Sedan;
import ua.edu.duan.gof.car.factory.CarFactory;
import ua.edu.duan.gof.car.factory.FordFactory;
import ua.edu.duan.gof.car.factory.ToyotaFactory;

public class Application {

    public static void main(String[] args) {

        CarFactory toyotaFactory = new ToyotaFactory();

        System.out.println("TOYOTA");
        Coupe toyotaCoupe = toyotaFactory.createCoupe();
        Sedan toyotaSedan = toyotaFactory.createSedan();

        CarFactory fordFactory = new FordFactory();

        System.out.println("FORD");
        Coupe fordCoupe = fordFactory.createCoupe();
        Sedan fordSedan = fordFactory.createSedan();
    }
}
