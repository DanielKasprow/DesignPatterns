package StructuralDesignPatterns.Bridge.challange;


abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }
    abstract void drawShape(int border);
    abstract void modifyBorder(int border, int increment);
}
class Triangle extends Shape{

    protected Triangle(final Color color) {
        super(color);
    }

    @Override
    void drawShape(final int border) {
        System.out.print("This Triangle is colored with ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, final int increment) {
        System.out.println("\nNow we are changing the border length " + increment + " times");
        border = border * increment;
        drawShape(border);

    }


}
class Rectangle extends Shape{

    protected Rectangle(final Color color) {
        super(color);
    }

    @Override
    void drawShape(final int border) {
        System.out.print("This Rectangle is colored with ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, final int increment) {
        System.out.println("\nNow we are changing the border length " + increment + " times");
        border = border * increment;
        drawShape(border);
    }


}