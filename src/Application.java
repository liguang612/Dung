import java.awt.Font;

import javax.swing.UIManager;

import controller.controllerHomepage;
import model.modelHomepage;
import view.viewHomepage;

public class Application {
    public static void main(String[] args) {
        UIManager.put("Label.font", new Font("Segoe UI", Font.PLAIN, 17));
        UIManager.put("Button.font", new Font("Segoe UI", Font.BOLD, 14));
        UIManager.put("CheckBox.font", new Font("Times New Roman", Font.PLAIN, 13));
        UIManager.put("ComboBox.font", new Font("Times New Roman", Font.PLAIN, 17));
        UIManager.put("Menu.font", new Font("Times New Roman", Font.PLAIN, 14));
        UIManager.put("MenuItem.font", new Font("Times New Roman", Font.PLAIN, 13));
        UIManager.put("TextArea.font", new Font("Times New Roman", Font.PLAIN, 17));
        UIManager.put("TextField.font", new Font("Times New Roman", Font.PLAIN, 17));

        viewHomepage vHomepage = new viewHomepage(new modelHomepage());
        new controllerHomepage(vHomepage);
    }
}