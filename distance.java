package monday;

import java.util.Scanner;

public class BasicOperation {

	public static void main(String[] args) {
		
Scanner scan = new Scanner (System.in);
		
		//double variable 'distance' declared
        double distance;
        //coordinates value taking input from user
        System.out.println("Enter x1 value: ");
        int x1=scan.nextInt();
        
        System.out.println("Enter y1 value: ");
        int y1=scan.nextInt();
        
        System.out.println("Enter x2 value: ");
        int x2=scan.nextInt();
        
        System.out.println("Enter y2 value: ");
        int y2=scan.nextInt();
        
        //finding distance between two points
        distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));    
        System.out.format("Distance: " + "%.4f%n", distance);
        
	}
}
