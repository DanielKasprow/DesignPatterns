package CreationalDesignPatterns.Builder.challenge;

class Director {
    MealBuilderInterface mealBuilder;

    public void construct(MealBuilderInterface mealBuilder){
        this.mealBuilder=mealBuilder;
        this.mealBuilder.buildBurger();
        this.mealBuilder.buildDrink();
    }
}
