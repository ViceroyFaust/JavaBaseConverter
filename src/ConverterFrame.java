import javax.swing.*;

public class ConverterFrame extends JFrame {
    private final BasePanel[] panels;
    private final Controller control;
    private final JPanel buttons;
    private final JButton convert;
    private final JButton clear;

    public ConverterFrame() {
        panels = new BasePanel[]{new BasePanel("Decimal", 10), new BasePanel("Hexadecimal", 16),
                new BasePanel("Duodecimal", 12), new BasePanel("Octal", 8),
                new BasePanel("Binary", 2)};
        control = new Controller(panels);
        buttons = new JPanel();
        convert = new JButton("Convert");
        clear = new JButton("Clear");

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

        convert.addActionListener(control);
        clear.addActionListener(control);
        buttons.add(convert);
        buttons.add(clear);

        for (BasePanel bp : panels) {
            add(bp);
        }
        add(buttons);

        pack();
        setVisible(true);
    }
}
