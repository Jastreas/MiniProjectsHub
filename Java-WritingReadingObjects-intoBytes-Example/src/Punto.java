import java.io.Serializable;

public class Punto implements Serializable {
    private static final long serialVersionUID = 1L;
    protected int coordX, coordY;
    protected String color;

    public Punto(int x, int y, String color){
        this.coordX = x;
        this.coordY = y;
        this.color = color;
    }

    public int getCoordX(){ return this.coordX; }
    public int getCoordY(){ return this.coordY; }
    public String getColor(){ return this.color; }

    @Override
    public String toString() {
        return "CoordX: " + coordX + "\nCoordY: " + coordY + "\nColor: " + color;
    }

}
