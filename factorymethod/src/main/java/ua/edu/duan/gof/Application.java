package ua.edu.duan.gof;

import ua.edu.duan.gof.button.Button;
import ua.edu.duan.gof.factory.ButtonFactory;

public class Application {
    public static void main(String[] args) {

        ButtonFactory buttonFactory = new ButtonFactory();

        Button htmlButton = buttonFactory.getButton(Device.WEB);
        Button windowsButton = buttonFactory.getButton(Device.WINDOWS);

        System.out.println("Test HTML Button");
        htmlButton.executeAction();

        System.out.println("Test Windows Button");
        windowsButton.executeAction();
    }
}
