//Insertion Sort : Insertion sort is a simple sorting technique in Java that is efficient for a smaller data set and in place. It is assumed that the first element is always sorted and then each subsequent element is compared to all its previous elements and placed in its proper position. Insertion Sort is an easy-to-implement, stable sorting algorithm.
//Time Complexity       Best Case O(n)      Average And Worst Case O(n²) 
//Space Complexity    	O(1)

import java.util.Scanner;

public class InsertionSort
{
   public static void main(String[] args)
   {
      int n, i, j, element;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Size of Array: ");
      n = scan.nextInt();
      int[] arr = new int[n];
      System.out.print("Enter " +n+ " Elements: ");
      for(i=0; i<n; i++)
         arr[i] = scan.nextInt();
      
      for(i=1; i<n; i++)
      {
         element = arr[i];
         
         for(j=(i-1); j>=0 && arr[j]>element; j--)
            arr[j+1] = arr[j];
         
         arr[j+1] = element;
      }
      
      System.out.println("\nThe new sorted array is: ");
      for(i=0; i<n; i++)
         System.out.print(arr[i]+ " ");
   }
}
