package lessons;

public class Lesson6 {

    public static void printTestResult(String value) {
        System.out.println(value);
    } // метод печати отчета

    public static String verifyEquals(double exceptedResult, double actualResult) {
        if (exceptedResult == actualResult) {
            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {
            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    } // метод double сравнения

    public static double returnABC (double a, double b, double c) {
        double abc = a * b - c;

        if (abc > 0) {
            return abc;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        // TC_1
        // AAA - triple "A" правило создания автоматизированного тест кейса

        // A = arrange (объявить все данные, которые нам известны)
        double a = 7;
        double b = 2;
        double c = 4;
        double exceptedResult = 10;

        // A = act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
        double actualResult = returnABC(a,b,c);

        // A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
        verifyEquals(exceptedResult,actualResult);

        // Report TC_1
        printTestResult(verifyEquals(exceptedResult,actualResult));
        System.out.println(returnABC(a,b,c));

    }
}
