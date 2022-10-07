import java.util.Scanner;

public class CountAllVowels {
    public static void main(String[] args) {
        ClassCountVowel classCountVowel= new ClassCountVowel();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input the string: ");
        String txt=scanner.nextLine();
        System.out.println("Number of Vowels in the string: "+classCountVowel.methodcountvowels(txt));
    }
}
class ClassCountVowel {
    int methodcountvowels(String text) {
        int countofvow = 0;
        char[] txtCharArray = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (txtCharArray[i] == 'a'
                    || txtCharArray[i] == 'e'
                    || txtCharArray[i] == 'i'
                    || txtCharArray[i] == 'o'
                    || txtCharArray[i] == 'u') {
                countofvow++;
            }
        }
        return countofvow;
    }
}
/* Write a Java method to count all vowels in a string.
Test Data:
Input the string: w3resource Expected Output:
Number of Vowels in the string: 4*/