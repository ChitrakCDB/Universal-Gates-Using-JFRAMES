import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ADDIMAGE implements ActionListener {
    JButton b1,b2,b3;
    JFrame frame;
    JLabel l1;
ADDIMAGE(){

  frame=new JFrame("Universal Gates");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Icon warn = new ImageIcon("C:\\Users\\Admin\\Downloads\\NAND.png");
    Icon warns = new ImageIcon("C:\\Users\\Admin\\Downloads\\NOR.png");
    final Component bg = frame.add(new JLabel(new ImageIcon("C:\\Users\\Admin\\Downloads\\mundo-1.jpg")));
    b3=new JButton("Exit");
    b2=new JButton(warns);
    b1=new JButton(warn);
    l1=new JLabel("CHOOSE YOUR GATE");
     l1.setSize(800,60);
    b1.setSize(250,90);

    b2.setSize(250,90);
    b3.setSize(100,50);
    b1.setLocation(100,300);
    b2.setLocation(400,300);
    b3.setLocation(320,400);

    b3.setBackground(Color.BLACK);

    b1.setBackground(Color.BLACK);
    b2.setBackground(Color.BLACK);
    l1.setForeground(Color.WHITE);
    l1.setFont(new Font(null,Font.BOLD,30));
    l1.setLocation(250,250);
    frame.setSize(800,600);
    frame.setVisible(true);
    frame.add(b1);
    frame.add(l1);
    frame.add(b2);
    frame.add(b3);
    frame.add(bg);

    frame.setLayout(null);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new Choice();
        }
        if(e.getSource()==b2){
            new ChoiceNOR();

        }
        if (e.getSource()==b3){
            frame.dispose();
           new Thankframe();
        }

    }
}
