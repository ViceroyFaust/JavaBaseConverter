import javax.swing.*;

public class ConverterFrame extends JFrame {
    private final BasePanel[] panels;

    public ConverterFrame() {
        panels = new BasePanel[]{new BasePanel("Decimal", 10), new BasePanel("Hexadecimal", 16),
                new BasePanel("Duodecimal", 12), new BasePanel("Octal", 8),
                new BasePanel("Binary", 2)};

        init();
    }

    public static void main(String[] args) {
        new ConverterFrame();
    }

    private void init() {
        setTitle("Base Converter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));

        for (BasePanel bp : panels) {
            add(bp);
        }

        pack();
        setVisible(true);
    }
}
