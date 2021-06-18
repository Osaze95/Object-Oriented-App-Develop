
import java.util.ArrayList;
import SteppingStone6.*;
import SteppingStone6.Ingredient_package.*;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class SteppingStone6_RecipeBoxTest {
	/**
 	* @param args the command line arguments
          to test SteppingStone6_RecipeBox
            
 	*/
	public static void main(String[] args) {
		// Create two recipe objects first
		SteppingStone6.SteppingStone6_RecipeBox myFirstRecipe = new SteppingStone6.SteppingStone6_RecipeBox();
		ArrayList<Ingredient_package.Ingredient> recipeIngredients = new ArrayList<Ingredient_package.Ingredient>(); 
		ArrayList<Ingredient_package.Ingredient> recipeIngredientsTwo = new ArrayList<Ingredient_package.Ingredient>(); 
		String ingredientName = "Anchovies";
		Ingredient_package.Ingredient tempIngredient = new Ingredient_package.Ingredient().addNewIngredient(ingredientName);
		recipeIngredients.add(tempIngredient);
     
        SteppingStone6.SteppingStone6_RecipeBox mySecondRecipe = new SteppingStone6.SteppingStone6_RecipeBox();
    	//SteppingStone6.SteppingStone6_RecipeBox mySecondRecipe = new SteppingStone6.SteppingStone6_RecipeBox("Pizza", 2, recipeIngredients, 300);
   	 
    	// Initialize first recipe
		String ingredientNameTwo = "Noodles";
		Ingredient_package.Ingredient tempIngredientTwo = new Ingredient_package.Ingredient().addNewIngredient(ingredientNameTwo);
		recipeIngredientsTwo.add(tempIngredientTwo);

    	myFirstRecipe.setRecipeName("Ramen");
    	myFirstRecipe.setServings(2);
    	myFirstRecipe.setRecipeIngredients(recipeIngredientsTwo);
    	myFirstRecipe.setTotalRecipeCalories(150);
   	 
    	// Print details of both recipes
    	myFirstRecipe.printRecipe();

        myFirstRecipe.setRecipeName("Carrot");
        myFirstRecipe.setServings(23);
        myFirstRecipe.setRecipeIngredients(recipeIngredientsTwo);
        myFirstRecipe.setTotalRecipeCalories(215);

    	mySecondRecipe.printRecipe();
	}
    
}
