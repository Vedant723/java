package dkte.com;
import java.util.Scanner;
public class StringLength {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter string:");
		s=sc.nextLine();
		try {
			if(s.length()>80) {
				throw new ExceptionLineTooLong();
			}
			else {
				System.out.println("Length of string is " + s.length());
			}
		}
		catch(ExceptionLineTooLong e) {
			System.out.println(e.getMessage());
		}
	}
}
