import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{

   JLabel text;
   JLabel cardno;
   JLabel pinno;

   JTextField textfield1;
   JPasswordField pinfield;

   JButton login;
   JButton clear;
   JButton signup;

   Login() {
      this.setTitle("AUTOMATED TELLER MACHINE");
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
      Image i2 = i1.getImage().getScaledInstance(100, 100, 1);
      ImageIcon i3 = new ImageIcon(i2);

      JLabel label = new JLabel(i3);
      label.setBounds(70, 10, 100, 100);
      this.add(label);

      this.text = new JLabel("WELCOME TO ATM");
      this.text.setFont(new Font("Osward", 1, 38));
      this.text.setBounds(200, 40, 450, 40);
      this.add(this.text);


      this.cardno = new JLabel("Card No:");
      this.cardno.setFont(new Font("Raleway", 1, 28));
      this.cardno.setBounds(125, 150, 375, 30);

      this.add(this.cardno);


      this.textfield1 = new JTextField(15);
      this.textfield1.setBounds(300, 150, 230, 30);
      this.textfield1.setFont(new Font("Arial", 1, 14));
      this.add(this.textfield1);


      this.pinno = new JLabel("PIN:");
      this.pinno.setFont(new Font("Raleway", 1, 28));
      this.pinno.setBounds(125, 220, 375, 30);
      this.add(this.pinno);

      
      this.pinfield = new JPasswordField(15);
      this.pinfield.setFont(new Font("Arial", 1, 14));
      this.pinfield.setBounds(300, 220, 230, 30);
      this.add(this.pinfield);


      this.login = new JButton("SIGN IN");
      this.login.setBackground(Color.BLACK);
      this.login.setForeground(Color.WHITE);

      this.clear = new JButton("CLEAR");
      this.clear.setBackground(Color.BLACK);
      this.clear.setForeground(Color.WHITE);

      this.signup = new JButton("SIGN UP");
      this.signup.setBackground(Color.BLACK);
      this.signup.setForeground(Color.WHITE);

      this.setLayout((LayoutManager)null);
      this.login.setFont(new Font("Arial", 1, 14));
      this.login.setBounds(300, 300, 100, 30);
      this.add(this.login);

      this.clear.setFont(new Font("Arial", 1, 14));
      this.clear.setBounds(430, 300, 100, 30);
      this.add(this.clear);

      this.signup.setFont(new Font("Arial", 1, 14));
      this.signup.setBounds(300, 350, 230, 30);
      this.add(this.signup);

      this.login.addActionListener(this);
      this.clear.addActionListener(this);
      this.signup.addActionListener(this);

      this.getContentPane().setBackground(Color.WHITE);
      this.setSize(800, 480);
      this.setLocation(550, 200);
      this.setVisible(true);
   }

   public void actionPerformed(ActionEvent ae) {
      try {
         if (ae.getSource() == this.login) {
            
         } else if (ae.getSource() == this.clear) {
            this.textfield1.setText("");
            this.pinfield.setText("");
         } else if (ae.getSource() == this.signup) {
           
         }
      } catch (Exception var7) {
         
      }

   }
    public static void main(String[] args) {
        (new Login()).setVisible(true);
     }
}
