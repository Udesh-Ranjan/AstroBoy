package astroboy;

import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dev Parzival
 */
public class Shooter{
    Point top;
    Point bottom_left;
    Point bottom_right;
    Random rnd=new Random();
    int height;
    int base;
    
    int tail_length;
    
    static final int sepration=10;
    
    public Shooter(){
       top=new Point(0,0);
       bottom_left=new Point(0,0);
       bottom_right=new Point(0,0);
    }
    public Shooter(Point top,Point bottom_left,Point bottom_right){
        this.top=top;
        this.bottom_left=bottom_left;
        this.bottom_right=bottom_right;
        
        height=Math.abs(bottom_left.y-top.y);
        base=Math.abs(bottom_left.x-bottom_right.x);
    }
    
    public void drawShooter(Graphics g){
        g.drawLine(top.x, top.y, bottom_left.x, bottom_left.y);
        g.drawLine(bottom_left.x, bottom_left.y,bottom_right.x, bottom_right.y);
        g.drawLine(bottom_right.x, bottom_right.y, top.x, top.y);
        
        g.drawLine(top.x,bottom_right.y,top.x,bottom_right.y+tail_length);
    }
    public void initTail(){
        tail_length=Math.abs(rnd.nextInt())%16;
    }
//    @Override
//    public void paint(Graphics g){
//        initTail();
//        drawShooter(g);
//        
//    }
//    public static void main(String $[]){
//        Shooter shoot=new Shooter(new Point(300,300),new Point(290,350),new Point(310,350));
//        shoot.setSize(500,500);
//        JFrame frame=new JFrame();
//        frame.setSize(500,500);
//        frame.add(shoot);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
}
