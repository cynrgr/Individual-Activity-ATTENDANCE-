package monday;

import java.util.Scanner;

public class BasicOperation {
	 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		 int x = scan.nextInt();
		 int y = scan.nextInt();
		 int z = scan.nextInt();
		 
		 int S = x + y + z;
		 int A = S / 3;
		 int P = x * y * z;
		
		System.out.println ("Sum: " + S);
		System.out.println ("Average: " + A);
		System.out.println ("Product: " + P);
		
		scan.close();
    
	}

}
