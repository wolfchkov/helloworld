package home.Task4;

import java.util.Scanner;

public class LastClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите фигуру:1 - круг; 2 - квадрат; 3 - прямоугольник; 4 - треугольник " );
        int shapeNum = scan.nextInt();

        switch (shapeNum){
            case 1:
                Circle circle = new Circle();
                break;
            case 2:
                Square square = new Square();
                break;
            case 3:
                Rectangle rectangle = new Rectangle();
                break;
            case 4:
                Triangle triangle = new Triangle();
                break;
            default:
                System.out.println("Я не знаю такую фигуру");

        }
    }
}
