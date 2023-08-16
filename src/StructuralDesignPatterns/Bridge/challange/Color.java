package StructuralDesignPatterns.Bridge.challange;

import java.awt.*;

abstract class Color {
    public void fillWithColor(final int border) {
        System.out.println(this.getClass().getSimpleName() + " with border: " + border);
    }
}
class RedCircle extends Color {

}
class GreenCircle extends Color{

}