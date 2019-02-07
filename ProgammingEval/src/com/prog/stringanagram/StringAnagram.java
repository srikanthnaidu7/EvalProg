package com.prog.stringanagram;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = "avaj";
		StringAnagram strAnagram = new StringAnagram();
		boolean check = strAnagram.checkAnagram(s1,s2);
		
		if(check){
			System.out.println("Two Strings are Anagram");
		}else{
			System.out.println("Two Strings are not Anagram");
		}
	}

	public boolean checkAnagram(String str1, String str2) {
		
		str1 = str1.replace(" ", "").toUpperCase();
		str2 = str2.replace(" ", "").toUpperCase();
		
		//Check the two string lengths are equal
		if(str1.length() != str2.length()){
			return false;
		}
		
		char str1_chars[] = str1.toCharArray();
		char str2_chars[] = str2.toCharArray();
		
		Arrays.sort(str1_chars);
		Arrays.sort(str2_chars);
		
		return Arrays.equals(str1_chars, str2_chars);
		
	}
	 

}
