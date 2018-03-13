/*Ashish Acharya
  Chapter 4- Lab2 Assignment
  Due: March 9,2018
  
  Write a program class named SquareDisplay that asks the user to enter a positive odd number in the range 1 to 19.
  The program should then display a square on the screen using the character‘X’. 
  The number entered by the user will be the length of each side of the square. 
  For example, if the user enters 3, the program should display the following:
  XXX
  XXX
  XXX

  
  */

   //Importing scanner class.
   

import java.util.Scanner;
public class SquareDisplay{
    public static void main(String args[]){
    
       //declare and initialize variables
        int i=0;
        int j=0;
        int number = 0;
        
        //create a scanner object
        Scanner input=new Scanner(System.in);
        
        //create a boolean variable
        boolean next =true;

        while (next) {
        
            //prompt a user for input
            System.out.print("Enter an integer in the range 1-19:");
            number = input.nextInt();

            if ((number > 0 && number <20) && (number %2 != 0)) {
                next = false;
            } else {
                next = true;
            }
        }
        
       //use nested for loop to dispaly the pattern
       for (i=1;i<=number;i++ ){
       
         for (j=1;j<=number;j++){
                System.out.print("X");
         }
         
       System.out.print("\n");//breaks line to start a new row
       
        }
        //I have added a comment.




    }
}
      
      
      
      
         
      
      
      
   