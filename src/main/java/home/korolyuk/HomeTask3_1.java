package home.korolyuk;

import java.util.Scanner;

public class HomeTask3_1 {
    public static void main(String[] args) {
        final String patA = "A. СТРОКА ЗАГЛАВНЫМИ БУКВАМИ";
        final String patB = "B. строка в нижнем регистре";
        final String patC = "C. С Заглавной Буквы (Первый Символ Каждого Слова В Строке )";
        final String patD = "D. пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ";
        final String patE = "E. Как в предложении(с заглавной буквы).";
        final String patF = "F. выход из прораммы";

        String initialStr = "Пример строки, которую ввел пользователь";

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите строку");

        initialStr = scan.nextLine();

        System.out.printf("Выберите шаблон: %n %s%n %s%n %s%n %s%n %s%n %s%n", patA, patB, patC, patD, patE, patF);

        String pat = scan.nextLine().toUpperCase();

        switch (pat) {
            case "A":
                System.out.println(initialStr.toUpperCase());
                break;
            case "B":
                System.out.println(initialStr.toLowerCase());
                break;
            case "C":
                initialStr = initialStr.toLowerCase();
                String [] strArr = initialStr.split(" ");
                for(int i = 0; i < strArr.length; i++) {
                    String subStr = strArr[i].substring(0,1);
                    strArr[i] = strArr[i].replaceFirst(subStr, subStr.toUpperCase());
                }
                for (String str: strArr) {
                    System.out.print(str + " ");
                }
                break;
            case "D":
                initialStr = initialStr.toUpperCase();
                String [] strArr1 = initialStr.split(" ");
                for(int i = 0; i < strArr1.length; i++) {
                    String subStr = strArr1[i].substring(0,1);
                    strArr1[i] = strArr1[i].replaceFirst(subStr, subStr.toLowerCase());
                }
                for (String str: strArr1) {
                    System.out.print(str + " ");
                }
                break;
            case "E":
                String subInitialStr = initialStr.substring(0,1);
                initialStr = initialStr.replace(subInitialStr, subInitialStr.toUpperCase());
                System.out.println(initialStr);
                break;
            case "F":
                break;
        }
    }
}
