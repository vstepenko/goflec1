package ua.edu.duan.gof.button;

public class WindowsButton implements Button{
    @Override
    public void executeAction() {
        System.out.println("I'm Windows button");
    }
}
