package learn.java.io.fileReadWriteBuffer;

import java.util.Scanner;

public class scannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = sc.next();
		System.out.println("Enter Your Phone No: ");
		long phno	= sc.nextLong();
		System.out.println("Enter Your Height ");
		double height	= sc.nextDouble();
		
		System.out.println(name);
		System.out.println(phno);
		System.out.println(height);
	
	}

}
