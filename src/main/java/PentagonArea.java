import java.util.Scanner;

public class PentagonArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double area;
        System.out.print("Input the number of sides: ");
        double numberofside=scanner.nextDouble();
        System.out.print("Input the side: ");
        double side=scanner.nextDouble();
        System.out.print("The area of the pentagon is ");
        double areaofpentagon=methodPentagonArea(numberofside,side);
        System.out.print(areaofpentagon);
    }
    public static double methodPentagonArea(double numnerside, double side) {
        double apothem=side/(2*Math.tan(Math.PI/numnerside));
        double area=side*numnerside*apothem/2;
        return area;
    }
}
/*
 Write a Java method to calculate the area of a pentagon.
Expected Output:
Input the number of sides: 5
Input the side: 6
The area of the pentagon is 61.93718642120281
 */