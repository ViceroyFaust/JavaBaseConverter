import javax.swing.*;

public class ConverterFrame extends JFrame {
    private final BasePanel decimalPanel;
    private final BasePanel hexPanel;
    private final BasePanel duoPanel;
    private final BasePanel octalPanel;
    private final BasePanel binaryPanel;

    public ConverterFrame() {
        decimalPanel = new BasePanel("Decimal");
        hexPanel = new BasePanel("Hexadecimal");
        duoPanel = new BasePanel("Duodecimal");
        octalPanel = new BasePanel("Octal");
        binaryPanel = new BasePanel("Binary");

        init();
    }

    private void init() {
        setTitle("Base Converter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        add(decimalPanel);
        add(hexPanel);
        add(duoPanel);
        add(octalPanel);
        add(binaryPanel);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConverterFrame();
    }
}
