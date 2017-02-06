package testProgram;

import java.util.ArrayList;
import java.util.List;

public class CommonUncommonEle {
	public static void main(String args[]){
		List<Integer> arrLst =  new ArrayList<Integer>();
		arrLst.add(1);
		arrLst.add(3);
		arrLst.add(5);
		arrLst.add(6);
		arrLst.add(7);
		
		List<Integer> arrLst1 = new ArrayList<Integer>();
		arrLst1.add(1);
		arrLst1.add(3);
		arrLst1.add(2);
		arrLst1.add(8);
		arrLst1.add(9);
		
		List<Integer> common = new ArrayList<Integer>(arrLst);
		common.retainAll(arrLst1);
		System.out.println(common);
		
		List<Integer> uncommon1 = new ArrayList<Integer>(arrLst);
		uncommon1.removeAll(arrLst1);
		System.out.println(uncommon1);
		
		List<Integer> uncommon2 = new ArrayList<Integer>(arrLst1);
		uncommon2.removeAll(arrLst);
		System.out.println(uncommon2);
		
		uncommon1.addAll(uncommon2);
		System.out.println(uncommon1);
	} 
}
