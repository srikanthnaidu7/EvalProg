package com.prog.stringconversion;

public class ConvertStringToInt {

	public static void main(String[] args) {

		String s = "123";
		ConvertStringToInt convStrToInt = new ConvertStringToInt();
		int result = 0;

		result = convStrToInt.convertStringToInt(s);
		System.out.println("Value:" + result);
	}

	public int convertStringToInt(String str) {
		int index = 0;
		int number = 0;
		boolean isNegetive = false;
		str = str.replace(" ", "");
		System.out.println("after:" + str);
		if (str.charAt(0) == '-') {
			index++;
			isNegetive = true;
		}
		while (index < str.length()) {
			number = number * 10;
			// differentiating with ASCII value and adding the result to number
			number += str.charAt(index) - '0';
			index++;
		}
		if (isNegetive) {
			number = -number;
		}

		return number;
	}

}
