import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonFrame extends JFrame implements ActionListener {
    JRadioButton pizza = new JRadioButton("Pizza");
    JRadioButton burger = new JRadioButton("burger");
    JRadioButton hotdog = new JRadioButton("hotdog");

    RadioButtonFrame() {
        pizza.setFocusable(false);
        burger.setFocusable(false);
        hotdog.setFocusable(false);

        pizza.addActionListener(this);
        hotdog.addActionListener(this);
        burger.addActionListener(this);

//        pizza.setIcon(img)
//        pizza.setSelectedIcon(img2);

        ButtonGroup b1 = new ButtonGroup();
        b1.add(pizza);
        b1.add(burger);
        b1.add(hotdog);

        this.add(pizza);
        this.add(hotdog);
        this.add(burger);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200,200);
        this.setLayout(new FlowLayout());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizza){
            System.out.println("LOLO");
        }
    }
}
