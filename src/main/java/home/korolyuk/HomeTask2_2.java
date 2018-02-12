package home.korolyuk;

import java.util.Scanner;

import static java.util.Arrays.sort;

/**
 * Created by admin on 2/11/2018.
 */
public class HomeTask2_2 {
    public static void main(String[] args) {
        Scanner sLong = new Scanner(System.in);
        System.out.println("Введите положительное число ");
        long l1 = sLong.nextLong();
        String strl1 = ""+l1;
        int l1Length = strl1.length();
        long[] l1Array = new long[l1Length];
        for (int i = 0; i < l1Length; i++){
            l1Array [i] = l1 % 10;
            l1 = l1/10;
        }
        sort(l1Array);
        System.out.println("Наименьшее число: " + l1Array[0]);
        System.out.println("Набольшее число: " + l1Array[l1Length - 1]);
    }



}
