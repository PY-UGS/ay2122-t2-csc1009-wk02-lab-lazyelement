//Question 1:

import java.util.Scanner;
 
public class AreaofCircle {
     
    public static void main(String[] args) {
        System.out.print("Enter radius of circle: ");
        Scanner input = new Scanner(System.in);
        Double radius = input.nextDouble();
         
        Double area = Math.PI * radius * radius;        
        System.out.println("The Area for the circle of radius " +radius + " is " +area);
        input.close( ); 
    }
}
           


