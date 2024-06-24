import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {

        double num1, num2;
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers:");

		num1 = sc.nextDouble();
		num2 = sc.nextDouble();

		System.out.println("Enter the operator (+,-,*,/):");
		char op = sc.next().charAt(0);
		double res = 0;

		switch (op) {
		case '+':
		  res = num1 + num2;
			break;

		case '-':
		  res = num1 - num2;
			break;

		case '*':
		  res = num1 * num2;
			break;

		case '/':
		  res = num1 / num2;
			break;

		default:
		  System.out.println("You entered the wrong input");
		}

	System.out.println("The final result: ");
	System.out.println(num1 + " " + op + " " + num2 + " = " + res);
    }
}
