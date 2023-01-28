import javax.swing.*;
import java.awt.*;

public class CheckBox {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        JButton btn = new JButton("SUBMIT!");
        JCheckBox c1 = new JCheckBox("Are you Gay?");

        c1.setFocusable(false);
        c1.setBackground(Color.DARK_GRAY);

//         ImageIcon img=new ImageIcon("XYZ.png");
//        c1.setIcon(img) //Default icon tick or cross
//        c1.setSelectedIcon(img2);//icon on true checkBox
        btn.addActionListener(e -> {
            System.out.println(c1.isSelected());
        });

        myFrame.add(btn);
        myFrame.add(c1);
        myFrame.setLayout(new FlowLayout());
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
    }
}
