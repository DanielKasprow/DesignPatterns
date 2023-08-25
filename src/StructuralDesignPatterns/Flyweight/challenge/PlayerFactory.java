package StructuralDesignPatterns.Flyweight.challenge;


import java.util.HashMap;


class PlayerFactory {
    static HashMap<String, PlayerInterface> shapes = new HashMap<String, PlayerInterface>();

    public static PlayerInterface getPlayer(String playerType) throws Exception {
        PlayerInterface myPlayer = null;

        if (shapes.containsKey(playerType)) {
            myPlayer = shapes.get(playerType);
        } else {
            switch (playerType) {
                case "Terrorist":
                    System.out.println("Terrorist Created");
                    myPlayer = new Terrorist();
                    break;
                case "CounterTerrorist":
                    System.out.println("Counter Terrorist Created");
                    myPlayer = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Unreachable code!");
            }
            shapes.put("CounterTerrorist", myPlayer);
        }

        return myPlayer;

    }
}
