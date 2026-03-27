package Basic;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Length: ");
        int Length= input.nextInt();
        System.out.println("Enter Width: ");
        int Width= input.nextInt();
        int Area=Length*Width;
        System.out.println("Area is "+Area);
    }
}
