package problem1Geometry.planeShape;


import problem1Geometry.shape.Vertex2D;

public class Triangle extends PlaneShape {
    private double A;
    private double B;
    private double C;

    public Triangle(Vertex2D  a, Vertex2D b, Vertex2D c) {
        super(a,b,c);
        A = distanceBetweenVeteces(a,b);
        B = distanceBetweenVeteces(b,c);
        C = distanceBetweenVeteces(c,a);
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        C = c;
    }

    @Override
    public double getPerimeter(){
        return this.getA()+this.getB()+this.getC();
    }

    @Override
    public double getArea(){
        double halfPerimeter=this.getPerimeter()/2;
        return Math.sqrt((halfPerimeter - this.getA()) * (halfPerimeter - this.getB()) * (halfPerimeter - this.getC()));
    }


    private double distanceBetweenVeteces(Vertex2D v1, Vertex2D v2){
        return Math.sqrt(Math.pow(v2.getX() - v1.getX(), 2) + Math.pow(v2.getY() - v1.getY(), 2));

    }

    @Override
    public String toString() {
        return String
                .format("Triangle{area = %.2f, perimeter = %.2f, A = %.2f, B=%.2f, C = %.2f, Vertices = %s}",
                        this.getArea(), this.getPerimeter()
                        , this.A, this.B, this.C, this.getVertexes());
    }


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
