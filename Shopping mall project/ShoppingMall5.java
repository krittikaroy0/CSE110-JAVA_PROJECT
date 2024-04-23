package shopping.mall;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShoppingMall5 extends Frame implements ActionListener {

    JButton b, b1, b2, bx, by;
    JTextField tf1, tf2, tf3;

    ShoppingMall5() {
        JFrame f = new JFrame(" Bill Payment ");

        JTextArea area1 = new JTextArea("\n\n\n\n            Thank You!\n\n\n\n");
        area1.setBounds(200, 700, 200, 100);
        f.add(area1);
        JLabel userbill = new JLabel("CASH Memo");
        userbill.setBounds(200, 50, 250, 40);
        f.add(userbill);

        JLabel userbill1 = new JLabel("Customer's Name:");
        userbill1.setBounds(50, 100, 150, 40);
        f.add(userbill1);
        tf1 = new JTextField();
        tf1.setBounds(180, 100, 150, 30);
        f.add(tf1);

        JLabel userbill2 = new JLabel("Address:");
        userbill2.setBounds(50, 150, 150, 40);
        f.add(userbill2);
        tf2 = new JTextField();
        tf2.setBounds(120, 150, 150, 30);
        f.add(tf2);

        JLabel userbill3 = new JLabel("Date:");
        userbill3.setBounds(50, 200, 150, 40);
        f.add(userbill3);
        tf3 = new JTextField();
        tf3.setBounds(120, 200, 150, 30);
        f.add(tf3);

        String data[][] = {{"SL NO", "Description", "Amount"}, {"1 ", " ", " "},
        {" 2", " ", " "},
        {"3 ", " ", " "},
        {" 4", " ", " "},
        {" 5", " ", " "},
        {" 6", " ", " "},
        {" Bill = ", " ", " "},
        {"25% Vat = ", " ", " "},
        {"Total Bill = ", " ", " "}
        };
        String column[] = {"SL NO", "Description", "Amount"};
        JTable jt = new JTable(data, column);
        jt.setBounds(50, 250, 600, 250);
        JScrollPane sp = new JScrollPane(jt);
        f.add(jt);
        f.add(sp);

        JOptionPane.showMessageDialog(f, "Successfully saved.", "Message", JOptionPane.WARNING_MESSAGE);

        by = new JButton("The End");
        by.setBounds(600, 900, 100, 30);
        by.addActionListener(this);
        f.add(by);

        bx = new JButton("Back");
        bx.setBounds(20, 900, 100, 30);
        bx.addActionListener(this);
        bx.setLayout(null);
        bx.setVisible(true);
        f.add(bx);

        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ShoppingMall5();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
