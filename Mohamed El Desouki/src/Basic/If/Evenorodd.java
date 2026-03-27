package Basic.If;
import java.util.Scanner;
public class Evenorodd {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number;
        System.out.println("Enter number to test:");
        number= input.nextInt();
        if(number % 2 ==0)
            System.out.println("The Number is Even");
        else
            System.out.println("The Number is odd");
    }
}
