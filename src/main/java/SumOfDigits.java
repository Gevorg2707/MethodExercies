import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Test Data: ");
        System.out.print("Input an integer: ");
        int num=scanner.nextInt();
        System.out.println("Expected Output: "+methodSumOfDigit(num));
    }

    public static int methodSumOfDigit(int number){
        int varsumofdigit=0;
        while (number>0) {
                varsumofdigit = (number - number / 10 * 10) + varsumofdigit;
                number = number / 10;
        }
        return varsumofdigit;
    }
}
/*
Write a Java method to compute the sum of the digits in an integer.
Test Data:
Input an integer: 25
Expected Output:
The sum is
*/