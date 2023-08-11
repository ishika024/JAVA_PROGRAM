// Merge Sort : Merge sort is a divide-and-conquer algorithm, here breaking down a list into multiple sub lists till each sub list consists of a single element and then merging all sub lists in order to get a sorted list. 
// Time complexity of merge sort in best case, average case, and in worst case is O(n*logn). 
// Space Complexity is	O(n).

import java.util.Scanner;

public class MergeSort {
	
	public static void mergeList(int[] listVals, int startIndex, int midIndex, int endIndex){
		// Starting position of both parts 
		int p = startIndex;
		int q = midIndex + 1;
		int[] sortedListVals = new int[(endIndex-startIndex)+1];
		for(int i=startIndex, index = 0;i<=endIndex;i++,index++){
			// Checks whether 1st part is end or not.
			if(p > midIndex){
				sortedListVals[index] = listVals[q];
				q += 1;
			}
			// Checks whether 2nd part is end or not. 
			else if(q > endIndex){
				sortedListVals[index] = listVals[p];
				p += 1;
			}
			// Checks which part has smaller element.
			else if(listVals[p] < listVals[q]){
				sortedListVals[index] = listVals[p];
				p += 1;
			}
			else {
				sortedListVals[index] = listVals[q];
				q += 1;
			}
		}
		for( p=0;p<sortedListVals.length;p++){
			listVals[startIndex] = sortedListVals[p];
			startIndex += 1;
		}
	}
	
	public static void mergeSort(int[] listVals, int startIndex, int endIndex){
		if(startIndex < endIndex){
			// finding mid index 
			int midIndex = (startIndex+endIndex)/2;
			// Sorting 1st part of the array.
			mergeSort(listVals, startIndex, midIndex);
			// Sorting 2nd part of the array.
			mergeSort(listVals, midIndex+1, endIndex);
			// merge the both parts, comparing elements 
			mergeList(listVals, startIndex, midIndex, endIndex);
		}
	}

	public static void main(String[] args){
	    int[] numberList;
	    Scanner in = new Scanner(System.in); 
	    System.out.println("Merge Sorting");
	    System.out.println("--------------------");
	    System.out.println("Enter numbers count: ");                   
	    int count = in.nextInt();                   
	    numberList = new int[count];
	    System.out.println("Enter numbers: "); 
	    for (int i=0;i<count;i++){
	    	numberList[i]=in.nextInt();
	    }
	    in.close();
	    mergeSort(numberList, 0, numberList.length-1);
	    
	    System.out.println("Sorted numbers: "); 
	    for(int number : numberList){
	    	System.out.print(number+"\t");
	    }
	}
}        
