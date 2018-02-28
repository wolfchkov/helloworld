package home.Task4;

public class Triangle extends Shape {
    TriangleFactory tf = new TriangleFactory();
    int leftSide = tf.getSideLeft();
    int rightSide = tf.getSideRight();
    int baseSide = tf.getSideBase();

    @Override
    public float getPerimeter() {
        perimeter = leftSide + rightSide + baseSide;
        System.out.println("периметр = " + perimeter);
        return perimeter;
    }

    @Override
    public float getSquare(){
        square = (float) Math.sqrt(perimeter/2 * (perimeter/2 - leftSide) * (perimeter/2 - rightSide) * (perimeter/2 - baseSide));
        System.out.println("Площадь = " + square);
        return square;
    }

    Triangle () {
        getPerimeter();
        getSquare();
    }
}
