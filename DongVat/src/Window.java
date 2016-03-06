import com.sun.org.apache.xpath.internal.SourceTree;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by noivu on 3/6/2016.
 */

public class Window extends Frame implements MouseListener, Runnable{
    Graphics seconds;
    Image image;
    BufferedImage background;

    Meo meo1,ho,sutu;
    BoSat ran,casau;
    Chim daibang,haiau;

    public Window() throws IOException {

        inDV();
        this.setTitle("Động Vật");
        this.setSize(1200, 600);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    @Override
    public void update(Graphics g){
        if(image == null){
            image = createImage(this.getWidth(), this.getHeight());
            seconds = image.getGraphics();
        }
        seconds.setColor(getBackground());
        seconds.fillRect(0,0,getWidth(), getHeight());
        seconds.setColor(getForeground());
        paint(seconds);
        g.drawImage(image,0,0,null);
    }


    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(background, 0, 0, null);
        meo1.draw(g);
        ho.draw(g);
        sutu.draw(g);
        casau.draw(g);
        ran.draw(g);
        daibang.draw(g);
        haiau.draw(g);

        }

    public void inDV(){
        meo1 = new Meo(100,100,1);
        ho = new Meo(50,300,2);
        sutu = new Meo(250,300,3);
        casau = new BoSat(350,300,1);
        ran = new BoSat(550,300,2);
        daibang = new Chim(650,300,1);
        haiau = new Chim(850,300,1);
    }

    public void run() {
        while(true){
           // meo1.draw(g);
            repaint();
            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {


      /*  if(meo1.getPositionX() < x && x < meo1.getPositionX()+ 85 &&  < meo1.getPositionY() && y < meo1.getPositionY()+85 ){
            System.out.println(" day la meo ");
        }*/
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(e.getX());
        System.out.println(e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
