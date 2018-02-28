package home.Task4;

public class Square extends Shape{
    SquareFactory sf = new SquareFactory();
    int Side = sf.getShape();

    @Override
    public float getSquare(){
        square = Side * Side;
        System.out.println("Площадь = " + square);
        return square;
    }

    @Override
    public float getPerimeter() {
        perimeter = Side * 4;
        System.out.println("периметр = " + perimeter);
        return perimeter;
    }

    Square() {
        getSquare();
        getPerimeter();
    }
}
