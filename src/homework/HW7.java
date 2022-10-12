package homework;

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
       if (day > 0 || day < 32)
           return day;
        return day;
    } // Task 1_3

    public static void switchOfDate1_4(String month, int weekly, int day) {
        switchOfMonth1_1(month);
        switchOfWeekly1_2(weekly);
        switchOfDay1_3(day);

    } // Task 1_3

    private static void switchOfMonth1_1(String month) {
        return;
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