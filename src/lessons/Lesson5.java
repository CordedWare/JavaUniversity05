package lessons;

public class Lesson5 {

    static int tcNumber = 1;

    public static void printTCNumber() {
        System.out.print("TC_" + tcNumber++ + "  --  ");
    }

    public static void printTestResult(String value) {
        System.out.println(value);
    }

    public static String verifyEquals(int exceptedResult, int actualResult) {
        if (exceptedResult == actualResult) {
            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {
            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    }

    public static String verifyEquals(double exceptedResult, double actualResult) {
        if (exceptedResult == actualResult) {
            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {
            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    }

    public static String verifyEquals(String exceptedResult, String  actualResult) {
        if (exceptedResult == actualResult) {
            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {
            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    }


    public static int findMaxOutOfTwo1(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static int findMaxOutOfFour1(int a, int b, int c, int d) {
        int max1;
        int max2;
        if (a >= b) {
            max1 = a;
        } else {
            max1 = b;
        }

        if (c >= d) {
            max2 = a;
        } else {
            max2 = b;
        }

        if (max1 >= max2) {
            return max1;
        } else {
            return max2;
        }
    }

    public static int findMaxOutOfFour2(int a, int b, int c, int d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    public static int findMaxOutOfFour3(int a, int b, int c, int d) {
        return findMaxOutOfTwo1(a, findMaxOutOfTwo1(b, findMaxOutOfTwo1(c, d)));
    }

    public static String returnMonth(int number) {
        if (number > 0 && number < 4) {
            if (number == 1) {

                return "January";

            } else if (number == 2) {

                return "February";

            } else if (number == 3) {

                return "Marth";
            }
        }
            return "Error";
    }

    public static String evaluateDistance(double distance) {
        int km = (int) distance;
        int m = (int) ((distance - km) * 1000);

        return "" + km + " км " + m + " м";
    }


    public static void main (String[]args){


            // Auto Tests

            // TC_1
            // AAA - triple "A" правило создания автоматизированного тест кейса

            // A = arrange (объявить все данные, которые нам известны)
            int a = 5;
            int b = 9;
            int expectedResult = 9;

            // Act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
            int actualResult = findMaxOutOfTwo1(5, 9);

            // A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
            verifyEquals(expectedResult, actualResult);

            // Report TC_1
            printTCNumber();
            printTestResult(verifyEquals(expectedResult, actualResult));


            // TC_2
            // AAA - triple "A" правило создания автоматизированного тест кейса

            // A = arrange (объявить все данные, которые нам известны)
            a = 3;
            b = 3;
            expectedResult = 3;

            // Act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
            actualResult = findMaxOutOfTwo1(a, b);

            // A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
            verifyEquals(expectedResult, actualResult);

            // Report TC_2
            printTCNumber();
            printTestResult(verifyEquals(expectedResult, actualResult));


            // TC_3
            // AAA - triple "A" правило создания автоматизированного тест кейса

            // A = arrange (объявить все данные, которые нам известны)
            a = 10;
            b = 5;
            expectedResult = 10;

            // Act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
            actualResult = findMaxOutOfTwo1(a, b);

            // A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
            verifyEquals(expectedResult, actualResult);

            // Report TC_3
            printTCNumber();
            printTestResult(verifyEquals(expectedResult, actualResult));


            // TC_4
            // AAA - triple "A" правило создания автоматизированного тест кейса

            // A = arrange (объявить все данные, которые нам известны)
            int number = 2;
            String expectedResult4 = "February";

            // Act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
            String actualResult4 = returnMonth(number);

            // A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
            verifyEquals(expectedResult4,actualResult4);

            // Report TC_4
            printTCNumber();
            printTestResult(verifyEquals(expectedResult4, actualResult4));



            // TC_5
            // AAA - triple "A" правило создания автоматизированного тест кейса

            // A = arrange (объявить все данные, которые нам известны)
            number = 13;
            expectedResult4 = "Error";

            // Act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
            actualResult4 = returnMonth(number);

            // A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
            verifyEquals(expectedResult4,actualResult4);


            // Report TC_5
            printTCNumber();
            printTestResult(verifyEquals(expectedResult4, actualResult4));


            // TC_6
            // AAA - triple "A" правило создания автоматизированного тест кейса

            // A = arrange (объявить все данные, которые нам известны)
            double distance = 6.004;
            expectedResult4 = "6 км 4 м";

            // Act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
            actualResult4 = evaluateDistance(distance);

            // A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
            verifyEquals(expectedResult4, actualResult4);

            // Report TC_6
            System.out.println(evaluateDistance(distance));

    }

}
