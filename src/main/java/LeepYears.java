import java.util.Scanner;

public class LeepYears {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input year: ");
        int year=scanner.nextInt();
        methodIsLeep(year);
    }
    public static void methodIsLeep(int year1) {
        boolean iflean = false;
        if((year1%4)==0 && ((year1%100!=0)&&(year1%400==0))) {
          iflean=true;
        }
        System.out.println(iflean);

        return;
    }
}
    /*

 Write a Java method to check whether a year (integer) entered by the user is a leap year or not.
Expected Output:
Input a year: 2017
false
     */