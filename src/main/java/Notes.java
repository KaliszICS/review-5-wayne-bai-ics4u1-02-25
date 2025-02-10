
class Notes {
	public static void main(String[] args) {

		//Functions vs Methods

		//Functions are a set of instructions
		//Methods are also a set of instructions except they are associated with an object

		//Math Library - Functions and Constants - native to java, no import

		//Math.abs(value) - returns the absolute value of the provided value

		System.out.println(Math.abs(7.0));
		System.out.println(Math.abs(-7));

		//Math.floor - returns a double
		
		System.out.println(Math.floor(3.5));
		System.out.println(Math.floor(3));

		//Math.ceil - does not affect the original value

		double num = 3.5;
		System.out.println(Math.ceil(num));
		System.out.println(num); //num remains unaffected

		//Math.max(value1, value2) - return the maximum value
		//Math.min(value1, value2) - return the minimum value
		//Math.pow(value1, value2) - first value to the pwoer fo the second
		//Math.round(value) - rounds the number
		//Math.sqrt(value) - square root

		//Methods - String Manipulation

		//var.contains(value) - returns true when the value is in the variable

		String word = "Hello";
		System.out.println(word.contains("e"));

		//var.startsWith(value), var.endsWith(value) - return true when the variable starts with or ends with the value
		
		System.out.println(word.startsWith("he"));

		//var.equalsIgnoreCase(value) - similar to .equals but it ignores casing

		//var.indexOf(value), var.lastIndexOf(value) - return the first/last index of teh value in the given variable

		System.out.println(word.indexOf("el")); //multiple characters, the index returned is the index of the first character
	
		//var.length() - has no arguments - not providing anything in the brackets
		//returns the length of the string

		System.out.println(word.length());

		//var.replaceFirst(value, replaceValue), var.replaceAll(value, replaceValue) - replace first/every instance of the first value with the replaceValue
		//still only does this on a copy, the original variable will still be unaffected unless assigned to
	
		//var.toLowerCase(), var.toUpperCase() - returns a copy of the string in all upper/lower case
		//var.trim() - removes all leading and trailing whitespace

		System.out.println("    Hello   ".trim());

		//var.substring(startIndex, endIndex), var.substring(startIndex)
		//endIndex is exclusive(not included), start index is inclusive(part of the new string)

		//length of the substring is = endingIndex - startIndex

		System.out.println("Hello World".substring(6, 10));
		System.out.println("Hello World".substring(6)); //goes from the start index to the end
	
		//Math Class - https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
		//String methods - https://www.w3schools.com/java/java_ref_string.asp
	}
}
