import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by noivu on 3/6/2016.
 */
public class BoSat extends ConVat {


    public void draw(Graphics g) {
        g.drawImage(dv,positionX,positionY,null);
    }

    public BoSat(int positionX, int positionY, int tenvat) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.tenvat = tenvat;
        switch (tenvat){
            case 1:
                try {
                    this.dv = ImageIO.read(new File("ok/nhung-loai-bo-sat-dang-so-nhat-tren-the-gioi-phan-ii.jpg"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    this.dv = ImageIO.read(new File("ok/r11.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
