import javax.swing.*;
import java.awt.*;

public class BasePanel extends JPanel {
    private final JLabel baseLabel;
    private final JTextField input;
    private final int base;

    public BasePanel(String label, int base) {
        baseLabel = new JLabel(label + ":");
        input = new JTextField(10);
        this.base = base;

        init();
    }

    private void init() {
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new FlowLayout(FlowLayout.TRAILING));
        setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        add(baseLabel);
        add(input);
    }

    public String getText() {
        return input.getText();
    }

    public void setText(String text) {
        input.setText(text);
    }

    public int getBase() {
        return base;
    }

}
