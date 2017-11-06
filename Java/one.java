package systems_of_calculus;

import java.util.Scanner;


public class one {
	
	private static Scanner scanner;


	public static int start_10(String num, int n) {
		return trek_10(num, num.length() - 1, n, 0, 0);
	}
	
	public static int trek_10(String num, int len_n, int n, int i, int result) {
		int symbol = Character.getNumericValue(num.charAt(i));
		result += symbol * Math.pow(n, len_n - i);
		if (i != len_n) { return trek_10(num, len_n, n, i + 1, result); }
		return result;
	}
	
	
	public static int start_n(int num, int n) {
		return trek_n(num, n, "");
	}
	
	public static int trek_n(int num, int n, String result) {
		int div = num / n;
		int mod = num % n;
		if (num != 0) { return trek_n(div, n, String.valueOf(mod) + result); }
		if (result == "") { result = "0"; }
		return Integer.parseInt(result);
	}
	

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		int num1, num2, res, result;
		String f_num1, f_num2, action;
		
		System.out.print("\nEnter first number: ");
		f_num1 = scanner.nextLine().trim();
		System.out.print("Enter system of calculus for first number: ");
		num1 = start_10(f_num1, Integer.parseInt(scanner.nextLine().trim()));
		
		System.out.print("\nEnter second number: ");
		f_num2 = scanner.nextLine().trim();
		System.out.print("Enter system of calculus for second number: ");
		num2 = start_10(f_num2, Integer.parseInt(scanner.nextLine().trim()));
		
		System.out.print("\nEnter action for numbers: ");
		action = scanner.nextLine().trim();
		
		switch (action) {
			case ("+"): { res = num1 + num2; break; }
			case ("-"): { res = num1 - num2; break; }
			case ("*"): { res = num1 * num2; break; }
			case ("/"): { res = num1 / num2; break; }
			default: { res = 0; System.out.println("Unknown command!"); break; }
		}
		
		System.out.print("Enter system of calculus for answer: ");
		result = start_n(res, Integer.parseInt(scanner.nextLine().trim()));
		
		System.out.println("\nResult: " + String.valueOf(result));
	}
}