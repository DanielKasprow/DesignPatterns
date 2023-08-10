package Singleton.challange;

class Main {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        Cricket c = Cricket.getInstance();
        c.setCaptain1("Daniel");
        c.setCaptain2("Daniel");
        c.setCaptain2("Daniek");
    }
}
