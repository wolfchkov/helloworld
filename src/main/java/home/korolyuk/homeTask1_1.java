package home.korolyuk;

import java.util.Scanner;

/**
 * Created by admin on 2/4/2018.
 */
public class homeTask1_1 {
    public static void main(String[] args) {
        homeTask1_1.theLong();
        homeTask1_1.theInt();
        homeTask1_1.theFloat();
        homeTask1_1.theDouble();

    }
    public static void theLong(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите long х и нажмите Enter");
        long x = console.nextLong();
        System.out.println("Введите long y и нажмите Enter");
        long y = console.nextLong();
        System.out.println("Введите long Z и нажмите Enter");
        long z = console.nextLong();
        System.out.println("Введите long n и нажмите Enter");
        long n = console.nextLong();
        System.out.println("x + (y - 100)*z/n = " + (x + (y - 100) * z / n));
    }
    public static void theInt(){
        Scanner console1 = new Scanner(System.in);
        System.out.println("Считаем в Int");
        System.out.println("Введите int х");
        int x1 = console1.nextInt();
        System.out.println("Введите int y и нажмите Enter");
        int y1 = console1.nextInt();
        System.out.println("Введите int Z и нажмите Enter");
        int z1 = console1.nextInt();
        System.out.println("Введите int n и нажмите Enter");
        int n1 = console1.nextInt();
        System.out.println("(x - (50 + y * z) * n) + x = " + (x1 - (50 + y1 * z1) * n1));
    }
    public static void theFloat(){
        Scanner console2 = new Scanner(System.in);
        System.out.println("Считаем float");
        System.out.println("Введите float х и нажмите Enter");
        float x2 = console2.nextFloat();
        System.out.println("Введите float y и нажмите Enter");
        float y2 = console2.nextFloat();
        System.out.println("Введите float Z и нажмите Enter");
        float z2 = console2.nextFloat();
        System.out.println("Введите float n и нажмите Enter");
        float n2 = console2.nextFloat();
        System.out.println("x * (y / (z-1) + 555) - n  = " + (x2 * (y2 / (z2-1) + 555) - n2 ));
    }
    public static void theDouble(){
        Scanner console3 = new Scanner(System.in);
        System.out.println("Считаем double");
        System.out.println("Введите double х и нажмите Enter");
        double x3 = console3.nextDouble();
        System.out.println("Введите double y и нажмите Enter");
        double y3 = console3.nextDouble();
        System.out.println("Введите double Z и нажмите Enter");
        double z3 = console3.nextDouble();
        System.out.println("Введите double n и нажмите Enter");
        double n3 = console3.nextDouble();
        System.out.println("-x / y + z * (n+1)  = " + (-x3 / y3 + z3 * (n3 + 1) ));
    }

}