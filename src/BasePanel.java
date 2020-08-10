import javax.swing.*;
import java.awt.*;

public class BasePanel extends JPanel {
    private final JLabel baseLabel;
    private final JTextField input;

    public BasePanel(String label) {
        baseLabel = new JLabel(label + ":");
        input = new JTextField(10);

        init();
    }

    private void init() {
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new FlowLayout(FlowLayout.TRAILING));
        setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        add(baseLabel);
        add(input);
    }

    public String getName() {
        String output = baseLabel.getText();
        return output.substring(0, output.length() - 1);
    }
}
