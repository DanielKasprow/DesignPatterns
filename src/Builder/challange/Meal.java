package Builder.challange;

import java.util.ArrayList;
import java.util.List;

class Meal {
    private final List<Item> meals;

    public Meal(){
        meals = new ArrayList<>();
    }
    public void addItem(Item item) {
        meals.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item meal : meals) {
             cost += meal.price();
        }
        return cost;
    }
    public void show() {

        meals.forEach(item -> {
            System.out.print("Item: " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        });
        System.out.println("Total Cost: " + getCost() + "\n");

    }
}
