package ua.edu.duan.gof;

import java.util.Collections;

public class Application {
    public static void main(String[] args) {
        ComplicatedObject complicatedObject1 = new ComplicatedObject();

        complicatedObject1.setNum(100);
        complicatedObject1.setListString(Collections.singletonList("elem1"));

        ComplicatedObject complicatedObject2 = complicatedObject1.copy();
    }
}
