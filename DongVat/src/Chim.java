import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by noivu on 3/6/2016.
 */
public class Chim extends ConVat{

    public void draw(Graphics g) {
        g.drawImage(dv,positionX,positionY,null);
    }

    public Chim(int positionX, int positionY, int tenvat) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.tenvat = tenvat;
        switch (tenvat){
            case 1:
                try {
                    this.dv = ImageIO.read(new File("bird_flight_9_by_queenphotoshop-d4h4jjv.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    this.dv = ImageIO.read(new File("ok/birds_png_by_lg_design-d4xeoax.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
