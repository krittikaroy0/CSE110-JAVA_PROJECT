package shopping.mall;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShoppingMall2 extends Frame implements ActionListener {

    JButton bx, by, bu;

    ShoppingMall2() {
        JFrame f = new JFrame("Products Entry Form ");
        JLabel username = new JLabel("Customer's Name:");
        username.setBounds(50, 50, 150, 40);

        JTextField userTF = new JTextField();
        userTF.setBounds(180, 50, 150, 40);

        JLabel useritname = new JLabel("Other's iteam List:");
        useritname.setBounds(50, 150, 150, 40);
        String items[] = {"Chocolate", "Oil", "Milk", "Medicen", "Dress"};
        JComboBox cb = new JComboBox(items);
        cb.setBounds(180, 150, 150, 40);
        f.add(cb);

        JLabel Veg = new JLabel("Vegetables List:");
        Veg.setBounds(400, 100, 150, 40);
        f.add(Veg);
        String VEG[] = {"Potato", "Banana", "Cucumber", "Eggplant", "Pepper", "Patal", "Beans", "Karala"};
        JComboBox vg = new JComboBox(VEG);
        vg.setBounds(500, 100, 150, 40);
        f.add(vg);

        JLabel fruits = new JLabel("Fruits List:");
        fruits.setBounds(400, 150, 150, 40);
        f.add(fruits);
        String Fruits[] = {"Apple", "Banana", "Watermelon", "Rhythm", "Litchi", "Jackfruit", "Guava"};
        JComboBox fr = new JComboBox(Fruits);
        fr.setBounds(500, 150, 150, 40);
        f.add(fr);

        JLabel Rice = new JLabel("Rice List:");
        Rice.setBounds(400, 200, 150, 40);
        f.add(Rice);
        String Rices[] = {"Bashmoti", "Binni", "Balam", "BR4 AMAN", "Minicate", "Chinigura", "Nazirsail", "Brown Rice"};
        JComboBox Ri = new JComboBox(Rices);
        Ri.setBounds(500, 200, 150, 40);
        f.add(Ri);

        JLabel Ricep = new JLabel("Rice Price:");
        Ricep.setBounds(400, 250, 150, 40);
        f.add(Ricep);
        String Riceps[] = {"200TK", "300TK", "110TK", "120TK", "80TK", "65TK", "28TK", "10TK"};
        JComboBox Rp = new JComboBox(Riceps);
        Rp.setBounds(500, 250, 150, 40);
        f.add(Rp);

        JLabel Fruitsp = new JLabel("Fruits Price:");
        Fruitsp.setBounds(400, 300, 150, 40);
        f.add(Fruitsp);
        String Fruitspr[] = {"200TK", "300TK", "110TK", "120TK", "80TK", "65TK", "100TK", "150TK"};
        JComboBox frp = new JComboBox(Fruitspr);
        frp.setBounds(500, 300, 150, 40);
        f.add(frp);

        JLabel Vegp = new JLabel("Vegetables Price:");
        Vegp.setBounds(400, 350, 150, 40);
        f.add(Vegp);
        String Vegps[] = {"20TK", "30TK", "110TK", "50TK", "80TK", "65TK", "70TK", "10TK"};
        JComboBox vegp = new JComboBox(Vegps);
        vegp.setBounds(530, 350, 150, 40);
        f.add(vegp);

        JLabel useritnamount = new JLabel(" Others Quantity List:");
        useritnamount.setBounds(50, 250, 150, 40);
        String Amount[] = {"1 litter", "5 litter", "50 Litter", " 10 pecce", "2 pece", "5 pece"};
        JComboBox cb1 = new JComboBox(Amount);
        cb1.setBounds(180, 250, 150, 40);
        f.add(cb1);

        JLabel userbill1 = new JLabel("Bill 1 :");
        userbill1.setBounds(50, 350, 150, 40);
        JTextField userpriceTF = new JTextField();
        userpriceTF.setBounds(150, 350, 150, 40);
        f.add(userbill1);
        f.add(userpriceTF);

        JLabel userprice = new JLabel(" Other's Bill  :");
        userprice.setBounds(50, 400, 150, 40);
        JTextField userprice1TF = new JTextField();
        userprice1TF.setBounds(150, 400, 150, 40);
        f.add(userprice);
        f.add(userprice1TF);

        JLabel usergender = new JLabel("Total Quantity :");
        usergender.setBounds(800, 200, 200, 40);
        f.add(usergender);
        JRadioButton r1 = new JRadioButton("A) 5 to 10 kg or litter");
        JRadioButton r2 = new JRadioButton("B) 11 to 25 kg or litter");
        r1.setBounds(800, 240, 200, 40);
        r2.setBounds(800, 270, 200, 60);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        f.add(r1);
        f.add(r2);

        JLabel userarea = new JLabel("Descriptions:");
        userarea.setBounds(50, 500, 150, 40);
        JTextArea area = new JTextArea();
        area.setBounds(180, 500, 400, 200);

        f.add(area);
        f.add(userarea);

        f.add(username);
        f.add(userTF);

        f.add(useritname);
        f.add(useritnamount);

        f.add(userprice);
        f.add(userpriceTF);

        bx = new JButton("Back");
        bx.setBounds(20, 900, 80, 30);
        bx.addActionListener(this);

        by = new JButton("Next");
        by.setBounds(600, 900, 80, 30);
        by.addActionListener(this);

        f.add(bx);
        f.add(by);

        bu = new JButton("Save");
        bu.setBounds(300, 750, 100, 60);
        bu.addActionListener(this);
        f.add(bu);

        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ShoppingMall2();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        try {
            new ShoppingMall3();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
