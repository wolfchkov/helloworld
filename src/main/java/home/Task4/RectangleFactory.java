package home.Task4;

public class RectangleFactory extends ShapeFactory {
    int hight;
    int width;

    public int getHight(){
        System.out.println("Введите высоту прямоугольника");
        hight = scan.nextInt();
        return hight;
    }

    public int getWidth(){
        System.out.println("Введите ширину прямоугольника");
        width = scan.nextInt();
        return width;
    }
}
