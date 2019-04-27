import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Choice implements ActionListener {
    JFrame f1;
    JLabel l1;
    JButton b1, b2,b3;


    Choice() {
        f1 = new JFrame("Enter your choice");
        l1 = new JLabel("Choose the number of input gate");
        Icon input3 = new ImageIcon("C:\\Users\\Admin\\Downloads\\3INPUT.png");
        Icon input2 = new ImageIcon("C:\\Users\\Admin\\Desktop\\NAND.png");
        final Component bg = f1.add(new JLabel(new ImageIcon("C:\\Users\\Admin\\Downloads\\mundo-1.jpg")));

        b1 = new JButton(input2);
        b2 = new JButton(input3);
        b3 = new JButton("Realisation");
        l1.setSize(800, 60);
        b1.setSize(250, 90);
        b3.setSize(150, 50);

        b2.setSize(250, 90);
        b1.setLocation(100, 300);
        b2.setLocation(400, 300);
        b3.setLocation(300, 400);
        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font(null, Font.BOLD, 30));
        l1.setLocation(150, 250);
        f1.setSize(800, 600);
        f1.setVisible(true);
        f1.add(b1);
        f1.add(l1);
        f1.add(b2);
        f1.add(b3);

        f1.setLayout(null);
        f1.add(bg);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1)
            new InputNAND();
        f1.dispose();
        if (e.getSource() == b2) {
            new InputNand3();
            f1.dispose();
        }
        if(e.getSource()==b3){
            new Realnand();
            f1.dispose();
        }
    }
}
