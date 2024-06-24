import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers:");

	  double num1 = sc.nextDouble();
	  double num2 = sc.nextDouble();

		System.out.println("Choose an operator (+,-,*,/):");
		char operator = sc.next().charAt(0);
		double result = 0;

		switch (operator) {
		case '+':
		  result = num1 + num2;
			break;

		case '-':
		  result = num1 - num2;
			break;

		case '*':
		  result = num1 * num2;
			break;

		case '/':
		  result = num1 / num2;
			break;

		default:
		  System.out.println("Invalid operator!");
		}

	System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
