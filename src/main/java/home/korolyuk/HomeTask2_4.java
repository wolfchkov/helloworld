package home.korolyuk;

/**
 * Created by admin on 2/12/2018.
 */
public class HomeTask2_4 {
    public static void main(String[] args) {
        if (degreeOfTwo(64)) {
            System.out.print("Число является степенью двойки");
        } else {System.out.print("Число не является степенью двойки");}
    }

    public static boolean degreeOfTwo( int n){
        boolean result;
        int b;
        if (n == 2)
            return true;
        if (n % 2 > 0)
            return false;
         result = degreeOfTwo(n/2);

         return result;
    }
}
