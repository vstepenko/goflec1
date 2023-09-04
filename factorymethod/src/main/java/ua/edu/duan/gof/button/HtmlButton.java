package ua.edu.duan.gof.button;

public class HtmlButton implements Button{
    @Override
    public void executeAction() {
        System.out.println("I'm Html button");
    }
}
