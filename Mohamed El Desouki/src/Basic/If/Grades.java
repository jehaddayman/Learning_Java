package Basic.If;
import java.util.Scanner;
public class Grades {
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter Your Grade Please:");
    int grade= input.nextInt();
    if(grade>=90 && grade<=100)
        System.out.println("You Get A ");
    else if (grade>=80 && grade<90)
        System.out.println("You Get B");
        else if (grade>=60 && grade<80)
        System.out.println("You Get C");
        else if (grade>=50 && grade<60)
        System.out.println("You Get D");
        else
        System.out.println("You Get F");
    }
    }


