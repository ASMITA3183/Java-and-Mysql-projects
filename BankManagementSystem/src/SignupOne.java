
import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField; 
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class SignupOne extends  JFrame{
    
    SignupOne(){

        setLayout(null);
        Random ran = new Random();

        long  random =  Math.abs((ran.nextLong()) % (9000L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO : " + random);
        formno.setFont(new Font("railway" ,Font.BOLD , 38));
        formno.setBounds(140 , 20 , 600 ,40);
        add(formno);

        JLabel PersonalDetails = new JLabel("Page 1 : Personal Details"  );
        PersonalDetails .setFont(new Font("railway" ,Font.BOLD , 22));
        PersonalDetails .setBounds(290 , 80 , 400 ,30);
        add(PersonalDetails );

        JLabel name = new JLabel("Name : "  );
        name.setFont(new Font("railway" ,Font.BOLD , 20));
        name.setBounds(100, 140 , 100 ,30);
        add(name);

        JTextField nameTextfield = new JTextField();
        nameTextfield.setFont(new Font("Railway" ,Font.BOLD , 14));
        nameTextfield.setBounds(300 ,140 , 400 , 30);
        add(nameTextfield);

        JLabel Fname = new JLabel("Fathers Name : "  );
        Fname.setFont(new Font("railway" ,Font.BOLD , 20));
        Fname.setBounds(100, 190 , 150 ,30);
        add(Fname );

        JTextField FnameTextfield = new JTextField();
        FnameTextfield.setFont(new Font("Railway" ,Font.BOLD , 14));
        FnameTextfield.setBounds(300 ,190 , 400 , 30);
        add(FnameTextfield);

        JLabel dob = new JLabel("Date of Birth : "  );
        dob.setFont(new Font("railway" ,Font.BOLD , 20));
        dob.setBounds(100, 240 , 150 ,30);
        add(dob);

        JDateChooser datechooser = new JDateChooser();
        datechooser.setBounds(300 ,240 ,400 ,30) ;
        add(datechooser);
        datechooser.setForeground(Color.GRAY);

        JLabel gender = new JLabel("Gender : "  );
        gender.setFont(new Font("railway" ,Font.BOLD , 20));
        gender.setBounds(100, 290 , 150 ,30);
        add(gender);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        male.setBounds(300 ,290 ,60 ,30);
        male.setBackground(Color.white);
        female.setBounds(450 ,290 ,120 ,30);
        female.setBackground(Color.white);

        add(male);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();

        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email = new JLabel("Email : "  );
        email.setFont(new Font("railway" ,Font.BOLD , 20));
        email.setBounds(100, 340 , 150 ,30);
        add(email);

        JTextField mailTextfield = new JTextField();
        mailTextfield.setFont(new Font("Railway" ,Font.BOLD , 14));
        mailTextfield.setBounds(300 ,340 , 400 , 30);
        add(mailTextfield);

        JLabel maritals = new JLabel("Marital Status : "  );
        maritals.setFont(new Font("railway" ,Font.BOLD , 20));
        maritals.setBounds(100, 390 , 150 ,30);
        add(maritals);

        JRadioButton married = new JRadioButton("Married");
        JRadioButton unmarried = new JRadioButton("Unmarried");
        JRadioButton other = new JRadioButton("Other");

        married.setBounds(300 ,390 ,100 ,30);
        married.setBackground(Color.white);
        unmarried.setBounds(450 ,390 ,100 ,30);
        unmarried.setBackground(Color.white);
        other.setBounds(600 ,390 ,60 ,30);
        other.setBackground(Color.white);

        add(married);
        add(unmarried);
        add(other);

        ButtonGroup maritalstatusgroup = new ButtonGroup();

        maritalstatusgroup.add(married);
        maritalstatusgroup.add(unmarried);
        maritalstatusgroup.add(other);

        JLabel address = new JLabel("Address : "  );
        address.setFont(new Font("railway" ,Font.BOLD , 20));
        address.setBounds(100, 440 , 150 ,30);
        add(address);

        JTextField addressTextfield = new JTextField();
        addressTextfield.setFont(new Font("Railway" ,Font.BOLD , 14));
        addressTextfield.setBounds(300 ,440 , 400 , 30);
        add(addressTextfield);

        JLabel city = new JLabel("City : "  );
        city.setFont(new Font("railway" ,Font.BOLD , 20));
        city.setBounds(100, 490 , 150 ,30);
        add(city);

        JTextField cityTextfield = new JTextField();
        cityTextfield.setFont(new Font("Railway" ,Font.BOLD , 14));
        cityTextfield.setBounds(300 ,490 , 400 , 30);
        add(cityTextfield);

        JLabel state = new JLabel("State : "  );
        state.setFont(new Font("railway" ,Font.BOLD , 20));
        state.setBounds(100, 540 , 150 ,30);
        add(state);

        JTextField stateTextfield = new JTextField();
        stateTextfield.setFont(new Font("Railway" ,Font.BOLD , 14));
        stateTextfield.setBounds(300 ,540 , 400 , 30);
        add(stateTextfield);

        JLabel pincode = new JLabel("Pincode : "  );
        pincode.setFont(new Font("railway" ,Font.BOLD , 20));
        pincode.setBounds(100, 590 , 150 ,30);
        add(pincode);

        JTextField pinTextfield = new JTextField();
        pinTextfield.setFont(new Font("Railway" ,Font.BOLD , 14));
        pinTextfield.setBounds(300 ,590 , 400 , 30);
        add(pinTextfield);


        JButton next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Railway" ,Font.BOLD ,14));
        next.setBounds(620, 660, 80, 30);

        add(next);

        getContentPane().setBackground(Color.white);

        setSize(850 ,800);
        setLocation(350 ,10);
        setVisible(true);



    }
    public static void main(String args[]){
        new SignupOne();
    }
}
