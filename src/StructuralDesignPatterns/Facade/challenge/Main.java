package StructuralDesignPatterns.Facade.challenge;

class Main {
    public static void main(String[] args) {
        HotelKeeper hotelKeeper = new HotelKeeper();

        Menus vegMenu = hotelKeeper.getVegRestaurant();
        Menus nonVegMenu = hotelKeeper.getNonVegMenu();
        Menus bothMenu = hotelKeeper.getVegNonBothRestaurant();

        vegMenu.showMenu();
        nonVegMenu.showMenu();
        bothMenu.showMenu();

    }
}
