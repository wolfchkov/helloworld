package home.korolyuk;

/**
 * Created by admin on 2/11/2018.
 */
public class HomeTask2_3 {
    public static void main(String[] args) {
         System.out.print(fib(10));
            }
            public static long fib( int n) {
                long result;

                if (n == 1)
                    return 1;
                if (n==2)
                    return 1;

                result = fib(n-1) + fib(n-2);

                return result;
            }

        }


