import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Thankframe implements ActionListener {

 JFrame frame;
 JButton b1;
    Thankframe() {
        frame = new JFrame("Thank you visit again!");
          b1=new JButton("Close");
        final Component bg = frame.add(new JLabel(new ImageIcon("C:\\Users\\Admin\\Desktop\\Thank you.jpg")));
        b1.setBounds(320,50,80,30);
        frame.setLayout(null);
        frame.add(b1);
        b1.setBackground(Color.lightGray);
        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.add(bg);
        bg.setBounds(0, 0, 780, 600);
 b1.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            frame.dispose();
        }
    }
}