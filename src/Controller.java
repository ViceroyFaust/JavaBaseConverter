import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private final BasePanel[] bases;

    public Controller(BasePanel[] bases) {
        this.bases = bases;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toUpperCase()) {
            case "CONVERT":
                convert();
                break;
            case "CLEAR":
                clear();
                break;
            default:
        }
    }

    public void convert() {
        String input;
        int base = 0;
        int num = 0;
        for (BasePanel b : bases) { // Determine what base to convert from
            input = b.getText();
            base = b.getBase();
            if (!input.equals("")) {
                num = Bases.toDecimal(input, base);
                break;
            }
        }
        for (BasePanel b : bases) {
            if (b.getBase() != base) {
                b.setText(Bases.toBase(num, b.getBase()));
            }
        }
    }

    public void clear() {
        for (BasePanel b : bases) {
            b.setText("");
        }
    }
}
