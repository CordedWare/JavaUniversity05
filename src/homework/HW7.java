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

    public static void main(String[] args) {

        // Task_1_1
        // Íàïèñàòü ìåòîä ñ îïåğàòîğîì switch, êîòîğûé ïå÷àòàåò ìåñÿö, êîãäà âûáèğàåì ÷èñëî.
        // Ïğîòåñòèğîâàòü íà ãğàíè÷íûå çíà÷åíèÿ.

        // AAA - triple "A" ïğàâèëî ñîçäàíèÿ àâòîìàòèçèğîâàííîãî òåñò êåéñà

        // A = arrange (îáúÿâèòü âñå äàííûå, êîòîğûå íàì èçâåñòíû)
        int month = 15;
        String exceptedResult = "Invalid month";

        // A = act (âûçîâ ìåòîäà, äåéñòâèå äëÿ ïîëó÷åíèÿ actual result)
        String actualResult = switchOfMonth1_1(month);

        // A = assert (ñğàâíåíèå excepted result c actual result è âûâîä, ïğîøåë òåñò èëè óïàë)
        verifyEquals(exceptedResult,actualResult);

        // Report Task_1 (ïå÷àòü ğåçóëüòàòà)
        printTCNumber();
        printTestResult(verifyEquals(exceptedResult,actualResult));
        System.out.println(switchOfMonth1_1(month));

        int month1_4 = 1;
        int weekly = 1;
        int day = 32;
        switchOfDate1_4(month1_4,weekly,day);

        // Task_2
        printTCNumber();
        System.out.println("Ñäåëàí â HW6");
        // Ñäåëàí â HW6


        // Task_3
        // Ñîçäàòü ìàññèâ catsNames[], çàïîëíèòü åãî ëşáûìè ñâîèìè çíà÷åíèÿìè
        // (íå òàêèìè, êàê áûëè íà óğîêå).
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
        // Â ìàññèâå catsNames[] èçìåíèòü çíà÷åíèå ıëåìåíòà ñ èíäåêñîì 4 íà “Ğûæèê”,
        // à çíà÷åíèå ıëåìåíòà ñ èíäåêñîì 1 íà “×åğíûø”. (ÂÇßË ÑÂÎÈ)
        printTCNumber();

        catsNames[4] = "Lipton";
        catsNames[1] = "Coffee";

        System.out.println(Arrays.toString(new String[]{catsNames[4]}));
        System.out.println(Arrays.toString(catsNames[1].toCharArray()));
        System.out.println(Arrays.toString(catsNames));

        // Task_5
        // Ñîçäàòü ìàññèâ catsColors[] è çàïîëíèòü åãî çíà÷åíèÿìè (ñì êàğòèíêó â ïğåçåíòàöèè).
        printTCNumber();

        String catsColors[] = {"White", "Orange", "Blue", "Green", "Pink", "Black", "Red",
                "Vanil"};

        System.out.println(Arrays.toString(catsColors));
        System.out.println(catsColors.length);

        // Task_6
        // Ñîçäàòü ìàññèâ catsAges[] è çàïîëíèòü åãî ëşáûìè öåëî÷èñëåííûìè âàëèäíûìè çíà÷åíèÿìè.
        printTCNumber();

        int catsAges[] = {2, 0, 5, 7, 6, 4, 9, 1};

        System.out.println(Arrays.toString(catsAges));
        System.out.println();

        // Task_7
        // Ñîçäàòü ìàññèâ isCatRed[] è çàïîëíèòü åãî ñîîòâåòñòâóşùèìè çíà÷åíèÿìè
        // (ñì êàğòèíêó â ïğåçåíòàöèè. Red = ğûæèé)
        printTCNumber();

        boolean isCatRed[] = {false, false, false, false, false, false, true, false};
        for (int i = 0 ; i < isCatRed.length; i++) {
            for (int j = i + 1; j < isCatRed.length; j ++) {
                if (isCatRed[i] && isCatRed[j]) {
                    isCatRed[i] = false;
                    isCatRed[j] = true;
                }
            }
        }
        for (int j = 0; j < isCatRed.length; j++)
            if(isCatRed[j] == true) System.out.println(isCatRed[j]);





        {
        // Task_1
        //
        // Ïğîòåñòèğîâàòü íà ãğàíè÷íûå çíà÷åíèÿ.

        // AAA - triple "A" ïğàâèëî ñîçäàíèÿ àâòîìàòèçèğîâàííîãî òåñò êåéñà

        // A = arrange (îáúÿâèòü âñå äàííûå, êîòîğûå íàì èçâåñòíû)

        // A = act (âûçîâ ìåòîäà, äåéñòâèå äëÿ ïîëó÷åíèÿ actual result)

        // A = assert (ñğàâíåíèå excepted result c actual result è âûâîä, ïğîøåë òåñò èëè óïàë)

        // Report Task_1 (ïå÷àòü ğåçóëüòàòà)
    }



    }
}