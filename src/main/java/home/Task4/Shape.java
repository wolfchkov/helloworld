package home.Task4;

public abstract class Shape {
    //Эти поля не нужны, расчет в самом методе 
    public float square;
    public float perimeter;

    //метод должен быть абстрактным а его реализация в конкретной фигуре
    public float getSquare(){
        System.out.println("Площадь = " + square);
        return square;
    }

    //метод должен быть абстрактным а его реализация в конкретной фигуре
    public float getPerimeter() {
        System.out.println("периметр = " + perimeter);
        return perimeter;
    }
}
