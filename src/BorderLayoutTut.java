import javax.swing.*;
import java.awt.*;

public class BorderLayoutTut {
    public static void main(String[] args) {
        //BorderLayout == a Layout places components in five areas :NORTH,SOUTH
        // ,WEST , EAST , CENTER  . All extra space is placed in the center area.
        //to bring some  sort of responsiveness

        JFrame frame = new JFrame();
//        frame.setLayout(new BorderLayout());
        frame.setLayout(new BorderLayout(10, 10));//margin in width height
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);
        panel3.setBackground(Color.CYAN);
        panel4.setBackground(Color.green);
        panel5.setBackground(Color.magenta);

        //------------SUB PANEL ------------------//
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.DARK_GRAY);
        panel7.setBackground(Color.ORANGE);
        panel8.setBackground(Color.pink);
        panel9.setBackground(new Color(255, 213, 198));
        panel10.setBackground(new Color(255, 255, 0));

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        //Parent -- Panel 5
        panel5.setLayout(new BorderLayout());

        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.WEST);
        panel5.add(panel8,BorderLayout.SOUTH);
        panel5.add(panel9,BorderLayout.EAST);
        panel5.add(panel10,BorderLayout.CENTER);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);


    }
}

//SO border layout are simply containers to contain panels for this we just
// need to set parent's layout to borderlayout();
