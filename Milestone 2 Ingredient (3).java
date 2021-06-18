package Ingredient_package;

public class Ingredient {

 public String name;
 private double amount;
 private double calories;

 public Ingredient()
 {
  this.name = "";
  this.amount = 0.0;
  this.calories = 0.0;
 }

 public Ingredient addNewIngredient(String n)
 {
    Ingredient i = new Ingredient();

    i.name = n;
    i.amount = 0.0;
    i.calories = 0.0;

   return (i);
 }

}

