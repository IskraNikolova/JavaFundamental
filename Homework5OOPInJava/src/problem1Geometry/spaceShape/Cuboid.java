package problem1Geometry.spaceShape;


import problem1Geometry.shape.Vertex3D;

public class Cuboid extends SpaceShape {
    private double height;
    private double width;
    private double depth;

    public Cuboid(Vertex3D vertex, double height, double width, double depth) {
        super(vertex);
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public double getArea() {
        double A = this.height * this.width;
        double B = this.height * this.depth;
        double C = this.width * this.depth;

        return A * 2 + B * 2 + C * 2;
    }

    @Override
    public double getVolume() {
        return this.height * this.width * this.depth;
    }

    @Override
    public String toString() {
        return String.format(
                "Cuboid {Width = %.2f, Height = %.2f, Depth = %.2f, Volume = %.2f, Area = %.2f, Vertices = %s",
                this.width,
                this.height,
                this.depth,
                this.getVolume(),
                this.getArea(),
                this.getVertexes());
    }
}
