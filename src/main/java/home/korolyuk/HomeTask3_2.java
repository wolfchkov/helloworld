package home.korolyuk;


import java.util.Scanner;

/**
 * Created by admin on 2/19/2018.
 */
public class HomeTask3_2 {
    public static String str = "another looooong string";
    public static StringBuilder strsb = new StringBuilder();
    public static Scanner scan = new Scanner(System.in);

    //Решение принимается, но не очень оптимальное, так как цикл в цикле
    //можно решить использую всего лишь один цикл
    //там только латинские буквы а они лежат в диапазоне чисел 0 - 128
    //достаточно создать массив, int[128] и использовать сивол
    //как индекс в этом массиве, прибавляя каждый раз еденичку в элементе массива
    //индекс которого и является буквой :)
    //только нужно проверить, что пользователь ввел только латинские буквы
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
        //не очень хорошая идея использовать статическое поле как переменную 
        //для чтения строки, лучше объявите тут переменную а 
        //в метод добавте параметр symbolCounter(String str)
        str = scan.nextLine();
        symbolCounter();
    }
}
