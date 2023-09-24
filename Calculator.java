package prac;

import java.util.Scanner;

public class Calculator {

	int a, b;
	Scanner sc = new Scanner(System.in);

	int addition() {
		System.out.println("Enter 2 numbers for addition : ");
		a = sc.nextInt();
		b = sc.nextInt();
		return (a + b);
	}

	int subtraction() {
		System.out.println("Enter 2 numbers for subtraction : ");
		a = sc.nextInt();
		b = sc.nextInt();
		return (a - b);
	}

	int multiplication() {
		System.out.println("Enter 2 numbers for multiplication : ");
		a = sc.nextInt();
		b = sc.nextInt();
		return (a * b);
	}

	int division() {
		System.out.println("Enter 2 numbers for division : ");
		a = sc.nextInt();
		b = sc.nextInt();
		return (a / b);
	}

	void normal() {
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter the number");
		int choice = sc.nextInt();
		int ans = 0;
		switch (choice) {
		case 1:
			ans = addition();
			break;
		case 2:
			ans = subtraction();
			break;
		case 3:
			ans = multiplication();
			break;
		case 4:
			ans = division();
			break;
		default:
			System.out.println("Wrong Selection");
		}
		System.out.println("Answer  =  " + ans);
	}

	int power() {
		System.out.println("Enter 2 numbers for power : ");
		a = sc.nextInt();
		b = sc.nextInt();
		return ((int) Math.pow(a, b));
	}

	int squareRoot() {
		System.out.println("Enter the number for Square root : ");
		a = sc.nextInt();
		return ((int) Math.sqrt(a));
	}

	int maximum() {
		System.out.println("Enter 2 numbers for maximum : ");
		a = sc.nextInt();
		b = sc.nextInt();
		return (Math.max(a, b));
	}

	int minimum() {
		System.out.println("Enter 2 numbers for minimum : ");
		a = sc.nextInt();
		b = sc.nextInt();
		return (Math.min(a, b));
	}

	void scientific() {
		System.out.println("1. Power ");
		System.out.println("2. Square root ");
		System.out.println("3. Maximum ");
		System.out.println("4. Minimum ");
		System.out.println("Enter the choice : ");
		int choice = sc.nextInt();
		int ans = 0;
		switch (choice) {
		case 1:
			ans = power();
			break;
		case 2:
			ans = squareRoot();
			break;
		case 3:
			ans = maximum();
			break;
		case 4:
			ans = minimum();
			break;
		default:
			System.out.println("Wrong Selection !! ");
		}
		System.out.println("Answer  =  " + ans);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Calculator obj = new Calculator();
		System.out.println("1. Normal Calculation");
		System.out.println("2. Scientific Calculation");
		System.out.println("Enter the choice : ");
		int choice = s.nextInt();
		switch (choice) {
		case 1:
			obj.normal();
			break;
		case 2:
			obj.scientific();
			break;
		default:
			System.out.println("Wrong Input!!!");
		}

	}

}
