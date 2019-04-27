import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class WaveNAND3 implements ActionListener, KeyListener {
    JFrame f1;
    JButton b1, b2;
    JTextField[] t1 = new JTextField[8];
    JTextField[] t2 = new JTextField[8];
    JTextField[] t3 = new JTextField[8];
    JLabel l1, l2,l3;
    Random rr = new Random();

    WaveNAND3() {
        f1 = new JFrame("Waveform");
        final Component bg = f1.add(new JLabel(new ImageIcon("C:\\Users\\Admin\\Downloads\\mundo-1.jpg")));
        f1.setSize(800, 600);
        for (int i = 0; i < 8; i++) {
            t1[i] = new JTextField("");
            t2[i] = new JTextField("");
            t3[i] = new JTextField("");
        }
        t1[0].setBounds(200, 180, 30, 50);
        t1[1].setBounds(250, 180, 30, 50);
        t1[2].setBounds(300, 180, 30, 50);
        t1[3].setBounds(350, 180, 30, 50);
        t1[4].setBounds(400, 180, 30, 50);
        t1[5].setBounds(450, 180, 30, 50);
        t1[6].setBounds(500, 180, 30, 50);
        t1[7].setBounds(550, 180, 30, 50);

        t2[0].setBounds(200, 250, 30, 50);
        t2[1].setBounds(250, 250, 30, 50);
        t2[2].setBounds(300, 250, 30, 50);
        t2[3].setBounds(350, 250, 30, 50);
        t2[4].setBounds(400, 250, 30, 50);
        t2[5].setBounds(450, 250, 30, 50);
        t2[6].setBounds(500, 250, 30, 50);
        t2[7].setBounds(550, 250, 30, 50);

        t3[0].setBounds(200, 320, 30, 50);
        t3[1].setBounds(250, 320, 30, 50);
        t3[2].setBounds(300, 320, 30, 50);
        t3[3].setBounds(350, 320, 30, 50);
        t3[4].setBounds(400, 320, 30, 50);
        t3[5].setBounds(450, 320, 30, 50);
        t3[6].setBounds(500, 320, 30, 50);
        t3[7].setBounds(550, 320, 30, 50);


        //t1 = new JTextField("");
        l3 = new JLabel("C");
        l2 = new JLabel("B");
        l1 = new JLabel("A");
        b1 = new JButton("Generate Waveform");
        b2 = new JButton("Random");
        l1.setForeground(Color.white);
        l2.setForeground(Color.white);
        l3.setForeground(Color.white);
        b1.setSize(150, 50);
        l1.setFont(new Font(null, Font.BOLD, 20));
        l2.setFont(new Font(null, Font.BOLD, 20));
        l3.setFont(new Font(null, Font.BOLD, 20));

        b2.setSize(150, 50);
        l1.setSize(30, 50);
        l2.setSize(30, 50);
        l3.setSize(30, 50);
        //t1.setLocation(250, 180);
        //t2.setLocation(250, 250);
        b1.setLocation(200, 390);
        b2.setLocation(400, 390);
        l1.setLocation(180, 180);
        l2.setLocation(180, 250);
        l3.setLocation(180, 320);
        f1.setVisible(true);
        f1.add(b1);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(b2);
        for (int i = 0; i < 8; i++) {
            f1.add(t1[i]);
            f1.add(t2[i]);
            f1.add(t3[i]);
            t1[i].addKeyListener(this);
            t2[i].addKeyListener(this);
            t3[i].addKeyListener(this);
            t1[i].setFont(new Font(null,Font.BOLD,26));
            t2[i].setFont(new Font(null,Font.BOLD,26));
            t3[i].setFont(new Font(null,Font.BOLD,26));

        }
        f1.add(bg);
        f1.setLayout(null);
        b1.addActionListener(this);

        b2.addActionListener(this);


    }

    String str1, str2, str3;
    int[] x = new int[8];
    int[] y = new int[8];
    int[] z = new int[8];
    int[] w = new int[8];
    int temp, temp1, temp2;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                for (int i = 0; i < 8; i++) {
                    str1 = t1[i].getText();
                    str2 = t2[i].getText();
                    str3 = t3[i].getText();
                    x[i] = Integer.parseInt(str1);
                    y[i] = Integer.parseInt(str2);

                    z[i] = Integer.parseInt(str3);
                    w[i] = (x[i] & y[i] & z[i]);
                    if (w[i] == 0) {
                        w[i] = 1;
                    } else {
                        w[i] = 0;
                    }
                    temp1++;
                    temp++;
                    temp2++;
                    f1.dispose();

                }
                SquarewaveGenerator3 s1 = new SquarewaveGenerator3(x, y, z, w);

            } catch (NumberFormatException NF) {
                new Db();
            }
        }
            if (e.getSource() == b2) {
                for (int i = 0; i < 8; i++) {
                    t1[i].setText(String.valueOf(rr.nextInt(2)));
                    t2[i].setText(String.valueOf(rr.nextInt(2)));
                    t3[i].setText(String.valueOf(rr.nextInt(2)));
                }

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

            for (int i = 0; i < 8; i++) {
                int data = Integer.parseInt(t1[i].getText());
                if (data > 1 || t1[i].getText().length() > 1) {
                    t1[i].setText(String.valueOf(t1[i].getText().charAt(0)));

                }
                int dat = Integer.parseInt(t2[i].getText());

                if (dat > 1 || t2[i].getText().length() > 1) {
                    t2[i].setText(String.valueOf(t2[i].getText().charAt(0)));

                }

                int daa = Integer.parseInt(t3[i].getText());

                if (daa > 1 || t3[i].getText().length() > 1) {
                    t3[i].setText(String.valueOf(t3[i].getText().charAt(0)));

                }

            }
        }
        catch (NumberFormatException numF){}

    }
}
