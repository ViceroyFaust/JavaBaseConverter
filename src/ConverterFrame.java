import javax.swing.*;
import java.awt.*;

public class ConverterFrame extends JFrame {

    public ConverterFrame() {
        init();
    }

    private void init() {
        setTitle("Base Converter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));


        setVisible(true);
    }

    public static void main(String[] args) {
        new ConverterFrame();
    }
}
