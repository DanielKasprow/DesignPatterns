package StructuralDesignPatterns.Decorator.challenge;

abstract class ShapeDecorator implements Shape{

    protected Shape shape;

    public ShapeDecorator(final Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        if(shape!=null)
            shape.draw();
        //System.out.println(this.getClass().getSimpleName());
    }
}
class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    public void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red, shape: "+decoratedShape.getClass().getSimpleName());
    }
}
class GreenShapeDecorator extends ShapeDecorator{

    public GreenShapeDecorator(final Shape shape) {
        super(shape);
    }

    public void setGreenBorder(Shape decoratedShape){
        System.out.println("Border Color: Green, shape: "+decoratedShape.getClass().getSimpleName());
    }
}