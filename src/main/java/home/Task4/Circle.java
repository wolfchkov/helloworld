package home.Task4;

public class Circle extends Shape{
    CircleFactory Radius = new CircleFactory();
    int rad = Radius.getShape();
    private static float square;
    private static float perimeter;

    @Override
    public float getSquare(){
        square = rad * rad * 3.14f;
        System.out.println("Площадь = " + square);
        return square;
    }

    @Override
    public float getPerimeter() {
        perimeter = 2*3.14f*rad;
        System.out.println("периметр = " + perimeter);
        return perimeter;
    }

    public Circle(){
        getSquare();
        getPerimeter();
    }

}
