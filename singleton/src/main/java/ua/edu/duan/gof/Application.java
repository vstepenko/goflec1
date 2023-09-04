package ua.edu.duan.gof;

public class Application {
    public static void main(String[] args) {
        System.out.println("TEST Singleton");

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.setState(10);

        System.out.println("Attempt 1");
        System.out.println(String.format("Singleton 1 state %d", singleton1.getState()));
        System.out.println(String.format("Singleton 2 state %d", singleton2.getState()));

        singleton2.setState(20);

        System.out.println("Attempt 2");
        System.out.println(String.format("Singleton 1 state %d", singleton1.getState()));
        System.out.println(String.format("Singleton 2 state %d", singleton2.getState()));
    }
}
