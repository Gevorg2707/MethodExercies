import java.util.Scanner;

public class PrintChahracters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input number: ");
        int  num=scanner.nextInt();
        char letter1='(';
        char letter2='z';
        methodPrintLetters(letter1,letter2,num);
    }
    public static void methodPrintLetters(char let1,char let2,int num1){
        int i=1;
        for (char j =let1; j <=let2 ; j++) {
            System.out.print(j + " ");
            if(i%num1==0) System.out.print("\n");
            i++;


        }
    }


}
/*
Write a Java method to print characters between two characters (i.e. A to P ).

Note: Prints 20 characters per line
Expected Output:
( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;
 < = > ? @ A B C D E F G H I J K L M N O
 P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c
 d e f g h i j k l m n o p q r s t u v w
 x y z
 */