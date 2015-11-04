package problem1Geometry.planeShape;


import problem1Geometry.shape.Vertex2D;

public class Circle extends PlaneShape{
    private Vertex2D vertex;
    private double radius;

    public Vertex2D getVertex() {
        return vertex;
    }

    public void setVertex(Vertex2D vertex) {
        this.vertex = vertex;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(Vertex2D vertex, double radius) {
        super(vertex);
        this.radius = radius;

    }

    @Override
    public double getPerimeter(){
        return 2 * (Math.PI * this.radius);
    }

    @Override
    public double getArea() {
        return Math.pow(Math.PI * this.radius, 2);
    }

    @Override
    public String toString() {
        return String
                .format("Circle {area=%.2f, perimeter=%.2f, Radius=%.2f,  Vertices=%s}"
                        ,this.getArea(), this.getPerimeter()
                        , this.radius,   this.getVertexes());
    }

    @Override
    public int compareTo(Object obj) {
        PlaneShape plane = (PlaneShape)obj;
        if(this.getPerimeter()>plane.getPerimeter()) {
            return 1;
        } else if(this.getPerimeter()<plane.getPerimeter()) {
            return -1;
        }else {
            return 0;
        }
    }
}
