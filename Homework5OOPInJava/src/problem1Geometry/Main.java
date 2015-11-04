package problem1Geometry;

import problem1Geometry.planeShape.Circle;
import problem1Geometry.planeShape.PlaneShape;
import problem1Geometry.planeShape.Rectangle;
import problem1Geometry.planeShape.Triangle;
import problem1Geometry.shape.Shape;
import problem1Geometry.shape.Vertex2D;
import problem1Geometry.shape.Vertex3D;
import problem1Geometry.spaceShape.Cuboid;
import problem1Geometry.spaceShape.SpaceShape;
import problem1Geometry.spaceShape.Sphere;
import problem1Geometry.spaceShape.SquarePyramid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Vertex2D a = new Vertex2D(11,3);
        Vertex2D b = new Vertex2D(-3,4);
        Vertex2D c = new Vertex2D(40,13);
        Vertex3D v1 = new Vertex3D(-3,-2,1);
        Vertex3D v2 = new Vertex3D(13,-12,13);
        Vertex3D v3 = new Vertex3D(1,1,1);

        double height = 20;
        double width = 8;
        double radius = 5;
        Triangle triangle = new Triangle(a, b, c);
        Rectangle rectangle = new Rectangle(b, height, width);
        Circle circle = new Circle(c, 5);
        Sphere sphere = new Sphere(v1, radius);
        height = 13;
        width = 3;
        double depht = 23;
        Cuboid cuboid = new Cuboid(v2, height, width, depht);
        SquarePyramid squarePyramid = new SquarePyramid(v3, width ,height);
        Shape[] shapes = new Shape[6];
        shapes[0] = triangle;
        shapes[1] = rectangle;
        shapes[2] = circle;
        shapes[3] = sphere;
        shapes[4] = cuboid;
        shapes[5] = squarePyramid;

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }


        List<Shape> list = new ArrayList<>();
        Collections.addAll(list,shapes);

        list.stream()
                .filter(x -> x instanceof SpaceShape)
                .map(x -> (SpaceShape) x)
                .filter(x -> x.getVolume() > 40)
                .forEach(System.out::println);


        list.stream()
                .filter(x -> x instanceof PlaneShape)
                .map(x -> (PlaneShape) x)
                .sorted((x1, x2) -> x1.compareTo(x2))
                .forEach(System.out::println);
    }
}
