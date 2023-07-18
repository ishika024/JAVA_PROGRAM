//PALINDROME NUMBER : A Palindrome number is a number that remains the same even after reversing, e.g., .161

import java.util.Scanner;
 class palindrome
{
public static void main(String args[]) 
{
int x,number, y=0,temp=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter any number: ");
number=s.nextInt();
x=number;
while(number>0)
{
x=number%10;
number=number/10;
temp=temp*10+x;
}
if(temp==y)
{
System.out.println("Number is Palindrome");
}
else
{
System.out.println("not Palindrome");
}
}
}
