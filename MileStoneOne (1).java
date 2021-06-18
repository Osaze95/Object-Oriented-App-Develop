/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package SteppingStones;

import java.util.Scanner;
import Collection_pack.Collection;



public class  MileStoneOne {


    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          
       //Assign the following variables with the appropriate data type and value:
       
       //VARIABLE NAME            VALUE
       
       String nameOfIngredient         ="";
       double numberCups               =0.0;
       int unitOfMeasure               =0;     
       double totalCalories            =0.0;
       
       
       
       Scanner scnr = new Scanner(System.in);
           
       do {    
         System.out.println("Please enter the name of the ingredient: ");
         nameOfIngredient = scnr.nextLine();

         // validate user input (if it is string)
          }
       while (!(nameOfIngredient instanceof String));
        
       // user validation        
         System.out.println("Please enter the number of cups of " + nameOfIngredient + " we'll need: ");
        if  (scnr.hasNextFloat() || scnr.hasNextInt()) 
          numberCups = scnr.nextFloat();
        else
            {
               System.out.println("Your input is not correct, aborting");
               System.exit(0);
            }

       
       System.out.println("Please enter unit of measure per cup: ");
        
       if  (scnr.hasNextInt())
           unitOfMeasure = scnr.nextInt();
     
       else
            {
               System.out.println("Your input is not correct, aborting");
               System.exit(0);
            }
 
       totalCalories = unitOfMeasure * numberCups; 
       /**
        * Write an expression that multiplies the number of cups
        * by the Calories per cup.
        * Assign this value to totalCalories
        */
       
       System.out.println(nameOfIngredient + " uses " + numberCups
       + " cups and has " + totalCalories + " calories.");

// SteppingStone2_IngredientCalculator item = new SteppingStone2_IngredientCalculator(nameOfIngredient, numberCups, unitOfMeasure, totalCalories);       
       //Collection first_item = new Collection();  
Collection item = new Collection( );   
	   
  }
   
}  // end of main 




