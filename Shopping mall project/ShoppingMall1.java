/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping.mall;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class ShoppingMall1 extends Frame implements ActionListener {

    JButton b, b1, b2;

    ShoppingMall1() {
        JFrame f = new JFrame("Menu ");
        JOptionPane.showMessageDialog(f, "Hello, Welcome to Shopping Mall Management System project.");

        b1 = new JButton("Back");
        b1.setBounds(20, 900, 80, 30);
        b1.addActionListener(this);
        b1.setVisible(true);

        b = new JButton("Next");
        b.setBounds(600, 900, 80, 30);
        b.addActionListener(this);

        JTextArea area = new JTextArea("\n \n \n  Wellcome to  My Shopping Mall Management System Project \n  \n \n");
        area.setBounds(50, 50, 500, 200);
        f.add(area);

        JLabel userpname = new JLabel("Products List:");
        userpname.setBounds(50, 300, 150, 40);
        f.add(userpname);

        String data[][] = {{"ID", "Products NAME", "price", "Amount", "Stock Quantity"},
        {"01", "Potato", "20TK", "1kg", "10kg"},
        {"02", "Mango", "70TK", "1kg", "10kg"},
        {"03", "Banana", "120TK", " 1 dozens", "10dozen"},
        {"04", "Egg", "120TK", " 1 dozens", "10dozen"},
        {"05", "Milk", "70TK", " 1 Litter", " 100 Litter"},
        {"06", " Brown Rice", "100TK", " 1kg", "100kg"},
        {"07", "Oil", "140TK", " 1 Litter", " 50 Litter"},
        {"08", "Chocolate", "300TK", " 1 pece", " 100 pece"},
        {"09", "Ice-cream", "120TK", " 1 pece", " 100 pece"},
        {"10", "Coca-cola", "110TK", " 2 Litter", " 10 Litter"},
        {"11", "Dress", "2000TK", " 1 pece", " 100 pece"},
        {"12", "Cucumber", "50TK", "1kg", "10kg"},
        {"13", "Eggplant", "20TK", "1kg", "10kg"},
        {"14", "Karala", "50TK", "1kg", "10kg"},
        {"15", "Beans", "40TK", "1kg", "10kg"},
        {"16", "Patal", "90TK", "1kg", "10kg"},
        {"17", "Bashmoti", "200TK", "1kg", "10kg"},
        {"18", "Binni", "120TK", "1kg", "10kg"},
        {"19", "Minicate", "65TK", "1kg", "10kg"},
        {"20", "Chinigura", "110TK", "1kg", "10kg"},
        {"21", "watermelon", "80TK", "1kg", "1000kg"},
        {"22", "Rhytm", "20TK", "1kg", "10kg"},
        {"23", "Litchi", "400TK", "1kg", "10kg"},
        {"24", "Guava", "100TK", "1kg", "10kg"}

        };
        String column[] = {"ID", "NAME", "price", "Amount", "Stock Quantity"};
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 380, 500, 400);
        JScrollPane sp = new JScrollPane(jt);

        f.add(sp);
        f.add(jt);

        f.add(b);
        f.add(b1);

        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ShoppingMall1();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //String button = b1.setVisible(true);
        try {
            new ShoppingMall2();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

}
