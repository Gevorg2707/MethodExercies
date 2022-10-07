import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input the investment amount: ");
        double in=scanner.nextDouble();
        System.out.print("Input the rate of interest: ");
        double ra=scanner.nextDouble()*0.01;
        System.out.print("Input number of years: ");
        double ny=scanner.nextDouble();
        System.out.println("Expected Output:Years FutureValue" );
        methodfutherInvestValue(in,ra,ny);
    }
public static void methodfutherInvestValue(double investment_amount,double rate_of_interest, double number_of_years ) {
    for (int i = 1; i <= number_of_years; i++) {
        double fv=investment_amount*Math.pow(1+rate_of_interest,i);
        System.out.printf(i+": "+"%.2f\n",fv);
    }

         return;
}
}
/*
Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
Sample data (Monthly compounded) and Output:
Input the investment amount: 1000
Input the rate of interest: 10
Input number of years: 5
Expected Output:Years FutureValue
1 1104.71
2 1220.39
3 1348.18
4 1489.35
5 1645.31

 */