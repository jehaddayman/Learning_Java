package Basic.If;
import java.util.Scanner;
public class Switch_Grade {
    public Switch_Grade() {
    }

    public static void main(String[] args){
        char grade;
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter Your Grade");
        grade=reader.next().charAt(0);

        switch(grade)
        {
            case 'A':
                System.out.println("Excellent");
               break;
            case 'B':
                System.out.println("Very Good");
                break;
                case 'C':
                System.out.println("Good");
                break;
                case 'D':
                System.out.println("Fair");
                break;
                case 'F':
                System.out.println("Failer");
                 break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}
