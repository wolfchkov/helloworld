package home.Task4;

public class CircleFactory extends ShapeFactory {
    int radius;

    @Override
    public int getShape(){
        System.out.println("Введите радиус");
        int radius = scan.nextInt();
        //System.out.println(radius);
        return radius;
    }

}




