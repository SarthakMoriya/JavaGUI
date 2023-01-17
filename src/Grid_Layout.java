import javax.swing.*;
import java.awt.*;

public class Grid_Layout {
    //Places all components in a grid of cells.
    //Each component takes all the available space within its cell,
    //and each cell is the same size
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout()); //By default, 1 row and x columns
        frame.setLayout(new GridLayout(3, 3, 5, 5));
        //By default, 1 row and x columns

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        frame.setVisible(true);

    }
}
