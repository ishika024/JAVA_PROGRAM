//Bubble Sort : Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. Complexity of bubble sort is O(n2) which makes it a less frequent option for arranging in sorted order when quantity of numbers is high.
//Time Complexity   Best Case	O(n) , Average Case	O(n2) , Worst Case	O(n2)
//Space Complexity	O(1)


import java.util.Scanner;
class BubbleSort {
	public static void main(String []args) {
		int n, c, d, swap;
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of integers to sort");
		n = in.nextInt();
		int array[] = new int[n];
		System.out.println("Enter " + n + " integers");
		for (c = 0; c < n; c++) 
		      array[c] = in.nextInt();
		for (c = 0; c < ( n - 1 ); c++) {
			for (d = 0; d < n - c - 1; d++) {
				if (array[d] > array[d+1]) 
				/* For descending order use < */ {
					swap       = array[d];
					array[d]   = array[d+1];
					array[d+1] = swap;
				}
			}
		}
		System.out.println("Sorted list of numbers");
		for (c = 0; c < n; c++) 
		      System.out.println(array[c]);
	}
}
