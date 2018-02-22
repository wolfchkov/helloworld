package home.korolyuk;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by admin on 2/19/2018.
 */
public class HomeTask3_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ФИО");
        String FIO = scan.nextLine(); // = "Korolyuk Daria Aleksandrovna";
        System.out.println("Введите номер телефона");
        String phone = scan.nextLine(); // = "+380955030737";
        System.out.println("Введите email");
        String email = scan.nextLine(); // = "dkorolyuk@playtika.com";
        Pattern FIOpat = Pattern.compile("[A-Z,a-z]+-*[A-Z,a-z]+\\s[A-Z,a-z]+\\s[A-Z,a-z]+");
        Pattern phonePat = Pattern.compile("\\+380[9564][95643]\\d{7}");
        Pattern emailPat = Pattern.compile("\\w+-*\\w+@{1}[a-z]+.{1}[a-z]+");
        Matcher FIOm = FIOpat.matcher(FIO);
        Matcher phoneM = phonePat.matcher(phone);
        Matcher emailM = emailPat.matcher(email);


            if (!FIOm.matches()){
                System.out.println(FIO + " Введено неверно");
            }
            if (!phoneM.matches()){
                System.out.println(phone + " Введено неверно");
            }
            if (!emailM.matches()){
                System.out.println(email + " Введено неверно");
            }
        }

    }

