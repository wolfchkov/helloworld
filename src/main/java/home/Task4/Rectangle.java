package home.Task4;

public class Rectangle extends Shape {
    RectangleFactory Sides = new RectangleFactory();
    int Hight = Sides.getHight();
    int Width = Sides.getWidth();

    @Override
    public float getSquare(){
        square = Hight * Width;
        System.out.println("Площадь = " + square);
        return square;
    }

    @Override
    public float getPerimeter() {
        perimeter = 2 * Hight + 2 * Width;
        System.out.println("периметр = " + perimeter);
        return perimeter;
    }

    Rectangle() {
        getSquare();
        getPerimeter();
    }
}
