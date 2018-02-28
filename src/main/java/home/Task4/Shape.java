package home.Task4;

public abstract class Shape {
    public float square;
    public float perimeter;

    public float getSquare(){
        System.out.println("Площадь = " + square);
        return square;
    }
    public float getPerimeter() {
        System.out.println("периметр = " + perimeter);
        return perimeter;
    }
}
