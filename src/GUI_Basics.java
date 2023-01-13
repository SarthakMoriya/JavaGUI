import javax.swing.*;
import java.awt.*;

public class GUI_Basics {
    public static void main(String[] args) {
        //JFrame = A GUI window to add components

        //Creates  instance of JFrame CLass
        JFrame frame = new JFrame();
        frame.setTitle("A XYZ Title");//Set title

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes Completely

        frame.setResizable(false); //Makes resizing unable

        frame.setSize(240, 240); //Set the x-dimension and y-dimension

        frame.setVisible(true);// Makes our frame visible

        ImageIcon image=new ImageIcon("logo.png");
        frame.setIconImage(image.getImage()); // sets logo of our frame

        frame.getContentPane().setBackground(Color.CYAN); //Sets background Color
    }
}

//        By Default closes the frame but program still runs
//        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//Does nothing on clicking Cross Button
//        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//Hides Frame