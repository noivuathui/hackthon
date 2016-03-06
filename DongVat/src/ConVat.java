import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by noivu on 3/6/2016.
 */
public abstract class ConVat {
    protected int positionX;
    protected int positionY;
    protected BufferedImage dv;
    protected int tenvat;
    protected int sochan;

    public abstract void draw(Graphics g);


    public int getTenvat() {
        return tenvat;
    }

    public void setTenvat(int tenvat) {
        this.tenvat = tenvat;
    }

    public BufferedImage getDv() {
        return dv;
    }

    public void setDv(BufferedImage dv) {
        this.dv = dv;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
