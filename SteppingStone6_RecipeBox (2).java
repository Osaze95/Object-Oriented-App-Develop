//package SteppingStones;

import java.util.Scanner;
import java.util.ArrayList;
import SteppingStone.SteppingStone5_Recipe;
import SteppingStone.Ingredient_package.*;

             
public class SteppingStone6_RecipeBox {
	public int totalNumberOfRecipies ;

	/**
	 * Declare instance variables:
	 * a private ArrayList of the type SteppingStone5_Recipe named listOfRecipes
	 * 
	 */
		
     public ArrayList<SteppingStone5_Recipe> listOfRecipes ; 		
    
	/**
	 * Add accessor and mutator for listOfRecipes
	 * 
	 */
		
     // accessor 
	   
	 // mutator 
     //this.recipeName = recipeName;
     //this.servings = servings;
     //this.recipeIngredients = recipeIngredients;
     //this.totalRecipeCalories = totalRecipeCalories;

 	 //myFirstRecipe.setRecipeName("Ramen");
 	 //myFirstRecipe.setServings(2);
 	 //myFirstRecipe.setRecipeIngredients(recipeIngredientsTwo);
 	 // myFirstRecipe.setTotalRecipeCalories(150);
	
	 public SteppingStone5_Recipe Create_Recipe (String name, int servings, float calories) 
	 {
	 	SteppingStone5_Recipe myRecipe = new SteppingStone5_Recipe();
		myRecipe.recipeName = name;
		myRecipe.servings = servings;
		myRecipe.totalRecipeCalories = calories;
		
		return (myRecipe);
	 }


     public SteppingStone5_Recipe newRecipe ()
	 
	 {
		String name;
		int servings;
		float calories;
		
	 	Scanner s = new Scanner(System.in);
		System.out.println("Enter Name");
		name = s.nextLine();
		System.out.println("Servings");
		servings = s.nextInt();
		System.out.println("Calories");
		calories = s.nextFloat();
		
		SteppingStone5_Recipe r = Create_Recipe ( name, servings, calories) ;
		return (r);
	 }
	/**
	 * Add constructors for the SteppingStone6_RecipeBox()
	 * 
	 */
    public SteppingStone6_RecipeBox ( ) {
        this.listOfRecipes = new ArrayList<SteppingStone5_Recipe>();
		//this.listOfRecipes.add(newRecipie);
        this.totalNumberOfRecipies = 0 ;
        
    }
	
	/**
	 * Add the following custom methods:
	 * 
	 * //printAllRecipeDetails(SteppingStone5_Recipe selectedRecipe)
	 * 		This method should accept a recipe from the listOfRecipes ArrayList
	 * 		recipeName and use the SteppingStone5_Recipe.printRecipe() method 
	 * 		to print the recipe
	 */
	  public void printAllRecipeDetails (String name) {
		  for (SteppingStone5_Recipe r: this.listOfRecipes )
		  {
			  System.out.println("Name 1" + r.recipeName);
			  if (r.recipeName == name)
			  {
	        	  System.out.println("Name" + r.recipeName);
				  System.out.println("Servings" + r.servings);
				  System.out.println("Calories"+ r.totalRecipeCalories );
			   }	  
		  }	
        
	  }
	 /* //printAllRecipeNames() <-- This method should print just the recipe
	 * 		names of each of the recipes in the listOfRecipes ArrayList
	 * 
	 * //addRecipe(SteppingStone5_Recipe tmpRecipe) <-- This method should use
	 * 		the SteppingStone5_Recipe.addRecipe() method to add a new 
	 * 		SteppingStone5_Recipe to the listOfRecipes
	 * 
	 */
	  public void addRecipe (SteppingStone5_Recipe tmpRecipe) 
	 {
		 this.listOfRecipes.add(tmpRecipe);
		 this.totalNumberOfRecipies ++;
		
	 }
	
	 // listOfRecipes.get(j).getRecipeName())
	 public String getRecipeName(int index)
	 {
	 	 
		 return (this.listOfRecipes.get(index).recipeName);
	 }
	/**
	* A variation of following menu method should be used as the actual main 
	*		once you are ready to submit your final application.  For this 
	*		submission and for using it to do stand-alone tests, replace the 
	*		public void menu() with the standard 
	*			public static main(String[] args)
	*		method
	*
	*/
	
	public void menu() {
    	// Create a Recipe Box
    		
		//SteppingStone6_RecipeBox myRecipeBox = new SteppingStone6_RecipeBox(); //Uncomment for main method
        Scanner menuScnr = new Scanner(System.in);
        
		
		/**
		* Print a menu for the user to select one of the three options:
		*
		*/
		
		System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
        while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {
            System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
            int input = menuScnr.nextInt();
            
			/**
			* The code below has two variations:
			* 	1. Code used with the SteppingStone6_RecipeBox_tester.
			*	2. Code used with the public static main() method
			*
			* One of the sections should be commented out depending on the use. 
			*/
			
			/**
			* This could should remain uncommented when using the
			* SteppingStone6_RecipeBox_tester.
			* 
			* Comment out this section when using the
			*		public static main() method
			*/
			
			if (input == 1) {
                SteppingStone5_Recipe rec = newRecipe();
				addRecipe(rec);
				//this.listOfRecipes.add(rec);
            } else if (input == 2) {
                System.out.println("Which recipe?\n");
                String selectedRecipeName = menuScnr.next();
                printAllRecipeDetails(selectedRecipeName);
            } else if (input == 3) {
                
				System.out.println("Printing all names of recipes\n");
				for (int j = 0; j < this.listOfRecipes.size(); j++) { 
                   System.out.println((j + 1) + ": " + getRecipeName(j));
				   System.out.println( listOfRecipes.get(j).recipeName );
                }
            } else {
                System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
            }
            
			/**
			* This could should be uncommented when using the
			* 		public static main() method
			* 
			* Comment out this section when using the
			* 		SteppingStone6_RecipeBox_tester.
			*		
			
			
			if (input == 1) {
                myRecipeBox.newRecipe();
            } else if (input == 2) {
                System.out.println("Which recipe?\n");
                String selectedRecipeName = menuScnr.next();
                myRecipesBox.printAllRecipeDetails(selectedRecipeName);
            } else if (input == 3) {		
				for (int j = 0; j < myRecipesBox.listOfRecipes.size(); j++) { 
                    System.out.println((j + 1) + ": " + myRecipesBox.listOfRecipes.get(j).getRecipeName());
				}
            } else {
                System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
            }
			
			*
			*/
			
			System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
		}
		
        
	}

	// menu class
   public static void main(String[] args) {
	   SteppingStone6_RecipeBox box = new SteppingStone6_RecipeBox ();
	   box.menu ();
   }

}


/**
 * 
 * Final Project Details:
 * 
 * For your final project submission, you should add a menu item and a method 
 *		to access the custom method you developed for the Recipe class 
 * 		based on the Stepping Stone 5 Lab.
 *
 */