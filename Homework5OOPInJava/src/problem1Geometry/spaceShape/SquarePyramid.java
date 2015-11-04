package problem1Geometry.spaceShape;

import problem1Geometry.shape.Vertex3D;

public class SquarePyramid extends SpaceShape{
    private double  baseWidth;
    private double height;

    public SquarePyramid( Vertex3D vertex, double baseWidth, double height) {
        super(vertex);
        this.baseWidth = baseWidth;
        this.height = height;
    }

    public double getVertexWidth() {
        return baseWidth;
    }

    public void setVertexWidth(double vertexWidth) {
        this.baseWidth = vertexWidth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (this.baseWidth * this.baseWidth)
                + ((this.baseWidth * 2) * Math.sqrt(((this.baseWidth * this.baseWidth) / 4) + (this.height * this.height)));

    }

    @Override
    public double getVolume() {
        return (this.baseWidth * this.baseWidth) * (this.height / 3);
    }

    @Override
    public String toString() {
        return String.format(
                "Square Pyramid{Base Width = %.2f, Height = %.2f, Volume = %.2f, Area = %.2f, Vertices = %s",
                this.baseWidth,
                this.height,
                this.getVolume(),
                this.getArea(),
                this.getVertexes());
    }
}
