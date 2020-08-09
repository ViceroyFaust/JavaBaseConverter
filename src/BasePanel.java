import javax.swing.*;
import java.awt.*;

public class BasePanel extends JPanel {
    private final int spaces = 20;
    private final JLabel baseLabel;
    private final JTextField input;

    public BasePanel(String label) {
        baseLabel = new JLabel(label + ":");
        input = new JTextField(10);

        init();
    }

    private void init() {
        setLayout(new FlowLayout(FlowLayout.CENTER, spaces - baseLabel.getText().length(), 5));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(baseLabel);
        add(input);
    }

    public String getName() {
        String output = baseLabel.getText();
        return output.substring(0, output.length() - 1);
    }
}
