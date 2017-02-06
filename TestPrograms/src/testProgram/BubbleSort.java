package testProgram;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String args[]){
		int arr[] = {5,9,8,6,2,1,74,6};
		int temp ; 
		System.out.println("Printing unsorted array elements : "+ Arrays.toString(arr));
		for(int i= 0 ; i< arr.length-1 ; i++){
			for(int j=1 ; j< arr.length -i ; j++){
				if(arr[j-1] > arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("Printing sorted array elements : "+ Arrays.toString(arr));
		}
				
	}
}
