package CreationalDesignPatterns.Builder.challenge;

interface MealBuilderInterface {

    void buildBurger();
    void buildDrink();
    Meal getMeal();
}

class VegMealBuilder implements MealBuilderInterface {
    private final Meal meal = new Meal();

    @Override
    public void buildBurger() {
        meal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}

class NonVegMealBuilder implements MealBuilderInterface {

    private final Meal meal = new Meal();
    @Override
    public void buildBurger() {
        meal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}