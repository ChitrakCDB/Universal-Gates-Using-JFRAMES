import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquarewaveGenerator3 extends Canvas implements ActionListener {

    JFrame f1;
    static int[] a = new int[8];
    static int[] b = new int[8];
    static int[] c = new int[8];
    static int []d = new int[8];


    JLabel l1, l2, l3,l4;
    JButton b1;

    public void paint(Graphics g) {
        int i,j=20;
        g.drawLine(20, 20, 20, 250); //Vertical Line
        g.drawLine(20, 135, 400, 135); //Horizontal Line

        for(i=0;i<a.length;i++)
        {
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){}

            if(i==0)
            {
                if(a[i] == 0)
                {
                    g.setColor(Color.RED.darker());
                    g.drawLine(j,135,j+40,135);
                    j=j+40;
                }
                else
                {
                    g.setColor(Color.BLUE.darker());
                    g.drawLine(j,105,j+40,105);
                    j=j+40;
                }
            }
            else
            {
                if(a[i]!=a[i-1])
                {
                    g.drawLine(j, 135, j, 105);
                }
                if(a[i] == 0)
                {
                    g.setColor(Color.RED.darker());
                    g.drawLine(j,135,j+40,135);
                    j=j+40;
                }
                else
                {
                    g.setColor(Color.BLUE.darker());
                    g.drawLine(j,105,j+40,105);
                    j=j+40;
                }

            }

        }

//for input  1
        j=20;
        g.drawLine(20, 80, 20, 250); //Vertical Line
        g.drawLine(20, 175, 400, 175); //Horizontal Line

        for(i=0;i<b.length;i++)
        {
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){}
            if(i==0)
            {
                if(b[i] == 0)
                {
                    g.setColor(Color.RED.darker());
                    g.drawLine(j,175,j+40,175);
                    j=j+40;
                }
                else
                {
                    g.setColor(Color.BLUE.darker());
                    g.drawLine(j,145,j+40,145);
                    j=j+40;
                }
            }
            else
            {
                if(b[i]!=b[i-1])
                {
                    g.drawLine(j, 175, j, 145);
                }
                if(b[i] == 0)
                {
                    g.setColor(Color.RED.darker());
                    g.drawLine(j,175,j+40,175);
                    j=j+40;
                }
                else
                {
                    g.setColor(Color.BLUE.darker());
                    g.drawLine(j,145,j+40,145);
                    j=j+40;
                }

            }

        }

        //for input  2
        j=20;
        g.drawLine(20, 140, 20, 250); //Vertical Line
        g.drawLine(20, 215, 400, 215); //Horizontal Line

        for(i=0;i<c.length;i++)
        {
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){}
            if(i==0)
            {
                if(c[i] == 0)
                {
                    g.setColor(Color.RED.darker());
                    g.drawLine(j,215,j+40,215);
                    j=j+40;
                }
                else
                {
                    g.setColor(Color.BLUE.darker());
                    g.drawLine(j,185,j+40,185);
                    j=j+40;
                }
            }
            else
            {
                if(c[i]!=c[i-1])
                {
                    g.drawLine(j, 215, j, 185);
                }
                if(c[i] == 0)
                {
                    g.setColor(Color.RED.darker());
                    g.drawLine(j,215,j+40,215);
                    j=j+40;
                }
                else
                {
                    g.setColor(Color.BLUE.darker());
                    g.drawLine(j,185,j+40,185);
                    j=j+40;
                }

            }

        }

        j=20;
        g.drawLine(20, 200, 20, 250); //Vertical Line
        g.drawLine(20, 255, 400, 255); //Horizontal Line

        for(i=0;i<d.length;i++)
        {
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){}
            if(i==0)
            {
                if(d[i] == 0)
                {
                    g.setColor(Color.RED.darker());
                    g.drawLine(j,255,j+40,255);
                    j=j+40;
                }
                else
                {
                    g.setColor(Color.BLUE.darker());
                    g.drawLine(j,225,j+40,225);
                    j=j+40;
                }
            }
            else
            {
                if(d[i]!=d[i-1])
                {
                    g.drawLine(j, 255, j, 225);
                }
                if(d[i] == 0)
                {
                    g.setColor(Color.RED.darker());
                    g.drawLine(j,255,j+40,255);
                    j=j+40;
                }
                else
                {
                    g.setColor(Color.BLUE.darker());
                    g.drawLine(j,225,j+40,225);
                    j=j+40;
                }

            }

        }

    }
public SquarewaveGenerator3(int []val,int []val2,int []val3,int []val4){
    a = val;
    b=val2;
    c=val3;
    d=val4;
    f1 = new JFrame("WaveForm- SquareWave");
    l1=new JLabel("A");
    l2=new JLabel("B");
    l3=new JLabel("C");
    l4=new JLabel("X");
    b1= new JButton("Exit");
    b1.setSize(150, 50);
    b1.setLocation(200, 300);

    l1.setBounds(9,100,10,50);
    l2.setBounds(9,140,10,50);
    l3.setBounds(9,180,10,50);
    l4.setBounds(9,220,10,50);
    f1.add(b1);
    f1.add(l1);
    f1.add(l2);
    f1.add(l3);
    f1.add(l4);
    f1.add(this);
    f1.setSize(800, 600);
    f1.setVisible(true);
    b1.addActionListener(this);

}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            f1.dispose();
            new ADDIMAGE();
        }

    }
}
