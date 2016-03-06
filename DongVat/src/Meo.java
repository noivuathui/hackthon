import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by noivu on 3/6/2016.
 */
public class Meo extends ConVat{

    @Override
    public void draw(Graphics g) {
        g.drawImage(dv,positionX,positionY,null);
    }

    public Meo(int positionX, int positionY, int tenvat) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.tenvat = tenvat;
        switch (tenvat){
            case 1:
            try {
                this.dv = ImageIO.read(new File("ok/cat_PNG1631.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
                break;
            case 2:
                try {
                    this.dv = ImageIO.read(new File("ok/tiger_PNG545.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                try {
                    this.dv = ImageIO.read(new File("ok/lion_PNG566.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
