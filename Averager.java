/**
*
* Reads in scores until a negative value is encountered, at which point it determines and prints the average
*
* @author <your name here>
* @version <date you finished the code>
*
*/

import java.util.Scanner;

public class Averager {
	
	public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);
      double NumTotal = 0.0;
      double NumEntered = 0.0;
      System.out.println("Enter a percentage grade, enter -1 when finished");
      double NumAdd = scnr.nextDouble();
      while (NumAdd != -1) { // while addCalories does NOT have the value of -1
         NumTotal = NumTotal + NumAdd;
         NumEntered = NumEntered + 1;
         System.out.println("Enter a percentage grade, enter -1 when finished");

         NumAdd = scnr.nextDouble();
       }
       
       System.out.println("Your grade average is " + NumTotal / NumEntered + " %");
     }
}