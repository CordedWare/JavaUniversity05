package homework;

import java.time.temporal.ValueRange;

public class HW6 {

    static int tcNumber = 1;

    public static void printTCNumber() {
        System.out.println("\n\033[1;32m" + "Task_" + tcNumber++ + "\u001B[0m");
    } // ����� ���������

    public static void printTestResult(String value) {
        System.out.println(value);
    }  // ����� ������ ������

    public static String verifyEquals(int exceptedResult, int actualResult) {
        if (exceptedResult == actualResult) {

            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {

            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    } // ����� int ��������� ���������� � ������������ ����������

    public static String verifyEquals(double exceptedResult, double actualResult) {
        if (exceptedResult == actualResult) {
            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {
            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    } // ����� double ��������� ���������� � ������������ ����������


    ////////////////////////////// ������ ����� //////////////////////////////

    public static String returnCicleOfStartEndStep(int start, int end, int step) {
        for (int i = start; i < end; i += step) {
            System.out.println(i);
        }
        return "���� ��������";
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
        return "���� ��������";
    } // #12

    public static String returnMethodOfDegreeEnd(int n) {
        for (int i = 0; i <= n; i++) {
            i = (int) Math.pow(i, 2);
            System.out.println(i);
        }
        return "���� ��������";
    } // #13

    public static String returnMethodOfGeneration() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        return "���� ��������";
    } // #15

    public static void main(String[] args) {

        printTCNumber(); // ������ #1
        System.out.println("������������������ ����� �� 0 �� 9 ������������:");
        for (int i = 0; i <= 9; i++) {
            System.out.println(i);
        } // ����� #1

        printTCNumber(); // ������ #2
        System.out.println("������������������ ����� �� 10 ������������� �� 0 ������������:");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        } // ����� #2

        printTCNumber(); // ������ #3
        System.out.println("������������������ ����� �� 50 �� 55 ������������ � ����� 2:");
        for (int i = 10; i >= 0; i--) {
            System.out.println("\t \033[1;32m������ ����:\u001B[0m " + i);
            for (int j = 50; j <= 55; j++) {
                System.out.println("������ ����: " + j);
            }
        } // ����� #3

        printTCNumber(); // ������ #4
        System.out.println("������������������ �����, ������� 7, � ���������� (327, 300):");
        for (int i = 327; i >= 300; i -= 7) {
            System.out.println(i);
        } // ����� #4

        printTCNumber(); // ������ #5
        System.out.println("������������������ ����� � ���������� [12, 13] � ����� 0.1:");
        for (double i = 12; i <= 13; i += 0.1) {
            String result = String.format("%.1f", i);
            System.out.println(result);
        } // ����� #5

        printTCNumber(); // ������ #6
        System.out.println("������������������ ������ ����� �� 215 �� 237 ������������:");
        for (int i = 215; i <= 237; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        } // ����� #6

        printTCNumber(); // ������ #7
        System.out.println("������������������ �����, ������� 7, � ���������� �� 7 " +
                "\n������������� �� 14 �������������:");
        for (int i = 7; i < 14; i += 7) {
            System.out.println(i);
        } // ����� #6

        printTCNumber(); // ������ #8
        System.out.println("����������� ������������������ ������� ���������� � ������������ \n��������" +
                " ���� ������ short � ������������� ������������ ��������� \nshort. ����� � ������������������ " +
                "������ ���� ������ 15001:");
        for (short i = -32768; i <= 0; i += 15001) {
            System.out.println(i);
        }
//        for (short j = 0; j <= 32767; j+=15001) {
//            System.out.println(j);
//        }// ����� #8 ??????????????????

        printTCNumber(); // ������ #9
        System.out.println("����������� ������������������ ����� � ���������� �� -10 �� 34 ������������. " +
                "\n�����, ������� 11, ������ ���� ����������� ����� ������. �����, ������� 12, \n������ ���� " +
                "����������� ������� ������. � ���� ���������� ����������� ������ ZERO.");
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
        } // ����� #9 ??????????????????????

        printTCNumber(); // ������ #10
        System.out.println("�������� �����, ������� ��������� �� ���� ��������� start, end, step, � �������� " +
                "\n������������������ ����������  �����, ������� � ����� start, � ����� step. " +
                "����� ������ \n�� ����� - ����� end:");
        returnCicleOfStartEndStep(1, 11, 1);
        // ����� #10

        printTCNumber(); // ������ #11
        System.out.println("�������� �����, ������� ��������� �� ���� ��������� n � m ���� char, � ������� �� ������" +
                " \n������������������ ���� ����������� �������� � ���������� ����� ���������� n � m ������������:");
        returnChar('n', 'm');
        // ����� #11 ?????????????????????

        // ___________PART2______________

        printTCNumber(); // ������ #12
        System.out.println("�������� �����, ������� ��������� �������� � �������� ������������������ ������ �����" +
                " �� ����. \n����� ������������������ = l:");
        returnMethodOfIntegerEnd(18);
        // ����� #12

        printTCNumber(); // ������ #13
        System.out.println("�������� �����, ������� ��������� ����� ����� n, � ������� ��� ������� ����� 2 �� 1 ��" +
                " \nn ������������:");
        returnMethodOfDegreeEnd(100);
        // ����� #13

        printTCNumber(); // ������ #14
        System.out.println("������� ������������������ 012345678900112233445566778899000�  �� ����� 9999 " +
                "������������:");
        for (int i = 0; i < 10; ) {
            // ����� #14
        }
    }
}
