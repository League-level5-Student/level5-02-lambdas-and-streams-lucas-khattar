package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			String output = "";
			for (int i = s.length(); i > 0; i--) {
				String sub = s.substring(i - 1, i);
				output += sub;
			}
			System.out.println(output);
		}, "repeat");

		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			String output = "";
			for (int i = 0; i < s.length(); i++) {
				String sub = s.substring(i, i+1);
				if (i % 2 == 0) {
					output += sub.toUpperCase();
				}
				else {
					output += sub;
				}
			}
			System.out.println(output);
		}, "repeat");

		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s)->{
			String output = "";
			for (int i = 0; i < s.length(); i++) {
				String sub = s.substring(i, i+1);
				output += sub + ".";
			}
			System.out.println(output);
		}, "repeat");
		
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s)->{
			String output = "";
			for (int i = 0; i < s.length(); i++) {
				String sub = s.substring(i, i+1);
				if(!sub.equals("a")&&!sub.equals("e")&&!sub.equals("i")&&!sub.equals("o")&&!sub.equals("u")) {
					output += sub;
				}
			}
			System.out.println(output);
		}, "repeat");
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
