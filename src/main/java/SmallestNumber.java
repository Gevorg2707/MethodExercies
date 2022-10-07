import java.util.Scanner;
class NumSmall {


    int smallest(int number1,int number2,int number3){
        int smallNumber = 0;

        if (number1<number2&&number1<number3)
            smallNumber=number1;
        if (number2<number1&&number2<number3)
            smallNumber=number2;
        if (number3<number1&&number3<number2)
            smallNumber=number3;

        return smallNumber;
    }
}
public class SmallestNumber {
    public static void main(String[] args) {
        NumSmall numSmall=new NumSmall();
        Scanner scanner=new Scanner(System.in);
        int num1,num2,num3,smalNum;
        System.out.print("Input the first number: ");
        num1=scanner.nextInt();
        System.out.print("Input the Second number:");
        num2=scanner.nextInt();
        System.out.print("Input the third number: ");
        num3=scanner.nextInt();
        System.out.println("Expected Output: The smallest value is "+numSmall.smallest(num1,num2,num3));


    }
}
/*Write a Java method to find the smallest number among three numbers.
 Test Data:
 Input the first number: 25
 Input the Second number: 37
 Input the third number: 29
 Expected Output: The smallest value is 25.0 */