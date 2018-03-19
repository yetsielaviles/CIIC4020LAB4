package sortersTesterClasses;

import java.util.ArrayList;
import java.util.Comparator;

import sorterClasses.BubbleSortSorter;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;
import interfaces.Sorter;

public class Exercise2Tester {
	static Comparator<Integer> cmp;
	static IntegerComparator2 cmp2;
	static Integer[] result;
	 static Integer[] array = {5, 9, 20, 22, 20, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10}; 
	private static ArrayList<Sorter<Integer>> sortersList = new ArrayList<>(); 
	
	public static void main(String[] args) { 
		sortersList.add(new BubbleSortSorter<Integer>()); 
		
		System.out.println("\n\n*******************************************************");
		System.out.println("***  Bubble Sort   ***");
		System.out.println("*******************************************************");
		
			System.out.print("Original Array:"); 
			showArray(array); 
						
			for (int s=0; s<sortersList.size(); s++) {
				Sorter<Integer> sorter = sortersList.get(s); 
			    result = array.clone(); 
				sorter.sort(array, cmp2);
				System.out.print(" Sorted Array:"); 
			    showArray( array); 
		}
	
	}

	private static void showArray(Integer[] a) {
		
		for (int i=0; i<a.length; i++) 
			System.out.print("\t" + a[i]); 
		System.out.println();
	}

	

}

