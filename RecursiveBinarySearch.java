package searchExamples;

import java.util.Arrays;

public class RecursiveBinarySearch {
	
	private static int data[] = {12, 8, 4, 6, 10, 2};
	public static int recursiveBinarySearch (int d[], int g, int left, int right) {
		
        Arrays.sort(data);		
		
		int middle = (left + right)/2;
		if (d[middle] != g && left <= right) {
			if (d[middle] > g) 
				return recursiveBinarySearch (d, g, left, middle-1);
			else 
				return recursiveBinarySearch (d, g, middle+1, right);
		}
		if (d[middle] == g) return middle;
		else return -1;
	}
	
	public static void main (String [] args) {
		int goal = 8;
		int result = recursiveBinarySearch(data, goal, 0, data.length-1);
		if (result < 0) System.out.println("The search could not find: " + goal);
		else System.out.println("      =>The goal of " + goal + " was found at index: " + result);
	}

}