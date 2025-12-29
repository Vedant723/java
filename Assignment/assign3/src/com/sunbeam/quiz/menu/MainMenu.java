package com.sunbeam.quiz.menu;
import java.util.Scanner;
enum EMainMenu{
	EXIT,Signin,Signup,Admin
}
public class MainMenu {
	public static void mainMenuWithEnum(Scanner sc) {
		EMainMenu[] arr=EMainMenu.values();
		EMainMenu enumChoice;
		do {
			for(EMainMenu element:arr) 
				System.out.println(element.ordinal() + ". " + element.name());
			
			System.out.println("Enter choice:");
			int choice=sc.nextInt();
			enumChoice=arr[choice];
			switch(enumChoice){
			case EXIT:
				System.out.println("Thank you for using our application");
				break;
			case Signin:
				System.out.println("You have selected signin case");
				SignInMenu.signInMenu(sc);
				break;
			case Signup:
				System.out.println("You have selected signup case");
				break;
			
			case Admin:
				System.out.println("You have selected signin case");
				AdminMenu.adminMenu(sc);
				break;
			default:
				System.out.println("Wrong choice");
			}	
		}while(enumChoice!=EMainMenu.EXIT);
	}
	
	private static int mainMenuOptions(Scanner sc) {
	System.out.print("0.EXIT");
	System.out.print("1.Signin");
	System.out.print("2.Signup");
	System.out.print("3.Admin");
	System.out.println("Enter choice:");
	return sc.nextInt();
	}
	public static void mainMenu(Scanner sc) {
		int choice;
		while ((choice=mainMenuOptions(sc))!=0) {
			switch(choice) {
			case 1:
				System.out.println("You have selected SignIn case");
				SignInMenu.signInMenu(sc);
				break;
			case 2:
				System.out.println("You have selected SignUp case");
				break;
			case 3:
				System.out.println("You have selected Admin case");
				AdminMenu.adminMenu(sc);
				break;
			default:
				System.out.println("Wrong choice");
			}
		}
	}
}
