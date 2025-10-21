package assignment1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String Fullname=sc.nextLine();
		int rollNumber=sc.nextInt();
		String Grade=sc.next();
		int percent=sc.nextInt();
		System.out.println(Fullname);
		System.out.println(rollNumber);
		System.out.println(Grade);
		System.out.println(percent + "%");
	}
}