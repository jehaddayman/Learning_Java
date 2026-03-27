package Basic.If;
import java.util.Scanner;
public class Vowel {
    public static void main(String[] args){
        char ch;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter character to test");
        ch=input.next().charAt(0);
        switch (ch){
            case 'a':
            case'e':
            case'i':
            case'u':
            case'o':
                System.out.println("This is the vowel");
                break;
            default:
                System.out.println("Normal character");
        }
    }
}
