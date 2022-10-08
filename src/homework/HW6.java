package homework;

import java.time.temporal.ValueRange;

public class HW6 {

    static int tcNumber = 1;

    public static void printTCNumber() {
        System.out.println("\n\033[1;32m" + "Task_" + tcNumber++ + "\u001B[0m");
    } // метод нумерации

    public static void printTestResult(String value) {
        System.out.println(value);
    }  // метод печати отчета

    public static String verifyEquals(int exceptedResult, int actualResult) {
        if (exceptedResult == actualResult) {

            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {

            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    } // метод int сравнения ожидаемого и фактического результата

    public static String verifyEquals(double exceptedResult, double actualResult) {
        if (exceptedResult == actualResult) {
            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {
            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    } // метод double сравнения ожидаемого и фактического результата


    ////////////////////////////// методы задач //////////////////////////////

    public static String returnCicleOfStartEndStep(int start, int end, int step) {
        for (int i = start; i < end; i += step) {
            System.out.println(i);
        }
        return "Цикл завершен";
    } // #10

    public static String returnChar(char n, char m) {
        n = 'n';
        m = 'm';
        System.out.println((char) n);
        System.out.println((char) m);
        for (char i = 'n'; i <= 'n'; i++) {
            System.out.println((char) i);
        }
        return "exit";
    } // #11

    public static String returnMethodOfIntegerEnd(int l) {
        for (int i = 0; i <= l; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        return "Цикл завершен";
    } // #12

    public static String returnMethodOfDegreeEnd(int n) {
        for (int i = 0; i <= n; i++) {
            i = (int) Math.pow(i, 2);
            System.out.println(i);
        }
        return "Цикл завершен";
    } // #13

    public static String returnMethodOfGeneration() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        return "Цикл завершен";
    } // #15

    public static void main(String[] args) {

        printTCNumber(); // начало #1
        System.out.println("Последовательность чисел от 0 до 9 включительно:");
        for (int i = 0; i <= 9; i++) {
            System.out.println(i);
        } // конец #1

        printTCNumber(); // начало #2
        System.out.println("Последовательность чисел от 10 исключительно до 0 включительно:");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        } // конец #2

        printTCNumber(); // начало #3
        System.out.println("Последовательность чисел от 50 до 55 включительно с шагом 2:");
        for (int i = 10; i >= 0; i--) {
            System.out.println("\t \033[1;32mпервый цикл:\u001B[0m " + i);
            for (int j = 50; j <= 55; j++) {
                System.out.println("второй цикл: " + j);
            }
        } // конец #3

        printTCNumber(); // начало #4
        System.out.println("Последовательность чисел, кратных 7, в промежутке (327, 300):");
        for (int i = 327; i >= 300; i -= 7) {
            System.out.println(i);
        } // конец #4

        printTCNumber(); // начало #5
        System.out.println("Последовательность чисел в промежутке [12, 13] с шагом 0.1:");
        for (double i = 12; i <= 13; i += 0.1) {
            String result = String.format("%.1f", i);
            System.out.println(result);
        } // конец #5

        printTCNumber(); // начало #6
        System.out.println("Последовательность четных чисел от 215 до 237 включительно:");
        for (int i = 215; i <= 237; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        } // конец #6

        printTCNumber(); // начало #7
        System.out.println("Последовательность чисел, кратных 7, в промежутке от 7 " +
                "\nисключительно до 14 исключительно:");
        for (int i = 7; i < 14; i += 7) {
            System.out.println(i);
        } // конец #6

        printTCNumber(); // начало #8
        System.out.println("Распечатать последовательность которая начинается с минимального \nзначения" +
                " типа данных short и заканчивается максимальным значением \nshort. Числа в последовательности " +
                "должны быть кратны 15001:");
        for (short i = -32768; i <= 0; i += 15001) {
            System.out.println(i);
        }
//        for (short j = 0; j <= 32767; j+=15001) {
//            System.out.println(j);
//        }// конец #8 ??????????????????

        printTCNumber(); // начало #9
        System.out.println("Распечатать последовательность чисел в промежутке от -10 до 34 включительно. " +
                "\nЧисла, кратные 11, должны быть распечатаны синим цветом. Числа, кратные 12, \nдолжны быть " +
                "распечатаны красным цветом. А ноль необходимо распечатать словом ZERO.");
        for (int i = -10; i <= 34; i++) {
            System.out.println(i);
            if (i == 11 || i == 22 || i == 33) {
                System.out.println("\u001B[34m" + i + "\u001B[0m");
            }
            if (i == 12 || i == 24) {
                System.out.println("\u001B[41m" + i + "\u001B[0m");
            }
            if (i == 0) {
                System.out.println("ZERO");
            }
        } // конец #9 ??????????????????????

        printTCNumber(); // начало #10
        System.out.println("Написать метод, который принимает на вход параметры start, end, step, и печатает " +
                "\nпоследовательность десятичных  чисел, начиная с числа start, с шагом step. " +
                "Точка выхода \nиз цикла - число end:");
        returnCicleOfStartEndStep(1, 11, 1);
        // конец #10

        printTCNumber(); // начало #11
        System.out.println("Написать метод, который принимает на вход параметры n и m типа char, и выводит на печать" +
                " \nпоследовательность букв английского алфавита в промежутке между значениями n и m включительно:");
        returnChar('n', 'm');
        // конец #11 ?????????????????????

        // ___________PART2______________

        printTCNumber(); // начало #12
        System.out.println("Написать метод, который принимает параметр и печатает последовательность четных чисел" +
                " от нуля. \nДлина последовательности = l:");
        returnMethodOfIntegerEnd(18);
        // конец #12

        printTCNumber(); // начало #13
        System.out.println("Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до" +
                " \nn включительно:");
        returnMethodOfDegreeEnd(100);
        // конец #13

        printTCNumber(); // начало #14
        System.out.println("Вывести последовательность 012345678900112233445566778899000…  до числа 9999 " +
                "включительно:");
        for (int i = 0; i < 10; ) {
            // конец #14
        }
    }
}
