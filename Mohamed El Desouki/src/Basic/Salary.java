package Basic;
import java.util.Scanner;
public class Salary {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=input.next();
      System.out.println("Enter your salary:");
      float salary= input.nextFloat();
      float net_salary=salary-(salary*0.10f);
      System.out.println(name+" is Net Salary = "+net_salary);
    }
}
