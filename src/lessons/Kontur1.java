package lessons;

public class Kontur1 {

    public static void main(String[] args) {

        int n = 21;

        System.out.println(21/3);

        if ((n % 2 != 0) && (n % 3 == 0)) {
            n = 0;
        } else if ((n % 2 != 0) && (n % 3 != 0)) {
            n = 10;
        } else if ((n % 2 == 0) && (100 % n == 0)) {
            n = 100;
        }
        System.out.println(n);

        int expectedResult = 10;
        int actualResult = n;

        if (actualResult == expectedResult) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}

