package StructuralDesignPatterns.Bridge.challange;

class Main {
    public static void main(String[] args) {
        Color shape1 = new RedCircle();
        Shape shape2 = new Triangle(new GreenCircle());
        shape1.fillWithColor(5);
        shape2.modifyBorder(5,3);

    }
}
