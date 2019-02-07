package com.prog.longsubstring;

import java.util.HashSet;

public class LongSubString {

	public static void main(String[] args) {

		String s = "abcabcbb";
		
		LongSubString longSubString = new LongSubString();
		int result = longSubString.longSubString(s);
		System.out.println("Result:"+result);
	}

	public int longSubString(String s) {

		int maxLen = 0;
		HashSet<Character> hs = new HashSet<Character>();
		int i =0;
		int j=0;
		while(j < s.length()){
			if(!hs.contains(s.charAt(j))){
				hs.add(s.charAt(j));
				j++;
				maxLen = Math.max(maxLen, j-i);
			}else{
				hs.remove(s.charAt(i));
				i++;
			}
		}
		return maxLen;
	}

}
