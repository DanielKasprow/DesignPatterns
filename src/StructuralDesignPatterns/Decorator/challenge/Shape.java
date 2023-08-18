package StructuralDesignPatterns.Decorator.challenge;

interface Shape {
    void draw();
}
class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName());
    }
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName());
    }
}