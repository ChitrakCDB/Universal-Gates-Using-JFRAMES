import javax.swing.*;
import java.awt.*;

public class NANDTRUTH3 {
    JFrame f1;

    NANDTRUTH3(){

        f1=new JFrame("Truth table");
        final Component bg = f1.add(new JLabel(new ImageIcon("C:\\Users\\Admin\\Downloads\\NAND2.jpg")));
        f1.setSize(800,600);
        f1.setVisible(true);
        f1.add(bg);
        f1.setLayout(null);
    }

}
