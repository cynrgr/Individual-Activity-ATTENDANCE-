package monday;

import java.util.Scanner;

public class BasicOperation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
     
        System.out.println("Enter year: ");
        int year = scan.nextInt();
        
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Indicated year is a leap year");
         else
            System.out.println("Indicated year is not a leap year");
      }
}
