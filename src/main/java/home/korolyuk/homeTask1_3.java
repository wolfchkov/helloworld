package home.korolyuk;

import java.util.Scanner;

/**
 * Created by admin on 2/4/2018.
 */
//Имя класса с большой буквы
public class homeTask1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите координату X");
        int x = console.nextInt();
        System.out.println("Введите координату Y");
        int y = console.nextInt();
        System.out.println("Введите координату Z");
        int z = console.nextInt();
        System.out.println("Длина вектора (X, Y, Z) = " + Math.sqrt(x*x + y*y + z*z));
    }
}
