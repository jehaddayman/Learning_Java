package Basic.If;
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int number = input.nextInt();
        if (number > 0)

            if (number % 2 == 0) {
                System.out.println("Number is Even");
                System.out.println("Number is Positive");
            }
        else {
                System.out.println("Number is odd");
                System.out.println("Number is Positive");
            }
        else
            System.out.println("Negative Number");
    }
}