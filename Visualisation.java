import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Visualisation implements ActionListener {
    JFrame f1;
    JButton b1, b2;
    JLabel l;

    Visualisation() {
        f1 = new JFrame("Introduction");
        b1 = new JButton("ENTER");
        b2 = new JButton("EXIT");
        b1.setBounds(15, 520, 208, 65);
        b1.setBackground(new Color(90, 155, 213));
        b2.setBounds(600, 520, 220, 67);
        b2.setBackground(new Color(237, 125, 49));
        ImageIcon manu = new ImageIcon("C:\\Users\\Admin\\Desktop\\visual.jpg");
        l = new JLabel(manu);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f1.add(b1);
        f1.add(b2);
        f1.add(l);
        f1.setSize(850, 670);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource()==b1){
           new ADDIMAGE();
           f1.dispose();
        }
        if (e.getSource()==b2){
            f1.dispose();
            new Thankframe();
        }
    }
}