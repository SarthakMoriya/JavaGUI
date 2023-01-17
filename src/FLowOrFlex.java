import javax.swing.*;
import java.awt.*;

public class FLowOrFlex {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
//        frame.setLayout(new FlowLayout());//FLEX BOX
//        frame.setLayout(new FlowLayout(FlowLayout.TRAILING));//LEADING,CENTER,RIGHT
        // ,LEFT,TRAILING
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));//Horizontal , Vertical Margin


        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);

        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.DARK_GRAY);

    }
}
