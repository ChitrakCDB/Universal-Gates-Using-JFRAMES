import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputNAND implements ActionListener, KeyListener {
    JFrame f1;
    JTextField t1, t2, t3;
    JLabel l4, l1, l2, l3;
    JButton b1, b2, b3;

    InputNAND() {
        f1 = new JFrame("Enter your choice");
        final Component bg = f1.add(new JLabel(new ImageIcon("C:\\Users\\Admin\\Downloads\\mundo-1.jpg")));
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        l1 = new JLabel(" Input A");
        l2 = new JLabel("Input B");
        l3 = new JLabel("C=A'. B'");
        l4 = new JLabel(" ENTER YOUR INPUTS ");
        b1 = new JButton("Result");
        b2 = new JButton("Truth Table");
        b3 = new JButton("Waveform");
        l4.setSize(800, 60);
        f1.setSize(800, 600);
        t1.setSize(150, 50);
        t1.setSize(150, 50);
        t2.setSize(150, 50);
        t3.setSize(150, 50);
        l1.setSize(150, 20);
        l2.setSize(150, 20);
        l3.setSize(150, 20);
        l4.setLocation(200, 200);
        l1.setFont(new Font(null,Font.BOLD,20));
        l2.setFont(new Font(null,Font.BOLD,20));
        l3.setFont(new Font(null,Font.BOLD,20));
        l4.setFont(new Font(null,Font.BOLD,30));
        t1.setFont(new Font(null,Font.BOLD,26));
        t2.setFont(new Font(null,Font.BOLD,26));
        t3.setFont(new Font(null,Font.BOLD,26));
         t3.setBackground(Color.red);
        b1.setSize(150, 50);
        b2.setSize(150, 50);
        b3.setSize(150, 50);
        l1.setLocation(100, 280);
        l2.setLocation(300, 280);
        l3.setLocation(500, 280);
        t1.setLocation(100, 300);
        t2.setLocation(300, 300);
        t3.setLocation(500, 300);
        b1.setLocation(100, 400);
        b2.setLocation(300, 400);
        b3.setLocation(500, 400);
        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);
        l4.setForeground(Color.WHITE);
        t1.setHorizontalAlignment(JTextField.CENTER);
        t2.setHorizontalAlignment(JTextField.CENTER);
        t3.setHorizontalAlignment(JTextField.CENTER);
        f1.setVisible(true);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(bg);
        f1.setLayout(null);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        t1.addKeyListener(this);
        t2.addKeyListener(this);
    }

    public static void main(String[] args) {
        new InputNAND();
    }
String a,b;  int c,d;
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                a = t1.getText();
                b = t2.getText();
                c = Integer.parseInt(a);
                d = Integer.parseInt(b);

                if (c == 1 && d == 1) {
                    t3.setText("0");
                } else if (c > 1 || d > 1) {
                    new Db();
                    f1.dispose();
                    new InputNAND();
                } else {
                    t3.setText("1");
                }


            } catch (NumberFormatException NF) {
                new Db();

            }
        }
        if (e.getSource()==b2) {
            new NandTRUTH();
             f1.dispose();
        }
        if(e.getSource()==b3){
            new Wavenand();
            f1.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
  try {
    int data =Integer.parseInt(t1.getText());
    if (data>1||t1.getText().length()>1){
        t1.setText(String.valueOf(t1.getText().charAt(0)));

    }
    int dat =Integer.parseInt(t2.getText());

        if (dat>1||t2.getText().length()>1){
            t2.setText(String.valueOf(t2.getText().charAt(0)));

        }



}
catch (NumberFormatException numF){}
    }

 }