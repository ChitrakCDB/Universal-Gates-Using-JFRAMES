import javax.swing.*;
import java.awt.*;

public class NORtruth {
    JFrame f1;

    NORtruth(){

        f1=new JFrame("Truth Table");
        final Component bg = f1.add(new JLabel(new ImageIcon("C:\\Users\\Admin\\Downloads\\NORTRUTH.jpg")));
        f1.setSize(800,600);
        f1.setVisible(true);
        f1.add(bg);
        f1.setLayout(null);
    }

}
