package shopping.mall;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShoppingMall3 extends Frame implements ActionListener {

    JButton b, b1, b2, bx, by;
    JTextField tf1, tf2, tf3;

    ShoppingMall3() {
        JFrame f = new JFrame("Invoice - Shopping Mall Management System");

        JLabel userselectit = new JLabel("Select Products:");
        userselectit.setBounds(20, 260, 200, 60);
        f.add(userselectit);

        JCheckBox checkBox1 = new JCheckBox("Vegetables");
        checkBox1.setBounds(100, 270, 150, 100);
        JCheckBox checkBox2 = new JCheckBox("  Fruits ");
        checkBox2.setBounds(300, 270, 150, 100);
        JCheckBox checkBox3 = new JCheckBox("Rice ");
        checkBox3.setBounds(100, 350, 150, 100);
        JCheckBox checkBox4 = new JCheckBox("Oil ");
        checkBox4.setBounds(300, 350, 150, 100);
        JCheckBox checkBox5 = new JCheckBox(" Medicen ");
        checkBox5.setBounds(100, 430, 150, 100);
        JCheckBox checkBox6 = new JCheckBox("Dress");
        checkBox6.setBounds(300, 430, 150, 100);
        f.add(checkBox1);
        f.add(checkBox2);
        f.add(checkBox3);
        f.add(checkBox4);
        f.add(checkBox5);
        f.add(checkBox6);

        JLabel userpricecount = new JLabel("Count Bill:");
        userpricecount.setBounds(50, 10, 150, 40);
        f.add(userpricecount);

        JLabel userprice = new JLabel("Bill 1 :");
        userprice.setBounds(50, 40, 150, 40);
        f.add(userprice);

        tf1 = new JTextField();
        tf1.setBounds(100, 60, 150, 20);

        JLabel userbill1 = new JLabel(" Others Bill  :");
        userbill1.setBounds(50, 100, 150, 40);
        f.add(userbill1);

        tf2 = new JTextField();
        tf2.setBounds(140, 120, 150, 20);

        JLabel uservat = new JLabel("total Bill with 25% vat:");
        uservat.setBounds(50, 130, 250, 40);
        f.add(uservat);
        tf3 = new JTextField();
        tf3.setBounds(180, 150, 200, 20);
        tf3.setEditable(false);

        b1 = new JButton("+");
        b1.setBounds(50, 200, 150, 50);

        b2 = new JButton("-");
        b2.setBounds(250, 200, 150, 50);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);

        bx = new JButton("Back");
        bx.setBounds(20, 900, 100, 30);
        bx.addActionListener(this);
        f.add(bx);
        bx.setLayout(null);
        bx.setVisible(true);

        by = new JButton("Next");
        by.setBounds(600, 900, 100, 30);
        by.addActionListener(this);
        f.add(by);

        JLabel userbp = new JLabel("Bill Payment:");
        userbp.setBounds(50, 540, 200, 60);
        f.add(userbp);
        JRadioButton r1 = new JRadioButton("A) Cash");
        JRadioButton r2 = new JRadioButton("B) Card");
        r1.setBounds(50, 590, 200, 40);
        r2.setBounds(50, 640, 200, 60);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        f.add(r1);
        f.add(r2);

        String data[][] = {{"SL NO", "STOCK PRODUCTS", "SELLING PRODUCTS"}, {"1 ", " MILK 1000 litter ", " "},
        {" 2", "RICE 10000 kg ", " "},
        {"3 ", "Coca-cola 1000 litter ", " "},
        {" 4", " Ice-cream 1000 litter ", " "},
        {" 5", "Oil 1000 litter", " "},
        {" 6", " Dress 100 pece", " "},
        {" 7", "Chocolate 100 pece", " "},
        {"8", "Fruits 1000 kg ", " "},
        {"9", "Vegetables 1000 kg ", " "}
        };
        String column[] = {"SL NO", "STOCK PRODUCTS", "SELLING PRODUCTS"};
        JTable jt = new JTable(data, column);
        jt.setBounds(50, 700, 600, 170);
        JScrollPane sp = new JScrollPane(jt);
        f.add(jt);
        f.add(sp);

        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ShoppingMall3();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        try {
            new ShoppingMall4();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);

        int b = Integer.parseInt(s2);
        int c = 0;
        double x = 0, y;
        if (ae.getSource() == b1) {
            c = (a + b);
            y = c * 0.25;
            x = c + y;
        } else if (ae.getSource() == b2) {
            c = (a - b);
            y = c * 0.25;
            x = c + y;
        }
        String result = String.valueOf(x);
        tf3.setText(result);

    }
}
