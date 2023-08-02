//Square Root of a Number Without sqrt() function : The square root of a number is defined as the value, which gives the number when it is multiplied by itself.

import java . util . * ;  
public class SquareRoot   
{  
public static void main ( String [ ] s )    
{   
System.out.println ( " Enter the number: " ) ;  
// Using the scanner class, we can take inputs from the user during the run Runtime
// creating an Object for the class Scanner 
Scanner scan = new Scanner ( System . in ) ;  
// Taking  number form the user and storing it to the integer variable n  
int n = scan.nextInt ( ) ;  
System.out.println ( " The Square root of " + n + " is : " + Root ( n ) ) ;  
}  
/ /user-defined method to find the square root
public static double Root ( int n )   
{  
// creating a temporary table variable
double t ;  
// creating double variable
double ans = n/2 ;  
do   
{  
t = ans ;  
ans = ( t + ( n/t ) ) / 2 ;  
}   
while ( ( t - ans ) != 0 ) ;  
// returning the answer
return ans;  
}  
}
