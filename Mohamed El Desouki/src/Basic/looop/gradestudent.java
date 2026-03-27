package Basic.looop;
import java.util.Scanner;
public class gradestudent {
    public static void main(String[] args){
           int grade=0 , sum=0,counter=1;
            Scanner input=new Scanner(System.in);
        System.out.println("Enter 5 grades to get the average or -1 to exit");
        while (counter<=5 && grade!=-1){
            System.out.println("Enter Grade For Student No "+counter);
            grade= input.nextInt();
            sum+=grade;
            counter++;
        }
        System.out.println("Average of the 5 Grades is "+sum/5 );

        }
    }
