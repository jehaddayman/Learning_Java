package Basic.looop;

import java.util.Scanner;

public class option {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int option;
        int num1=20,num2=10;

        do {
            System.out.println("Select an option from menu");
            System.out.println("1.sum 2 numbers");
            System.out.println("2.subtract 2 numbers");
            System.out.println("3.Divide 2 numbers");
            System.out.println("0.Exit");
            option= input.nextInt();
            switch (option){
                case 1:
                    System.out.println("sum is "+num1+num2);
                    break;
                case 2:
                    System.out.println("sub is "+(num1-num2));
                    break;
                case 3:
                    System.out.println("divide is "+num1/num2);
                    break;
                case 0:
                    System.out.println("Good Bye");
                    break;
                default:
                    System.out.println("invalid option");
break;
            }
        }
        while (option!=0);
        System.out.println("");

    }
}
