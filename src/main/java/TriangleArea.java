import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Side1: ");
        double side1=scanner.nextDouble();
        System.out.print("Side2: ");
        double side2=scanner.nextDouble();
        System.out.print("Side3: ");
        double side3=scanner.nextDouble();
        System.out.print("The area of the triangle is ");
        double area=methodCalculateTriangle(side1,side2,side3);
        System.out.println(area);
    }
    public static double methodCalculateTriangle(double side1, double side2, double side3){
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
}
   /*
   Write Java methods to calculate the area of a triangle. Go to the editor
        Expected Output:
        Input Side-1: 10
        Input Side-2: 15
        Input Side-3: 20
        The area of the triangle is 72.6184377413890

    */