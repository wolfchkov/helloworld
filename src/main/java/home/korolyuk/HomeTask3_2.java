package home.korolyuk;


import java.util.Scanner;

/**
 * Created by admin on 2/19/2018.
 */
public class HomeTask3_2 {
    public static String str = "another looooong string";
    public static StringBuilder strsb = new StringBuilder();
    public static Scanner scan = new Scanner(System.in);

    public static void symbolCounter(){
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 1;
            int j = i;
            while (str.indexOf(ch,j) != str.lastIndexOf(ch)) {
                count++;
                j = str.indexOf(ch,j) + 1;
            }
            if (strsb.toString().contains(ch+""))
                continue;

            strsb.append(ch);
            System.out.println(ch + " - " + count);
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите строку");
        str = scan.nextLine();
        symbolCounter();
    }
}
