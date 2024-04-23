package shopping.mall;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShoppingMall4 extends Frame implements ActionListener {

    JButton b, b1, b2, bx, by, bu;
    JTextField tf1, tf2, tf3;

    ShoppingMall4() {
        JFrame f = new JFrame("List of selling products ");

        JLabel userbill3 = new JLabel("List of selling Products:");
        userbill3.setBounds(50, 200, 150, 40);
        f.add(userbill3);

        String data[][] = {{"SL NO", "Buying Customers", " products", " Quantity", " Total Bill"}, {"1 ", " ", " ", " ", " "},
        {" 2", " ", " ", " ", " "},
        {"3 ", " ", " ", " ", " "},
        {" 4", " ", " ", " ", " "},
        {" 5", " ", " ", " ", " "},
        {" 6", " ", " ", " ", " "},
        {" 7 ", " ", " ", " ", " "},
        {"8 ", " ", " ", " ", " "},
        {"9 ", " ", " ", " ", " "},
        {"10 ", " ", " ", " ", " "},
        {"Total selling Products = ", " ", " ", " ", " "}
        };
        String column[] = {"SL NO", "Buying Customers", "products", " Quantity", " Total Bill"};
        JTable jt = new JTable(data, column);
        jt.setBounds(50, 250, 700, 200);
        JScrollPane sp = new JScrollPane(jt);
        f.add(jt);
        f.add(sp);

        bu = new JButton("Save");
        bu.setBounds(300, 600, 100, 60);
        bu.addActionListener(this);
        f.add(bu);

        by = new JButton("Next");
        by.setBounds(600, 900, 100, 30);
        by.addActionListener(this);
        f.add(by);

        bx = new JButton("Back");
        bx.setBounds(20, 900, 100, 30);
        bx.addActionListener(this);
        bx.setVisible(true);
        f.add(bx);

        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ShoppingMall4();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            new ShoppingMall5();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
