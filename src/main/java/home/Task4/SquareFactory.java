package home.Task4;

public class SquareFactory extends ShapeFactory {
    int side;
    @Override
    public int getShape(){
        System.out.println("Введите сторону квадрата");
        side = scan.nextInt();
        return side;
    }

}
