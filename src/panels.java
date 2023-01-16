import javax.swing.*;
import java.awt.*;

public class panels {
    public static void main(String[] args) {
        ImageIcon image=new ImageIcon("E:\\Web\\Java\\JavaGUI\\JavaGUI\\thumb.jpg");

        JLabel label1=new JLabel();
        label1.setText("LABEL 1");
        label1.setIcon(image);
        //Only Effective if the corresponding Panel's Layout is set to somthing like BorderLayout (Here)
        label1.setHorizontalAlignment(JLabel.RIGHT);
        label1.setVerticalAlignment(JLabel.TOP);
        JLabel label2=new JLabel();
        label2.setText("LABEL 1");
        label2.setIcon(image);
        label2.setBounds(100,100,147,170);
        label2.setHorizontalAlignment(JLabel.RIGHT);
        label2.setVerticalAlignment(JLabel.TOP);

        JLabel label3=new JLabel();
        label3.setText("LABEL 1");
        label3.setIcon(image);
        //Only Effective if the corresponding Panel's Layout is set to somthing like BorderLayout (Here)
        label3.setHorizontalAlignment(JLabel.RIGHT);
        label3.setVerticalAlignment(JLabel.TOP);


//        JPanel --  GUI to make containers to hold other components
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        //Either setLayout(new BorderLayout)) or setLayout(null) and then setBounds() on the label assigned this panel
        redPanel.setLayout(null);

        JPanel bluePanel =new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(new BorderLayout());

        JPanel greenPanel =new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        //to adjust the label or the components inside a panel we need some layout like
        // BorderLayout which is similar to JFrame Layout
        greenPanel.setLayout(new BorderLayout()); //then only we can use the
        // vertical,horizontal alignment of the label added in that panel
        //like JFrame ,default it is center on x and y-axis


        JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(null);
        myFrame.setSize(1000, 1000);
        myFrame.setVisible(true);
        myFrame.add(redPanel);
        myFrame.add(bluePanel);
        myFrame.add(greenPanel);
        greenPanel.add(label1);
        redPanel.add(label2);
        bluePanel.add(label3);
//        myFrame.add(label1);
    }
}
