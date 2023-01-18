import javax.swing.*;
import java.awt.*;

public class Layered_Pane {
    public static void main(String[] args) {
//        JLayeredPlane provides third dimension  for positioning components z-index
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setBounds(50,50,200,200);
        p2.setBounds(100,100,200,200);
        p3.setBounds(150,150,200,200);

        p1.setBackground(Color.DARK_GRAY);
        p2.setBackground(Color.ORANGE);
        p3.setBackground(Color.pink);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);

/*
        layeredPane.add(p1);
        layeredPane.add(p2);
        layeredPane.add(p3);
*/
        layeredPane.add(p1,Integer.valueOf(0));
        layeredPane.add(p2,Integer.valueOf(2));
        layeredPane.add(p3,Integer.valueOf(1));

        JFrame frame = new JFrame();
        frame.add(layeredPane);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

//By default the component added first is on top followed by rest
//However we can change this