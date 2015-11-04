package problem1Geometry.planeShape;

import problem1Geometry.interfaces.AreaMeasurable;
import problem1Geometry.interfaces.PerimeterMeasurable;
import problem1Geometry.shape.Shape;
import problem1Geometry.shape.Vertex2D;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable, Comparable {
    private double perimeter;
    public PlaneShape(Vertex2D... vertexes) {
        super.addVertices(vertexes);
        this.perimeter=this.getPerimeter();
    }


    public double getPerimeter(){
        return 0;
    }

    public double getArea(){
        return 0;
    }
}

