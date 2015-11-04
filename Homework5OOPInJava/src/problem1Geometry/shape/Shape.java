package problem1Geometry.shape;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    private List<Vertex> vertexes;

    public Shape() {
        this.vertexes = new ArrayList<Vertex>();
    }

    public List<Vertex> getVertexes() {
        return vertexes;
    }

    public void addVertices(Vertex... verteces) {
        for (Vertex vertex : verteces) {
            this.vertexes.add(vertex);
        }
    }
}
