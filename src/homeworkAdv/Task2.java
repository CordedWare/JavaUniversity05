package homeworkAdv;

public class Task2 {


    public static void main(String[] args) {

        {
            int a, b;
            a = 15;
            b = 20;

            boolean A = (a == b);
            System.out.println(A);

            boolean B = (a < b);
            System.out.println(B);

            boolean C = (a > b);
            System.out.println(C);
        }

        System.out.println();

        {
            int a, b;
            a = 8;
            b = 8;

            if ((a & 2) == 0 & (b & 2) == 0) {
                System.out.println("maybe a and b are even");
            } else {
                if ((a & 2) == 1 & (b & 2) == 1) System.out.println("some variable is odd");
            }
        }

        System.out.println();

        {
            int a;
            a = 8;

            if (a > 10) {
                System.out.println("Переменная больше 10.");
            } else {
                if (a < 100) {
                    System.out.println("Переменная меньше 100.");
                } else {
                    if ((a / 2) > 20) {
                        System.out.println("Результат деления на 2 больше 20.");
                    } else {
                        if (a >= 5 | a <= 40 ) {
                            System.out.println("Значение переменной между 5 и 40 включительно.");
                        } else {
                            if (a < 5 | a > 40 ) {
                                System.out.println("Значение переменной между 5 и 40 включительно."); }
                        }
                    }
                }
            }

            System.out.println();

            {
                int Result1 = (int) Math.pow(5, 0);
                int Result2 = (int) Math.pow(5, 1);
                int Result3 = (int) Math.pow(5, 2);
                int Result4 = (int) Math.pow(5, 3);
                int Result5 = (int) Math.pow(5, 4);
                int Result6 = (int) Math.pow(5, 5);

                System.out.println("Результат 5 в 0 степени: " + Result1);
                System.out.println("Результат 5 в 1 степени: " + Result2);
                System.out.println("Результат 5 в 2 степени: " + Result3);
                System.out.println("Результат 5 в 3 степени: " + Result4);
                System.out.println("Результат 5 в 4 степени: " + Result5);
                System.out.println("Результат 5 в 5 степени: " + Result6);
            }

            System.out.println();

            {
                System.out.println("Первый вариант задания.");

                for (int i = 40; i <= 60; i++) {
                    if ((i%4)==0)
                        System.out.println("  Числа кратные 4 между числами 40 и 60 включительно: " + i);
                }

                System.out.println();

                System.out.println("Второй вариант задания.");

                int[] numbers = {40,44,48,52,56,60};
                for ( int item: numbers ){
                    System.out.println("  Числа кратные 4 между числами 40 и 60 включительно: " + item);
                }
            }
        }
    }
}
