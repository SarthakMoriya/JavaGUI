import javax.swing.*;
import java.awt.*;

public class OptionsList {
    public static void main(String[] args) {
        String[] animals = {"Dogs", "Cats", "Humans"};
        //If we want to store integers we use Integer[] ops={}
        //If we want to store  we use Float[] ops={}
        //If we want to store doubles we use Double[] ops={}

        JComboBox box = new JComboBox(animals);
        box.setSize(250, 100);
        box.addActionListener(e -> {
            System.out.println(box.getSelectedItem());
            System.out.println(box.getSelectedIndex());
        });
        box.setEditable(true);
        box.addItem("Horse");
        box.insertItemAt("Spiders", 3);
        JFrame frame = new JFrame();
        frame.add(box);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.pack();
        frame.setVisible(true);

    }
}
