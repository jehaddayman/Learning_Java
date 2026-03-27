package Basic.looop;

import java.util.Scanner;

public class sumoddandeven {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num,sumodd=0,sumeven=0;
        for(int i=1;i<=10;i++){
            System.out.println("Enter Number"+i);
            num= input.nextInt();
            if(num%2==0)
               sumodd+=num;
            else
                sumeven+=num;
        }
        System.out.println("sumodd is "+sumodd);
        System.out.println("sumeven is "+sumeven);
    }
}
