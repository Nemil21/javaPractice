
import java.awt.FlowLayout;
import java.awt.event.*; 
import javax.swing.*;
public class swings{
    public static void main(String args[]){
        JFrame f = new JFrame("User Form");
        f.setVisible(true);
        f.setSize(800,400);
        f.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Username:");
        f.add(l1);
        JTextField t1 = new JTextField(20);
        f.add(t1);
        JLabel l2 = new JLabel("Password:");
        f.add(l2);
        JTextField t2 = new JTextField(20);
        f.add(t2);

        JButton b = new JButton("Submit");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t1.setText("Confidential");
                t2.setText("Confidential");
            }
        }); 
        f.add(b);
    }
}
