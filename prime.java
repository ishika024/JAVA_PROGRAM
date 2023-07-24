//Prime Number : A prime number is a whole number greater than 1 whose only factors are 1 and itself. A factor is a whole number that can be divided evenly into another number.

 
import java.util.Scanner;
public class Main 
{  
   public static void main(String[] args) 
   {  
       //Take input from the user
       //Create instance of the Scanner class
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter a number : ");  
       int num = sc.nextInt();  
       int flag=0; 
       int i, temp=num/2;      
       if(num==0||num==1)
       {  
          System.out.println(num+" is not prime number");      
       }
       else
       {  
         for(i=2;i<=temp;i++)
         {      
           if(num%i==0)
           {      
               System.out.println(num+" is not a prime number");      
               flag=1;      
               break;      
           }      
         }      
         if(flag==0)  
         { 
             System.out.println(num+" is a prime number");  
         }  
        }//end of else  
   }   
}  
