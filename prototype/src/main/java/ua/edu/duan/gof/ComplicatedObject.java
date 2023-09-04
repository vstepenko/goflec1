package ua.edu.duan.gof;

import java.util.ArrayList;
import java.util.List;

public class ComplicatedObject {

    private int num;

    private List<String> listString;

    public void setListString(List<String> listString) {
        this.listString = listString;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ComplicatedObject copy() {
        ComplicatedObject complicatedobject = new ComplicatedObject();
        complicatedobject.setNum(num);

        List<String> newListString = new ArrayList<>();

        for(String listStringElem:  listString) {
            newListString.add(listStringElem);
        }

        complicatedobject.setListString(newListString);

        return complicatedobject;
    }

}
