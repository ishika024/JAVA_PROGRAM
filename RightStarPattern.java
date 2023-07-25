// Star Pattern : Each pattern program has two or more than two loops. The number of the loop depends on the complexity of pattern or logic. The first for loop works for the row and the second loop works for the column. 

// Right Triangle Star Pattern


public class RightTrianglePattern   
{   
public static void main(String args[])   
{   
//i for rows and j for columns      
//row denotes the number of rows you want to print  
int i, j, row=6;   
//outer loop for rows  
for(i=0; i<row; i++)   
{   
//inner loop for columns  
for(j=0; j<=i; j++)   
{   
//prints stars   
System.out.print("* ");   
}   
//throws the cursor in a new line after printing each line  
System.out.println();   
}   
}   
}  