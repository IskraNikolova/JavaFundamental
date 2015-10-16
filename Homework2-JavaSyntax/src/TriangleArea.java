import java.util.Scanner;
/*
Write a program that enters 3 points in the plane (as integer x and y coordinates),
 calculates and prints the area of the triangle composed by these 3 points. Round the result to a whole number.
 In case the three points do not form a triangle, print "0" as result.
 */
public class TriangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("(ay, ax) = ");
        int ay = input.nextInt();
        int ax = input.nextInt();

        System.out.print("(by, bx) = ");
        int by = input.nextInt();
        int bx = input.nextInt();

        System.out.print("(cy, cx) = ");
        int cy = input.nextInt();
        int cx = input.nextInt();

        int area = (ax*(by - cy) + bx*(cy - ay) + cx*(ay - by))/2;
        System.out.printf("Triangle area is: %d%n", area);
    }

}
