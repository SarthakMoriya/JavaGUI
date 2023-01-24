import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField_tut {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton btn = new JButton("Submit");
        JTextField txtField = new JTextField();
        txtField.setPreferredSize(new Dimension(250, 40));
        txtField.setForeground(Color.CYAN);
        txtField.setBackground(Color.DARK_GRAY);
        txtField.setCaretColor(Color.BLUE);//Border color on Focus
        txtField.setEditable(false);//let change or not ?


        btn.addActionListener(e -> {
            System.out.println("HELLO");

            System.out.println(txtField.getText());
        });

        frame.add(btn);
        frame.add(txtField);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLayout(new FlowLayout(FlowLayout.LEADING));
        frame.setVisible(true);

    }

}
