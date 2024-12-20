package in.demo;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double mockRate;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your mock rating");
		mockRate=sc.nextDouble();
		System.out.println(mockRate);
		
		if(mockRate<=10 && mockRate>=8.5) {
			System.out.println("eligible for first priority drives");
		}
		else if(mockRate >=6.5 && mockRate<=8.5) {
			System.out.println("eligible for drives");
		}
		else if(mockRate>=1 && mockRate<=6.5) {
			System.out.println("not eligible for drives");
		}
		else if(mockRate>=10) {
			System.out.println("no comments");
		}
		else {
			System.out.println("disqualified from studies");
		}
		
		
	}
}
