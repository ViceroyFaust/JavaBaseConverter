import javax.swing.*;
import java.awt.*;

public class ConverterFrame extends JFrame {
    private final GridBagConstraints constraints;

    public ConverterFrame() {
        constraints = new GridBagConstraints();

        init();
    }

    private void init() {
        setTitle("Base Converter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());


        setVisible(true);
    }

    public static void main(String[] args) {

    }
}
