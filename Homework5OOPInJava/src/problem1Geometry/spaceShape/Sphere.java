package problem1Geometry.spaceShape;


import problem1Geometry.shape.Vertex3D;

public class Sphere extends SpaceShape {
    private double radius;

    public Sphere(Vertex3D vertex, double radius) {
        super(vertex);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4d * Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getVolume() {
        return (4d / 3d) * Math.PI * Math.pow(this.radius, 3);
    }

    @Override
    public String toString() {
        return String.format(
                "Sphere {Radius = %.2f, Volume = %.2f, Area = %.2f, Vertices = %s",
                this.radius,
                this.getVolume(),
                this.getArea(),
                this.getVertexes());
    }
}
