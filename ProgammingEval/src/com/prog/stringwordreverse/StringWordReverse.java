package com.prog.stringwordreverse;

public class StringWordReverse {

	public static void main(String[] args) {

		String s = "the sky is dark";
		StringWordReverse strWordReverse = new StringWordReverse();
		String revStr = strWordReverse.stringWordReverse(s);
		System.out.println("new String:"+revStr);
	}
	
	public String stringWordReverse(String str){
		String newStr = "";
		String[] splitStr = str.split(" ");
		for(int col=splitStr.length-1;col>=0;col--){
			newStr = newStr + splitStr[col];
			if(col!=0){
				newStr = newStr + " ";
			}
			
		}
	return newStr; 
	}

}
