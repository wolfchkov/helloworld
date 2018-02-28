package home.Task4;

public class TriangleFactory extends ShapeFactory {
    int sideLeft;
    int sideRight;
    int sideBase;

    public int getSideLeft(){
        System.out.println("Введите левую грань треугольника");
        sideLeft = scan.nextInt();
        return sideLeft;
    }

    public int getSideRight(){
        System.out.println("Введите правую грань треугольника");
        sideRight = scan.nextInt();
        return sideRight;
    }

    public int getSideBase(){
        System.out.println("Введите основание треугольника");
        sideBase = scan.nextInt();
        return sideBase;
    }
}
