package CreationalDesignPatterns.Builder.challange;


class Main {
    public static void main(String[] args) {
        Director director = new Director();
        MealBuilderInterface veg = new VegMealBuilder();
        MealBuilderInterface chicken = new NonVegMealBuilder();

        director.construct(veg);
        Meal p1 = veg.getMeal();
        p1.show();

        director.construct(chicken);
        Meal p2 = chicken.getMeal();
        p2.show();
    }
}
