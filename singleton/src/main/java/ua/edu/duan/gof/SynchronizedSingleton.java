package ua.edu.duan.gof;


public class SynchronizedSingleton {

    private int state;

    private static volatile SynchronizedSingleton instance;

    private SynchronizedSingleton() { }

    public static SynchronizedSingleton  getInstance() {
        if (instance == null) {
            synchronized (SynchronizedSingleton.class) {
                if(instance == null) {
                    instance = new SynchronizedSingleton();
                }
            }
        }

        return instance;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
