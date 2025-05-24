package b3.test;

import b3.colorable.Colorable;
import b3.geometry.Square;


public class TestColorable {
    public static void main(String[] args) {
        Colorable[] colorable = new Colorable[2];
        colorable[0] = new Square();
        colorable[1] = new Square(4);

        for (Colorable value : colorable) {
            System.out.println(value.toString());
            value.howToColor("blue");
            System.out.println();
        }
    }
}
