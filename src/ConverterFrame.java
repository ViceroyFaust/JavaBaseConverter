import javax.swing.*;

public class ConverterFrame extends JFrame {
    private final BasePanel[] panels;

    public ConverterFrame() {
        panels = new BasePanel[]{new BasePanel("Decimal"), new BasePanel("Hexadecimal"),
                new BasePanel("Duodecimal"), new BasePanel("Octal"), new BasePanel("Binary")};

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
