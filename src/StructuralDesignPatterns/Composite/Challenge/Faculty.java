package StructuralDesignPatterns.Composite.Challenge;

interface Faculty {
    String getDetails();
}
class Professor implements Faculty{

    private String name;
    private String position;
    private int number;

    public Professor(final String name, final String position, final int number) {
        this.name = name;
        this.position = position;
        this.number = number;
    }

    @Override
    public String getDetails() {
        return "Number: " + number+", Name: " +name+ ", Position: " + position;
    }
}
