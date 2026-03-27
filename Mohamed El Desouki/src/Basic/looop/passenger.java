package Basic.looop;

import java.util.Scanner;

public class passenger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char passclass;
        double bagweight;
        double excessweight = 0;
        double charge = -1;
        int numberofpassengers, numberofgroups;
        System.out.println("Please enter number of groups");
        numberofgroups = input.nextInt();
        for (int groupcounter = 1; groupcounter <= numberofgroups; groupcounter++) {
            System.out.println("Please enter number of passenger for group number" + groupcounter);
            numberofpassengers = input.nextInt();
            for (int counter = 1; counter <= numberofpassengers; counter++) {
                System.out.println("Please enter passenger’s class");
                passclass = input.next().charAt(0);
                System.out.println("Please enter Bag weight");
                bagweight = input.nextDouble();
                switch (passclass) {
                    case 'f':
                    case 'F':
                        if (bagweight > 30) {
                            excessweight = bagweight - 30;
                            charge = excessweight * 10;
                        }
                        break;
                    case 'b':
                    case 'B':
                        if (bagweight > 25) {
                            excessweight = bagweight - 25;
                            charge = excessweight * 10;
                        }
                        break;
                    case 'e':
                    case 'E':
                        if (bagweight > 20) {
                            excessweight = bagweight - 20;
                            charge = excessweight * 10;
                        }
                        break;
                    default:
                        System.out.println("You Entered Invalid Class");
                }
                System.out.println("You have to pay extra charge equal" + charge);
            }
        }
    }
}
