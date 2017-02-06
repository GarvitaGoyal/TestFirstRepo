package testProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DupliateArrayElement 
{
	public static void main(String args[]){
		int arr[] = {2,1,6,8,1};
		String[] withDuplicates = new String[] {"one","two","three","one"};
		System.out.println("Array elements : "+ Arrays.toString(arr));
		
		System.out.println("Checking array with duplicate using brute force: " + bruteforce(arr));

		System.out.println("Checking array with duplicate using Set for string : " + chechDuplicateUsingSet(withDuplicates));
		
		System.out.println("Checking array with duplicate using Set for integer : " + chechDuplicateUsingSetForInteger(arr));
		
		System.out.println("Checking array with duplicate using Add Method : " + chechDuplicateUsingAdd(arr));
	}
	
	private static boolean chechDuplicateUsingAdd(int[] arr) 
	{
		Set<Integer> arrSet = new HashSet<Integer>();
		for(Integer arrInt : arr){
			if(!arrSet.add(arrInt)){
				return true;
			}
		}
		return false;
	}

	private static boolean chechDuplicateUsingSetForInteger(int[] arr) {
		List<Integer> arrList = new ArrayList<Integer>();
		for(int i= 0 ; i<arr.length ; i++){
			arrList.add(arr[i]);
		}
		Set<Integer> arrSet = new HashSet<Integer>(arrList);
		if(arrSet.size() < arrList.size()){
			return true;
		}
		return false;
	}
	
	public static boolean bruteforce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==(arr[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

	public static boolean chechDuplicateUsingSet(String[] withDuplicates){
		List inputList = Arrays.asList(withDuplicates);
		Set inputSet = new HashSet(inputList);
        if(inputSet.size()< inputList.size()){
            return true;
        }
        return false;
	}
}


