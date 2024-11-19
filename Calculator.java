import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JTextField t1, t2, t3;
    JButton b1, b2;
    
    Calculator(){
        JFrame f = new JFrame("Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        t1 = new JTextField();
        t1.setBounds(50, 50, 200, 30);
        
        t2 = new JTextField();
        t2.setBounds(50, 100, 200, 30);

        t3 = new JTextField();
        t3.setBounds(50, 150, 200, 30);
        t3.setEditable(false);

        b1 = new JButton("+");
        b1.setBounds(50, 200, 80, 40);
        
        b2 = new JButton("-");
        b2.setBounds(170, 200, 80, 40);

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setLocationRelativeTo(null);  // Center the window
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        try {
            String s1 = t1.getText();
            String s2 = t2.getText();

            int n1 = Integer.parseInt(s1); 
            int n2 = Integer.parseInt(s2); 

            int c = 0;
            if(e.getSource() == b1){
                c = n1 + n2;
            }
            else if(e.getSource() == b2){
                c = n1 - n2;
            }
            t3.setText(String.valueOf(c));
        } catch (NumberFormatException ex) {
            t3.setText("Invalid input");
        }
    }

    public static void main(String args[]){
        SwingUtilities.invokeLater(() -> new Calculator());
    }
}