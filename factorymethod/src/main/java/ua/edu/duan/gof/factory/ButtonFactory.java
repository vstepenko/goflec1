package ua.edu.duan.gof.factory;

import ua.edu.duan.gof.Device;
import ua.edu.duan.gof.button.Button;
import ua.edu.duan.gof.button.HtmlButton;
import ua.edu.duan.gof.button.WindowsButton;

public class ButtonFactory {

    public Button getButton(Device device) {
        switch (device) {
            case WEB:
                return new HtmlButton();
            case WINDOWS:
                return new WindowsButton();
        }
        throw new IllegalArgumentException();
    }
}
