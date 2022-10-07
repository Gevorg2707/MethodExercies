import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        ClassCountWord classCountWord=new ClassCountWord();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Test Data:");
        System.out.print("Input the string: ");
        String txt=scanner.nextLine();
        System.out.println("Expected Output: "+classCountWord.methodCountWord(txt));
    }
}
class ClassCountWord {
    int methodCountWord(String sentence) {
        int countofword = 1;
        sentence=sentence.trim();
        char[] txtCharArray = sentence.toCharArray();
        for (int i = 0; i < sentence.length(); i++) {
            if (txtCharArray[i] ==' ') {
                countofword++;
            }
        }
        return countofword;
    }
}


/*Write a Java method to count all words in a string.
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output: Number of words in the string: 9 */