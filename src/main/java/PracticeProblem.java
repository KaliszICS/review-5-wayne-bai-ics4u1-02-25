import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		// q1();
		// q2();
		// q3();
		// q4();
		// q5();
		// q6();
		// q7();
		// q8();
		// q9();
		// q10();
		q11();
		// q12();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner recv = new Scanner(System.in);
		System.out.print("Input a number: ");
		double input = recv.nextDouble();
		recv.nextLine();
		System.out.println(Math.abs(input));
		recv.close();
	}

	public static void q2() {
		//Write question 2 code here
		Scanner recv = new Scanner(System.in);
		System.out.print("Input a number: Input another number: ");
		double input = recv.nextDouble();
		recv.nextLine();
		double input2 = recv.nextDouble();
		recv.nextLine();
		System.out.println(Math.floor(input / input2));
		System.out.println(Math.ceil(input / input2));
		recv.close();
	}

	public static void q3() {
		//Write question 3 code here
		Scanner recv = new Scanner(System.in);
		System.out.print("Input a number: ");
		double input = recv.nextDouble();
		
		recv.nextLine();
		System.out.println(Math.round(Math.sqrt(input)));
		recv.close();
	}

	public static void q4() {
		//Write question 4 code here
		Scanner recv = new Scanner(System.in);
		System.out.print("Input a number: Input another number: ");
		double input = recv.nextDouble();
		recv.nextLine();
		double input2 = recv.nextDouble();
		recv.nextLine();
		System.out.println(Math.pow(input,input2));
		recv.close();
	}

	public static void q5() {
		//Write question 5 code here
		
		Scanner recv = new Scanner(System.in);
		System.out.print("Input a number: Input another number: Input one more number: ");
		double input = recv.nextDouble();
		recv.nextLine();
		double input2 = recv.nextDouble();
		recv.nextLine();
		double input3 = recv.nextDouble();
		recv.nextLine();
		System.out.println(Math.max(Math.max(input, input2), input3));
		System.out.println(Math.min(Math.min(input, input2), input3));
		recv.close();
		
	}
	public static void q6() {
		//Write question 5 code here
		Scanner recv = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String input = recv.nextLine();

		System.out.println(input.contains("on"));
		
		recv.close();
	}
	public static void q7() {
		//Write question 5 code here
		Scanner recv = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String input = recv.nextLine();
		
		System.out.println(input.toLowerCase().equals("mango"));
		recv.close();
	}
	public static void q8() {
		//Write question 5 code here
		Scanner recv = new Scanner(System.in);
		System.out.print("Input a word: Input a letter: ");
		String input = recv.nextLine();
		String input2 = recv.nextLine();
		// first
		int index1 = input.indexOf(input2);
		// last
		int index2 = input.lastIndexOf(input2);
		System.out.println(index1);
		System.out.println(index2);
		recv.close();

	}

	public static void q9() {
		//Write question 5 code here
		Scanner recv = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String input = recv.nextLine();

		System.out.println("Your sentence is " + input.length() + " characters long");
		recv.close();
	}
	public static void q10() {
		//Write question 5 code here
		Scanner recv = new Scanner(System.in);
		System.out.print("Input a sentence: Input a word to replace: What word would you like to replace it with: ");
		String input = recv.nextLine();
		String input2 = recv.nextLine();
		String input3 = recv.nextLine();
		System.out.println(input.replace(input2, input3));
		recv.close();
	}

	public static void q11() {
		//Write question 5 code here
		Scanner recv = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String input = recv.nextLine();
		
		// System.out.println(input);
		while (input.substring(0,Math.min(1, input.length())).equals(" ")) {
			input = input.substring(1, input.length());
		}
		while (input.substring(Math.max(input.length() - 1,0), input.length()).equals(" ")) {
			input = input.substring(0, input.length() - 1);
		}
		// System.out.println(input);
		System.out.println(input.toUpperCase());
		System.out.println(input.toLowerCase());
		recv.close();
	}

	public static void q12() {
		//Write question 5 code here
		Scanner recv = new Scanner(System.in);
		System.out.print("Input a word: ");
		String input = recv.nextLine();
		int len = input.length();
		System.out.println(input.substring(0, Math.min(len, 4)));
		System.out.println(input.substring(Math.max(0, len - 4), len));
		recv.close();
	}
	

}
/*
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18122306)
# Instructions  

  ## Questions
1. Ask the user to "Input a number: ".  Output the absolute value of the number.
2. Ask the user to "Input a number: ".  Ask the user to "Input another number: ".  Divide the first number by the second number.  Output the floor result of the answer on one line and the ceiling result on another.
3. Ask the user to "Input a number: ".  Output the square root of the number rounded.
4. Ask the user to "Input a number: ".  Ask the user to "Input another number: ".  Output the result of the first number to the power of the second number.
5. Ask the user to "Input a number: ".  Ask the user to "Input another number: ".  Ask the user to "Input one more number: ".  Output the max and min values of the three numbers on separate lines.
6. Ask the user to "Input a sentence: ".  If the setence includes the word "on", output true (Even if the "on" is inside another word such as "pond").  Otherwise output false.
7. Ask the user to "Input the word mango: ".  Output true if they put any variation of the casing for mango.  false otherwise.
8. Ask the user to "Input a word: ". Ask the user to "Input a letter: "
Output the first index and last index of the letter in the word on seperate lines.
9. Ask the user to "Input a sentence: ". Output "Your sentence is _length_ characters long", where length is the amount of characters in their sentence.
10. Ask the user to "Input a sentence: "  Ask the user "Input a word to replace: ".  Ask the user "What word would you like to replace it with: ".
Replace all instances of the first word provided with the second word provided in the sentence.
11. Ask the user to "Input a sentence: "
Output the sentence in all uppercase and all lowercase on seperate lines in that order.  Remove any extra spaces at the beginning or end.
12. Ask the user to "Input a word: ".  Output the first four letters and last four letters of the word on seperate lines.
*/