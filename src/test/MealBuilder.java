package test;

public class MealBuilder {
	 public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new vegBurger());
	      meal.addItem(new Coke());
	      return meal;
	   }   
	 
	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenBurger());
	      meal.addItem(new Pesi());
	      return meal;
	   }

	

}
