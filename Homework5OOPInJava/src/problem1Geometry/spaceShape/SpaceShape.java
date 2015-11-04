package problem1Geometry.spaceShape;

import problem1Geometry.interfaces.AreaMeasurable;
import problem1Geometry.interfaces.VolumeMeasurable;
import problem1Geometry.shape.Shape;
import problem1Geometry.shape.Vertex3D;

public abstract  class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(Vertex3D... vertexes) {
        super.addVertices(vertexes);
    }

    public double getVolume(){
        return 0;
    }

    public double getArea(){
        return 0;
    }
}
