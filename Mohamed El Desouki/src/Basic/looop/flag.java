package Basic.looop;
    import java.util.Scanner;
    public class flag {
        public static void main(String[] args){
           double value,sum=0.0;
           boolean positive=true;
            Scanner input=new Scanner(System.in);
            while (positive==true){
                System.out.println("Enter The next Positive Number ");
                value=input.nextDouble();
                if(value<0)
                    positive=false;
                else
                    sum+=value;

            }
            System.out.println("sum is "+sum);
        }
}


