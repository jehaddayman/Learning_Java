package Basic.If;
import java.util.Scanner;
public class Choice {
    public static void main(String[] args) {
        int choice, num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("1-Add two numbers");
        System.out.println("2-Get the double of a positive number");
        System.out.println("3-Get the square of a number");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1-Add two numbers");
                num1= input.nextInt();
                num2= input.nextInt();
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println("2-Add two numbers");
                num1= input.nextInt();
                num2= input.nextInt();
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println("3-Enter positive number");
                num1= input.nextInt();
                if (num1>0){
                System.out.println(num1*num1);
                break;
                }
            default:
                System.out.println("Invalid Value");
        }
    }
}
