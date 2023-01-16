import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonMainFrame extends JFrame implements ActionListener {
    JButton button =new JButton();
    buttonMainFrame(){
        ImageIcon img=new ImageIcon("E:\\Web\\Java\\JavaGUI\\JavaGUI\\thumb.jpg");
        button.setBounds(100,200,400,200);
        button.setBackground(Color.lightGray);
        button.addActionListener(this);
        button.setText("Im a Button!");//Set inner text
        button.setIcon(img);//Sets image
        button.setIconTextGap(-15);
        button.setFocusable(false);//Removes border
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalAlignment(JButton.RIGHT);
        button.setForeground(Color.CYAN);
        button.setFont(new Font("Comic Sans",Font.BOLD,29));
//        button.setBorder(BorderFactory.createLineBorder(Color.BLUE,4,true));
        button.setBorder(BorderFactory.createEtchedBorder());
//        button.setEnabled(false);//enable disable a button



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(700,700);
        this.setVisible(true);
        this.add(button);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Clicked!");
            button.setFocusable(true);
        }
    }
}
//Instead of writing implements Actions Listener and then overriding
// actionPerformed Method we can simply use
//button.addActionListener(e->sout("Clicked"))