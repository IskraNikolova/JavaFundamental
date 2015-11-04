package problem1Geometry.shape;

public class Vertex3D extends Vertex{

    public Vertex3D(double x, double y, double z) {
        super(x, y, 0);
    }

    @Override
    public String toString() {
        return String.format("Vertex2D:{%.2f,%.2f,%.2f}",this.getX(),this.getY(),this.getZ());
    }
}
