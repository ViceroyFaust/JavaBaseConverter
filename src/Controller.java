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

    public int convert() {
        String input = new String();
        int base = 0;
        for (BasePanel b : bases) {
            input = b.getText();
            base = b.getBase();
            if (!input.equals("")) {
                break;
            }
        }
        return 0;
    }

    public void clear() {
        for (BasePanel b : bases) {
            b.setText("");
        }
    }
}
