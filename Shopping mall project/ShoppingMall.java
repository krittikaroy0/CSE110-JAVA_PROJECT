package shopping.mall;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShoppingMall extends Frame implements ActionListener {

    JTextField tf, username, userTF, userpass, userpassTF;
    JLabel l;
    JButton b, b1;
    JFrame f;
    JRadioButton rb1, rb2;

    ShoppingMall() {
        JFrame f = new JFrame("Shopping Mall Management System");
        final JTextField tf = new JTextField();
        tf.setBounds(200, 20, 100, 10);

        JLabel username = new JLabel("Customer's Name:");
        username.setBounds(200, 140, 200, 40);
        JTextField userTF = new JTextField();
        userTF.setBounds(200, 170, 200, 60);

        JLabel usergender = new JLabel("Gender:");
        usergender.setBounds(600, 200, 200, 40);
        f.add(usergender);

        JRadioButton r1 = new JRadioButton("A) Male");
        JRadioButton r2 = new JRadioButton("B) Female");
        r1.setBounds(600, 240, 200, 40);
        r2.setBounds(600, 270, 200, 60);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        f.add(r1);
        f.add(r2);

        JLabel usercountry = new JLabel("Country name:");
        usercountry.setBounds(600, 350, 200, 40);
        f.add(usercountry);
        String Country[] = {"Bangladesh", "India", "Aus", "U.S.A", "England", "Newzealand","Pakistan"};
        JComboBox cb1 = new JComboBox(Country);
        cb1.setBounds(600, 400, 150, 40);
        f.add(cb1);

        JPasswordField valueaddress = new JPasswordField();
        valueaddress.setBounds(200, 300, 200, 60);
        JLabel useraddress = new JLabel("Email Address:");
        useraddress.setBounds(200, 250, 200, 40);
        JTextField useraddressTF = new JTextField();
        useraddressTF.setBounds(200, 300, 200, 60);

        JPasswordField valuepn = new JPasswordField();
        valuepn.setBounds(200, 400, 200, 60);
        JLabel userpn = new JLabel("Phone Number:");
        userpn.setBounds(200, 350, 200, 40);
        JTextField userpnTF = new JTextField();
        userpnTF.setBounds(200, 400, 200, 60);

        JPasswordField valuepass = new JPasswordField();
        valuepass.setBounds(200, 500, 200, 60);
        JLabel userpass = new JLabel("Password:");
        userpass.setBounds(200, 450, 200, 40);
        JTextField userpassTF = new JTextField();
        userpassTF.setBounds(200, 500, 200, 60);

        b = new JButton("Login");
        b.setBounds(400, 650, 200, 60);
        b.addActionListener(this);

        f.add(username);
        f.add(userTF);

        f.add(useraddress);
        f.add(valueaddress);
        //f.add(useraddressTF);

        f.add(valuepn);
        f.add(userpn);

        f.add(valuepass);
        f.add(userpass);

        f.add(b);

        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new ShoppingMall();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        try {

            new ShoppingMall1();

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
