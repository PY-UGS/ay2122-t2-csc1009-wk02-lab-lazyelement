//Question 2:

import java.util.Scanner;

public class AvgofNum {
    public static void main(String[] args) {
        System.out.print("Enter 3 numbers: ");
        Scanner input = new Scanner(System.in);
        Float num1 = input.nextFloat();
        Float num2 = input.nextFloat();
        Float num3 = input.nextFloat();
        Float avgNo = (num1 + num2 + num3) / 3;

        System.out.println("The Average of " + num1 + " " + num2 + " " + num3 + " " + " is " + avgNo);
        input.close();
    }
}
