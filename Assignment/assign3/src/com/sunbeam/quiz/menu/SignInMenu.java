package com.sunbeam.quiz.menu;

import java.util.Scanner;

public class SignInMenu {

		private static int signInMenuOptions(Scanner sc) {
		System.out.print("0.SignOut");
		System.out.print("1.Attempt Quiz");
		System.out.print("2.Display Marks");
		System.out.print("3.Display Profile");
		System.out.print("4.Update Mobile");
		System.out.println("Enter choice:");
		return sc.nextInt();
		}
		public static void signInMenu(Scanner sc) {
			int choice;
			while ((choice=signInMenuOptions(sc))!=0) {
				switch(choice) {
				case 1:
					System.out.println("Attempt Quiz Case Selected");
					break;
				case 2:
					System.out.println("Display Marks Case Selected");
					break;
				case 3:
					System.out.println("Display Profile Case Selected");
					break;
				case 4:
					System.out.println("Update Mobile Case Selected");
					break;
				default:
					System.out.println("Wrong choice");
				}
			}
		}
		
}
