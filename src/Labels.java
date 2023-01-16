import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {
    public static void main(String[] args) {
        //JLabel = a GUI display area for a string of text , an image ,or both
        ImageIcon img1 = new ImageIcon("E:\\Web\\Java\\JavaGUI\\JavaGUI\\img1.jpeg");

        JLabel label = new JLabel();
        label.setText("HEY DO YOU EVEN CODE ?");//adds text automatically aligns text right And image left
        label.setIcon(img1);//sets image
        label.setHorizontalTextPosition(JLabel.CENTER);//sets text LEFT CENTER RIGHT of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP);//Set text TOP,CENTER,BOTTOM of ImageIcon

        //FONT STYLES
        label.setForeground(new Color(0x00FF00));//Sets font Color
        label.setFont(new Font("MV Boli",Font.BOLD,24));//Sets font styles type size

        label.setIconTextGap(40);//Sets gap between photo and text

        //BACKGROUND COLOR
        label.setBackground(Color.lightGray);//Sets background color
        label.setOpaque(true);//Enables background color
        //By Default our text and icon takes complete screen so black is 100%

        //BORDER
        Border border =BorderFactory.createLineBorder(Color.CYAN,4);
        label.setBorder(border);

        //Label Alignment
        label.setHorizontalAlignment(JLabel.LEFT);//alig ns text+ icon=Label to center x-axis
        label.setVerticalAlignment(JLabel.BOTTOM);//aligns text+icon=Label to center y-axis

        //LABEL SIZE
//        label.setBounds(0,0,300,300);//X , Y are coordinates
//        label.setBounds(0,0,350,350);//X , Y are coordinates

        JFrame frame = new JFrame();
        frame.setTitle("LABELS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500, 500);
//        frame.setLayout(null); //Sets layout so we can resize label dimensions
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.add(label);
        frame.pack();//Automatically gets to know to size of our label,etc and makes our job easier we dont need setLayout(),setSize() and setBounds()

    }
}
