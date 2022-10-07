import java.util.Scanner;

public class NumAverage {
    public static void main(String[] args) {
        NumAv numAv=new NumAv();
        Scanner scanner=new Scanner(System.in);
        double num1,num2,num3,smalNum;
        System.out.print("Input the first number: ");
        num1=scanner.nextInt();
        System.out.print("Input the Second number:");
        num2=scanner.nextInt();
        System.out.print("Input the third number: ");
        num3=scanner.nextInt();
        System.out.println("Expected Output: The average of three numbers is "+numAv.averageNumbers(num1,num2,num3));
    }
}
class  NumAv {
    double averageNumbers(double number1, double number2, double number3) {
        double averageNum=(number1+number2+number3)/3;
        return averageNum;
    }
}

/* Write a Java method to compute the average of three numbers.
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:*/