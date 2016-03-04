package Lab4;

import java.util.Scanner;

public class Chapter6Lab4 {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		int width, width2, length, length2;
		
		System.out.print("Tract #1\n");
		System.out.print("Length: ");
		length = keys.nextInt();
		
		System.out.print("Width: ");
		width = keys.nextInt();
		
		LandTract farm = new LandTract(length, width);
		
		System.out.print("Tract #2\n");
		System.out.print("Length: ");
		length2 = keys.nextInt();
		
		System.out.print("Width: ");
		width2 = keys.nextInt();
		
		LandTract farm2 = new LandTract(length2, width2);
		
		System.out.println(farm.toString());
		System.out.println(farm2.toString());
		
		if(farm.equals(farm2))
			System.out.println("farm 1 and farm 2 are the same size");
		else
			System.out.println("farm 1 and farm 2 are not the same size");
		
		
		keys.close();
	}

}
