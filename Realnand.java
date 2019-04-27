import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Realnand implements ActionListener {
    JFrame frame;
    JButton b1,b2,b3,b4,b5,b6,b7;


    Realnand(){
        frame = new JFrame("Realisation");
        final Component bg = frame.add(new JLabel(new ImageIcon("C:\\Users\\Admin\\Downloads\\mundo-1.jpg")));
        b1 = new JButton("Nand Gate as Not gate");
        b2 =new JButton("Nand gate as And gate");
        b3=new JButton("Nand gate as Or gate");
        b4=new JButton("Nand gate as Nor gate");
        b5=new JButton("Nand gate as X-or gate");
        b6=new JButton("Nand gate as X-nor gate");
        b7=new JButton("Exit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);

        b1.setSize(300, 50);
        b2.setSize(300, 50);
        b3.setSize(300, 50);
        b4.setSize(300, 50);
        b5.setSize(300, 50);
        b6.setSize(300, 50);
        b7.setSize(300, 50);
        b1.setLocation(250, 100);
        b2.setLocation(250, 163);
        b3.setLocation(250,233);
        b4.setLocation(250,293);
        b5.setLocation(250,353);
        b6.setLocation(250,410);
        b7.setLocation(250,460);
        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);
        b5.setBackground(Color.WHITE);
        b6.setBackground(Color.WHITE);
        b7.setBackground(Color.lightGray);


        frame.setVisible(true);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(bg);
        frame.setLayout(null);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            frame = new JFrame("nand as not");
            final Component bg = frame.add(new JLabel(new ImageIcon("C:\\Users\\Admin\\Desktop\\nandreal\\nandasnot.jpg")));
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setSize(800,600);
            frame.add(bg);
            bg.setBounds(0,0,800,600);

        }
        if(e.getSource()==b2){

            frame = new JFrame("nand as And");
            final Component bg = frame.add(new JLabel(new ImageIcon("C:\\Users\\Admin\\Desktop\\nandreal\\andusingnand.jpg")));
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setSize(800,600);
            frame.add(bg);
            bg.setBounds(0,0,800,600);
        }
        if(e.getSource()==b3){

            frame = new JFrame("nand as Or");
            final Component bg = frame.add(new JLabel(new ImageIcon("C:\\Users\\Admin\\Desktop\\nandreal\\orusingnand.jpg")));
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setSize(800,600);
            frame.add(bg);
            bg.setBounds(0,0,800,600);
        }
        if (e.getSource()==b4){

            frame = new JFrame("nand as Nor");
            final Component bg = frame.add(new JLabel(new ImageIcon("C:\\Users\\Admin\\Desktop\\nandreal\\norusingnand.jpg")));
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setSize(800,600);
            frame.add(bg);
            bg.setBounds(0,0,800,600);
        }
        if (e.getSource()==b5){

            frame = new JFrame("nand as Xor");
            final Component bg = frame.add(new JLabel(new ImageIcon("C:\\Users\\Admin\\Desktop\\nandreal\\xorusingnand.png")));
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setSize(800,600);
            frame.add(bg);
            bg.setBounds(0,0,800,600);
        }
        if (e.getSource()==b6){

            frame = new JFrame("nand as Xnor");
            final Component bg = frame.add(new JLabel(new ImageIcon("C:\\Users\\Admin\\Desktop\\nandreal\\xnorusingnand.png")));
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setSize(800,600);
            frame.add(bg);
            bg.setBounds(0,0,800,600);
        }
        if (e.getSource()==b7){
            frame.dispose();
            new ADDIMAGE();
            frame.dispose();
        }
    }
}
