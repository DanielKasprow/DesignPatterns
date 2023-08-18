package StructuralDesignPatterns.Facade.challenge;

class HotelKeeper {
    public Menus getNonVegMenu(){
        return new NonVegRestaurant().getMenus();
    }
    public Menus getVegRestaurant(){
        return new VegRestaurant().getMenus();
    }
    public Menus getVegNonBothRestaurant(){
        return new VegNonBothRestaurant().getMenus();
    }
}
