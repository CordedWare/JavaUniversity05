package homework;

import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class HW7 {

    static int tcNumber = 1; // numbering variable for tasks

    public static void printTCNumber() {
        System.out.println("\n\u001B[34m" + "Task_" + tcNumber++ + "\u001B[0m");
    } // numbering method of tasks

    public static void printTestResult(String value) {
        System.out.println(value);
    } // report printing method for AAA

    public static String verifyEquals(int exceptedResult, int actualResult) {
        if (exceptedResult == actualResult) {

            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {

            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    } // "int" method to compare 'expected' and 'actual' result

    public static String verifyEquals(String exceptedResult, String actualResult) {
        if (exceptedResult == actualResult) {

            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {

            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    } // "String" method to compare 'expected' and 'actual' result

    /// tasks method ///

    public static String switchOfMonth1_1(int month) {
        month = month;
        String monthString;

        switch (month) {
            case 1:
                monthString = "Janiary";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "Marth";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        return monthString;
    } // Task 1_1

    public static String switchOfWeekly1_2(int weekly) {
        weekly = weekly;
        String weeklyString;

        switch (weekly) {
            case 1:
                weeklyString = "Monday";
                break;
            case 2:
                weeklyString = "Tuesday";
                break;
            case 3:
                weeklyString = "Wednesday";
                break;
            case 4:
                weeklyString = "Thursday";
                break;
            case 5:
                weeklyString = "Friday";
                break;
            case 6:
                weeklyString = "Saturday";
                break;
            case 7:
                weeklyString = "Sunday";
                break;
            default:
                weeklyString = "Invalid month";
        }
        return weeklyString;
    } // Task 1_2

    public static int switchOfDay1_3(int day) {
       if (day > 0 && day < 32) {
           return day;

       } else {
           return -1;
       }
    } // Task 1_3

    public static void switchOfDate1_4(int month, int weekly, int day) {
        System.out.println(switchOfMonth1_1(month) + "\n" + switchOfWeekly1_2(weekly) + "\n" + switchOfDay1_3(day));
    } // Task 1_3

    public static void returnUniversalFor(int start, int end, int step) {
        if (step == 0) {
            System.out.print("Error! Enter correct step number");
        } else {

            if (start < end && step > 0) {                     // 1
                int start1 = start - start % step;
                if (start1 < start) {
                    start1 += step;
                }

                for (int i = start1; i <= end; i += step) {
                    System.out.print(i + " ");
                }                                              // 1

            } else if (start > end && step > 0) {              // 2
                int start1 = start - start % step;
                if (start1 > start) {
                    start1 -= step;
                }

                for (int i = start1; i >= end; i -= step) {
                    System.out.print(i + " ");
                }                                              // 2

            } else if (start < end && step < 0) {              // 3
                int start1 = start - start % step;
                if (start1 < start) {
                    start1 -= step;
                }

                for (int i = start1; i <= end; i -= step) {
                    System.out.print(i + " ");
                }                                              // 3

            } else if (start > end && step < 0) {              // 4
                int start1 = start - start % step;
                if (start1 > start) {
                    start1 += step;
                }

                for (int i = start1; i >= end; i += step) {
                    System.out.print(i + " ");
                }                                              // 4
            }
        }
    }

    public static void main(String[] args) {

        // Task_1_1
        // Написать метод с оператором switch, который печатает месяц, когда выбираем число.
        // Протестировать на граничные значения.

        // AAA - triple "A" правило создания автоматизированного тест кейса

        // A = arrange (объявить все данные, которые нам известны)
        int month = 15;
        String exceptedResult = "Invalid month";

        // A = act (вызов метода, действие для получения actual result)
        String actualResult = switchOfMonth1_1(month);

        // A = assert (сравнение excepted result c actual result и вывод, прошел тест или упал)
        verifyEquals(exceptedResult,actualResult);

        // Report Task_1 (печать результата)
        printTCNumber();
        printTestResult(verifyEquals(exceptedResult,actualResult));
        System.out.println(switchOfMonth1_1(month));

        int month1_4 = 1;
        int weekly = 1;
        int day = 32;
        switchOfDate1_4(month1_4,weekly,day);

        // Task_2
        printTCNumber();
        returnUniversalFor(1,7,7);
        System.out.println();
        returnUniversalFor(-1,-26,-7);
        System.out.println();
        returnUniversalFor(-1,26,7);
        System.out.println();
        returnUniversalFor(1,-26,-7);
        System.out.println();
        returnUniversalFor(1,-26,0);
        System.out.println();
        returnUniversalFor(7,7,7);
        // Сделан в HW6


        // Task_3
        // Создать массив catsNames[], заполнить его любыми своими значениями
        // (не такими, как были на уроке).
        printTCNumber();

        String catsNames[] = new String[8];

        catsNames[0] = "Java";
        catsNames[1] = "Python";
        catsNames[2] = "Groovy";
        catsNames[3] = "Maven";
        catsNames[4] = "Tomcat";
        catsNames[5] = "Ubuntu";
        catsNames[6] = "Postman";
        catsNames[7] = "PostgreSQL";

        System.out.println(Arrays.toString(catsNames));

        // Task_4
        // В массиве catsNames[] изменить значение элемента с индексом 4 на “Рыжик”,
        // а значение элемента с индексом 1 на “Черныш”. (ВЗЯЛ СВОИ)
        printTCNumber();

        catsNames[4] = "Lipton";
        catsNames[1] = "Coffee";

        System.out.println(Arrays.toString(new String[]{catsNames[4]}));
        System.out.println(Arrays.toString(catsNames[1].toCharArray()));
        System.out.println(Arrays.toString(catsNames));

        // Task_5
        // Создать массив catsColors[] и заполнить его значениями (см картинку в презентации).
        printTCNumber();

        String catsColors[] = {"White", "Orange", "Blue", "Green",
                               "Pink", "Black", "Red", "Vanil"};

        System.out.println(Arrays.toString(catsColors));
        System.out.println(catsColors.length);

        // Task_6
        // Создать массив catsAges[] и заполнить его любыми целочисленными валидными значениями.
        printTCNumber();

        int catsAges[] = {2, 0, 5, 7, 6, 4, 9, 1};

        System.out.println(Arrays.toString(catsAges));
        System.out.println();

        // Task_7
        // Создать массив isCatRed[] и заполнить его соответствующими значениями
        // (см картинку в презентации. Red = рыжий)
        printTCNumber();

        boolean isCatRed[] = new boolean[] {false, false, false, false, false, false, true, false};

        for (int j = 0; j < isCatRed.length; j++)
            if(isCatRed[j] == true) System.out.println(isCatRed[j]);
        System.out.println(Arrays.toString(new boolean[]{isCatRed[6]}));


        // Task_8
        // Распечатать для массивов catsNames[] и catsColors[]:
        // имя кота в коробке с номером 6
        // имена котов из коробок с четными индексами
        // имена котов из коробок, чьи индексы кратны 4
        // цвет котов из коробок с нечетными индексами
        // цвет котов из коробок, чьи индексы кратны 3, но не кратны 2
        printTCNumber();

        System.out.println(Arrays.toString(new String[]{catsNames[6]}));
        System.out.println(Arrays.toString(new String[]{catsColors[6]}));

//        catsNames
//        int n=0;
//        int m=0;
//        for(int i=0;i<catsNames.length;i++){
//            if(catsNames[i] % 2 ==0){
//                // Записываем четное число
//                n++;
//            }
//            else {
//                // Записываем нечетное число
//                m++;
//            }
//        }
//        System.out.println ("четное число:" + n + "штука");
//        System.out.println ("нечетное число:" + m + "штука");



        {
        // Task_1
        //
        // Протестировать на граничные значения.

        // AAA - triple "A" правило создания автоматизированного тест кейса

        // A = arrange (объявить все данные, которые нам известны)

        // A = act (вызов метода, действие для получения actual result)

        // A = assert (сравнение excepted result c actual result и вывод, прошел тест или упал)

        // Report Task_1 (печать результата)
    }



    }
}