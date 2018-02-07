package home.korolyuk;

import java.util.Scanner;

/**
 * Created by admin on 2/4/2018.
 */
//имя класса с большой буквы
public class homeTask1_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 5значное число и нажмите Enter");
        int x = console.nextInt();
        int x1 = x%10;
        x = x/10;
        int x2 = x%10;
        x = x/10;
        int x3 = x%10;
        x /= 10;
        int x4 = x%10;
        x /= 10;
        int x5 = x%10;
        System.out.printf(" %d %n %d %n %d %n %d %n %d %n", x1, x2, x3, x4, x5 );
    }
}
