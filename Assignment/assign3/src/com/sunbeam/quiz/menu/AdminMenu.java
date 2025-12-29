package com.sunbeam.quiz.menu;

import java.util.Scanner;

public class AdminMenu {
	private static int adminMenuOptions(Scanner sc) {
	System.out.println("0.SignOut");
	System.out.println("1.Add a new quiz");
	System.out.println("2.Schedule quiz");
	System.out.println("3.Display all students");
	System.out.println("4.Find student");
	System.out.println("5.Delete student");
	System.out.println("6.Update student");
	System.out.println("Enter choice:");
	return sc.nextInt();
	}
	public static void adminMenu(Scanner sc) {
	int choice;
		while ((choice=adminMenuOptions(sc))!=0) {
			switch(choice) {
			case 1:
				System.out.println("Add a new Quiz Case Selected");
				break;
			case 2:
				System.out.println("Schedule quiz Case Selected");
				break;
			case 3:
				System.out.println("Display all students Case Selected");
				break;
			case 4:
				System.out.println("Find student Case Selected");
				break;
			case 5:
				System.out.println("Delete studen Case Selected");
				break;
			case 6:
				System.out.println("Update student Case Selected");
				break;
			default:
				System.out.println("Wrong choice");
			}
		}
	}
}