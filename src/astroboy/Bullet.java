package astroboy;

import astroboy.AstroBoy;
import java.awt.Graphics2D;

public class Bullet implements Runnable{
        int startx;
        int starty;
        int length;                                             //Length of the Bullet.
        long start_time;
        long curr_time;
        static final long elapsedLimit=5;                      //Specifies when to update the bullet In Milliseconds.
        static final int sep=30;                               //Minimum Seperation between the bullets on the same x axis.
        Graphics2D g;                                          //Represents the Graphics object of a BufferedImage
        AstroBoy panel;
        Bullet(int x,int y,int len,Graphics2D _g,AstroBoy mi,long stime){
//            synchronized(_g){
                startx=x;
                starty=y;
                length=len;
                g=_g;
                panel=mi;
                start_time=stime;
//            }
        }
        void drawBullet(){
//            synchronized(g){
                g.setColor(panel.front);
                g.drawLine(startx,starty,startx,starty+length);
//                panel.repaint();
//            }
        }
        void clearBullet(){
//            synchronized(g){
                g.setColor(panel.back);
                g.drawLine(startx,starty,startx,starty+length);
                g.setColor(panel.front);
//                panel.repaint();
//            }
        }
        public boolean equals(Bullet bullet){
            if(bullet==null)return false;
            return bullet.startx==startx&&bullet.starty==starty;
        }
        /////////////For Spacing Between The Bullets////////////////
        public boolean equalsConsideringSep(Bullet bullet){
            if(bullet==null)return false;
            if(bullet.startx==startx)
            if(Math.abs(bullet.starty-starty)<sep){
                return true;
            }
            return false;
        }
        @Override
        public void run() {
//            while(starty>0){
//                System.out.println("Called");
//                starty--;
//                drawBullet();
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(AstroBoy.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                clearBullet();
//            }
        }
}
    