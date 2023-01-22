import javax.swing.*;

public class JOption_tut {
    public static void main(String[] args) {
//        JOptionPane pops up a standard dialog box that warns or promts user for
//        value or informs them

//        JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"THis is to inform you that you are a NOOB!","Title",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"THis is to inform you that you are a NOOB!","Title",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"THis is to inform you that you are a NOOB!","Title",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"THis is to inform you that you are a NOOB!","Title",JOptionPane.ERROR_MESSAGE);

        //YES NO CANCEL
//        JOptionPane.showConfirmDialog(null,"Two years ago you were Gay?","Gay",JOptionPane.YES_NO_CANCEL_OPTION);

        //INPUT PANE
//        String name=JOptionPane.showInputDialog("What is your name");
//        System.out.println(name);

        //OPTION DIALOGS
        String[] options = {"1", "2", "3"};
//        JOptionPane.showOptionDialog(null,"Are you good cooker?","Tittllee",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,null,null);
        JOptionPane.showOptionDialog(null, "Are you good cooker?", "Tittllee", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);
    }
}
