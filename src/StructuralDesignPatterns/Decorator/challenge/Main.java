package StructuralDesignPatterns.Decorator.challenge;

class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape greenRectangle = new GreenShapeDecorator(new Rectangle());

        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        greenRectangle.draw();

        redShapeDecorator.setRedBorder(new Circle());
        redShapeDecorator.setRedBorder(new Rectangle());
    }
}
