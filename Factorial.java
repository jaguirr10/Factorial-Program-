//Juan Aguirre

import java.util.Scanner;

class Factorial

 {
	
   public static void main(String args[]){
	   
      //Scanner object reads in user input
	   
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the number:");
      
      //Store number that is  entered value in variable
      
      int num = scanner.nextInt();
      
      //Called the user defined function fact
      int factorial = fact(num);
      
      System.out.println("Factorial of the number entered is: "+factorial);
   }
   static int fact(int n)
   {
       int output;
       if(n<=1){
         return 1;
       }
       //Recursion: The fact function calls itself
       
       output = fact(n-1)* n;
       return output;
   }
}
