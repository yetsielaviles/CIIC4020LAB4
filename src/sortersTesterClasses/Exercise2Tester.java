package sortersTesterClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import sorterClasses.BubbleSortSorter;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;
import interfaces.Sorter;

public class Exercise2Tester {

	public static void main(String[] args) {
		Integer[] exercise2 = {5,9,20,22,20,5,4,13,17,8,22,1,3,7,11,9,10};
		BubbleSortSorter bsSorter = new BubbleSortSorter();
		InsertionSortSorter isSorter = new InsertionSortSorter();
		SelectionSortSorter ssSorter = new SelectionSortSorter();
		
		System.out.println("Integer Array: " + Arrays.toString(exercise2));
		System.out.println("\n\n*******************************************************");
		System.out.println("BUBBLE SORT");
		System.out.println("*******************************************************");
		bsSorter.sort(exercise2, new IntegerComparator1());
		System.out.println("Increasing order: " + Arrays.toString(exercise2));
		bsSorter.sort(exercise2, new IntegerComparator2());
		System.out.println("Decreasing order: " + Arrays.toString(exercise2));
		
		System.out.println("\n\n*******************************************************");
		System.out.println("INSERTION SORT");
		System.out.println("*******************************************************");
		isSorter.sort(exercise2, new IntegerComparator1());
		System.out.println("Increasing order: " + Arrays.toString(exercise2));
		isSorter.sort(exercise2, new IntegerComparator2());
		System.out.println("Decreasing order: " + Arrays.toString(exercise2));
		
		System.out.println("\n\n*******************************************************");
		System.out.println("SELECTION SORT");
		System.out.println("*******************************************************");
		ssSorter.sort(exercise2, new IntegerComparator1());
		System.out.println("Increasing order: " + Arrays.toString(exercise2));
		ssSorter.sort(exercise2, new IntegerComparator2());
		System.out.println("Decreasing order: " + Arrays.toString(exercise2));
		
		
		
		
		
			
			
			
		}
	}



