import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Wavenand implements ActionListener, KeyListener {
    JFrame f1;
    JButton b1, b2;
    JTextField[] t1 = new JTextField[8];
    JTextField[] t2 = new JTextField[8];
    JLabel l1, l2;
    Random rr = new Random();

    Wavenand() {

        f1 = new JFrame("Waveform");
        final Component bg = f1.add(new JLabel(new ImageIcon("C:\\Users\\Admin\\Downloads\\mundo-1.jpg")));
        f1.setSize(800, 600);
        for (int i = 0; i < 8; i++) {
            t1[i] = new JTextField("");
            t2[i] = new JTextField("");
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

        //t1 = new JTextField("");
        l2 = new JLabel("B");
        l1 = new JLabel("A");
        b1 = new JButton("Generate Waveform");
        b2 = new JButton("Random");
        l1.setForeground(Color.white);
        l2.setForeground(Color.white);
        b1.setSize(150, 50);
        l1.setFont(new Font(null, Font.BOLD, 20));
        l2.setFont(new Font(null, Font.BOLD, 20));

        b2.setSize(150, 50);
        l1.setSize(30, 50);
        l2.setSize(30, 50);
        //t1.setLocation(250, 180);
        //t2.setLocation(250, 250);
        b1.setLocation(200, 320);
        b2.setLocation(400, 320);
        l1.setLocation(180, 180);
        l2.setLocation(180, 250);
        f1.setVisible(true);
        f1.add(b1);
        f1.add(l1);
        f1.add(l2);
        f1.add(b2);
        for (int i = 0; i < 8; i++) {
            f1.add(t1[i]);
            f1.add(t2[i]);
            t1[i].addKeyListener(this);
            t2[i].addKeyListener(this);
            t1[i].setFont(new Font(null,Font.BOLD,26));
            t2[i].setFont(new Font(null,Font.BOLD,26));

        }
        f1.add(bg);
        f1.setLayout(null);
        b1.addActionListener(this);

        b2.addActionListener(this);

    }

    public static void main(String[] args) {
      new  Wavenand();
    }
    String str1, str2;
    int[] x = new int[8];
    int[] y = new int[8];
    int[] z = new int[8];
    int temp, temp1;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {try{

            for (int i = 0; i < 8; i++) {
                str1 = t1[i].getText();
                str2 = t2[i].getText();
                x[i] = Integer.parseInt(str1);
                y[i] = Integer.parseInt(str2);
                z[i] = (x[i] & y[i]);
                if (z[i] == 0) {
                    z[i] = 1;
                } else {
                    z[i] = 0;
                }
                temp1++;
                temp++;
                f1.dispose();
            }
            SquareWaveGenerator s1 = new SquareWaveGenerator(x, y, z);

        }catch(NumberFormatException NF){
            new Db();
          }
        }
        if (e.getSource() == b2) {
            for (int i = 0; i < 8; i++) {
                t1[i].setText(String.valueOf(rr.nextInt(2)));
                t2[i].setText(String.valueOf(rr.nextInt(2)));

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


            }
        }
        catch (NumberFormatException numF){}

    }
}