package Basic.If;
import java.util.Scanner;
public class nubmerequal {
    public static void main(String[] args){
        int number1 , number2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        number1=input.nextInt();
        number2=input.nextInt();

        if(number1==number2)
            System.out.println("Equals");
        else if(number1>number2)
            System.out.println("Number1 is Greater ");
        else
            System.out.println("Number2 is Greater");

    }
}
