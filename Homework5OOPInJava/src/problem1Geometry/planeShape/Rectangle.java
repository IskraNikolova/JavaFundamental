package problem1Geometry.planeShape;

import problem1Geometry.shape.Vertex2D;

public class Rectangle extends PlaneShape {
    private Vertex2D vertex;
    private double width;
    private double height;

    public Rectangle(Vertex2D vertex,double height,double width){
        super(vertex);
        this.width=width;
        this.height=height;
    }

    public Vertex2D getVertex() {
        return vertex;
    }

    public void setVertex(Vertex2D vertex) {
        this.vertex = vertex;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter(){
        return 2*(this.width+this.height);
    }

    @Override
    public double getArea(){
        return this.height*this.width;
    }

    @Override
    public String toString() {
        return String
                .format("Rectangle {area=%.2f, perimeter=%.2f, Height=%.2f, Width=%.2f, Vertices=%s}"
                        ,this.getArea(), this.getPerimeter()
                        , this.height, this.width,  this.getVertexes());
    }

    public int compareTo(Object object) {
        PlaneShape plane = (PlaneShape)object;
        if(this.getPerimeter()>plane.getPerimeter()) {
            return 1;
        } else if(this.getPerimeter()<plane.getPerimeter()) {
            return -1;
        }else {
            return 0;
        }
    }
}
