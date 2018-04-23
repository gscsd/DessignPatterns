package builderpatterns;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder mealBuilder =new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("veg Meal");
		vegMeal.showItem();
		System.out.println("Total cost :"+vegMeal.getCost());
		Meal chickenMeal =mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNonVeg Meal");
		chickenMeal.showItem();
		System.out.println("Total cost :"+chickenMeal.getCost());
	}

}
