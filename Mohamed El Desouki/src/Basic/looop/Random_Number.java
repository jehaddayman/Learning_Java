package Basic.looop;
import java.util.Scanner;
public class Random_Number {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int guess,rand;
        rand=(int)(Math.random()*100);
        boolean stillplaying=true;
        System.out.println("The Generated random number is "+rand);
        while (stillplaying){
            System.out.println("Guess a number between 0 and 100");
            guess= input.nextInt();
            if (guess>rand)
                System.out.println("Guess too large");
            else
                if(guess<rand)
                    System.out.println("Guess too small");
                else
                {
                    System.out.println("You Win");
                    stillplaying=false;
                }
        }
    }
}
