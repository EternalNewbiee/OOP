import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfRadius;
    private JTextField tfArea;
    private JTextField tfCircumference;
    private JButton btnClear;
    private JButton btnCompute;

    public static void main(String[] args) {
        CircleGUI app = new CircleGUI();
        app.setContentPane(app.pnlMain);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);

    }
    public CircleGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String r = tfRadius.getText();
                double a = (double) (Math.pow(Integer.parseInt(r), 2) * Math.PI);
                tfArea.setText(String.format("%.2f", a));
                double c = (double) (Integer.parseInt(r) * Math.PI) * 2;
                tfCircumference.setText(String.format("%.2f", c));
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfArea.setText("");
                tfCircumference.setText("");
            }
        });
    }
}
