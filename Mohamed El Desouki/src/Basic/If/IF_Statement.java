package Basic.If;
import java.util.Scanner;
public class IF_Statement {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int mark;
        String name;
        System.out.println("Enter Your name:");
        name= input.next();
        System.out.println("Enter Your mark:");
        mark= input.nextInt();

        if (mark>=60)
            System.out.println("You are pass, Congratulations "+name+"\nGo The Next Level");
        else
            System.out.println("You are fail");
    }


}
