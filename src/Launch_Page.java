import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launch_Page implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");

    Launch_Page() {
        button.setBounds(100, 100, 200, 50);
        button.addActionListener(this);

        frame.add(button);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            frame.dispose();
            New_Window_Opener myWindow=new New_Window_Opener();
        }
    }
}
