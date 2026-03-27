package Basic.If;
import java.util.Scanner;
public class PositiveorNagative {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int x;
    System.out.println("Enter X");
    x= input.nextInt();
    if(x>0)
        System.out.println("X is Positive Number");
    else
        System.out.println("X is Negative Number");




}
}
