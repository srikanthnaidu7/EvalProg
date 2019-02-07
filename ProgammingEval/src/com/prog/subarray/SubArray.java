package com.prog.subarray;

public class SubArray {

	public static void main(String[] args) {
		
		int arr[] = {12, 5, 31, 9, 21, 8};
		int sum = 61;
		SubArray subArray = new SubArray();
		subArray.checksubArray(arr,sum);
		
	}

	public  void checksubArray(int[] arr, int sum) {
		
		int[] newArray = null;
		int curr_sum = arr[0];
		int start =0;
		int index;
		for(index=1;index<=arr.length;index++){
			while(curr_sum > sum && start < index-1){
				curr_sum = curr_sum - arr[start];
				start++;
			}
			
			if(curr_sum == sum){
				int endindex = index-1;
				int k=0;
				newArray = new int[endindex-start+1];
				for(int j=start;j<=endindex;j++){
					newArray[k]=arr[j];
					k++;
				}
			}
			
			if(index < arr.length){
				curr_sum += arr[index];
			}
		}
		System.out.println("The sub array:");
		for(int l=0;l<newArray.length;l++){
			System.out.print(newArray[l]+" ");
		}
	}

}
