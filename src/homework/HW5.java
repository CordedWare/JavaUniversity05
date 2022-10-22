package homework;

public class HW5 {
    static int tcNumber = 1; // ��� ��������� ������
    public static void printTCNumber() {
        System.out.print("TC_" + tcNumber++ + "  --  ");
    } // ����� ���������
    public static void printTestResult(String value) {
        System.out.println(value);
    } // ����� ������ ������
    public static String verifyEquals(int exceptedResult, int actualResult) {
        if (exceptedResult == actualResult) {
            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {
            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    } // ����� int ��������� ����������
                                                                                  // � ������������ ����������

    public static String verifyEquals(double exceptedResult, double actualResult) {
        if (exceptedResult == actualResult) {
            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {
            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    } // ����� double ���������
                                                                            // ���������� � ������������ ����������
    public static String verifyEquals(String exceptedResult, String actualResult) {
        if (exceptedResult == actualResult) {
            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {
            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    } // ����� String ���������
                                                                            // ���������� � ������������ ����������

    public static int findMaxOutOfTwo1 (int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    } // ����� ���� �� 2 �����

    public static int findMaxOutOfFour (int a, int b, int c, int d) {
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
    } // ����� ���� �� 4 �����
    public static String dayWeekly (int number, String day) {
        if (number == 1) {

            return day = "�����������";

        } else if (number == 2) {

            return day = "�������";

        } else if (number == 3) {

            return day = "�����";

        } else if (number == 4) {

            return day = "�������";

        } else if (number == 5) {

            return day = "�������";

        } else if (number == 6) {

            return day = "�������";

        } else if (number == 7) {

            return day = "�����������";

        }
        return "Error";
    } // TC_1
    public static int algoAverage (int age1, int age2, int age3) {
        if ((age1 >= 0 && age1 <= 150) && (age2 >= 0 && age2 <= 150) && (age3 >= 0 && age3 <= 150)) {
            int average = ((age1 + age2 + age3) / 3);

            return average;

        }

        return Integer.MIN_VALUE;
    } // TC_2

    // public static int minOfValue1 (int k, int l) {
    //     if (k <= l) {
    //         return k;
    //     } else {
    //         return l;
    //     }
    // } // TC_2

    public static int minOfValue1 (int k, int l) {
        return Math.min(k,l);
    } // TC_3

    public static int minOfValue2 (int k, int l, int m) {
        return Math.min(k,Math.min(l,m));
    } // TC_3

    public static int minOfValue3 (int k, int l, int m, int n) {
        return Math.min(k,Math.min(l,Math.min(m,n)));
    } // TC_3

    //public static int minOfValue4(int a, int b, int c, int d) {
    //    int max1;
    //    int max2;
    //    if (a <= b) {
    //        max1 = a;
    //    } else {
    //        max1 = b;
    //    }
//
    //    if (c <= d) {
    //        max2 = a;
    //    } else {
    //        max2 = b;
    //    }
//
    //    if (max1 <= max2) {
    //        return max1;
    //    } else {
    //        return max2;
    //    }
    //}

    public static double temperatureOfCat2 (double t1, double t2, double t3, double t4, double t5) {
        double averageTemp = ((t1 + t2 + t3 + t4 + t5) / 5);

        if (t1 >= 28 && t1 <= 41 && t2 >= 28 && t2 <= 41 && t3 >= 28 && t3 <= 41
                && t4 >= 28 && t4 <= 41 && t5 >= 28 && t5 <= 41) {

            return averageTemp;

        } else {

            return -1;
        }
    } // TC_4

    public static int calculationSalary (int hour, double price) {
        if(price >= 12 && hour > 0 && hour <= 24) {
            int salary = (int) (hour * price * 21);
            return salary;
        }

        return -1;
    } // TC_5

    public static int calculationLoot (double price, int amount) {
        if(price > 0 && amount > 0) {
            double totalPrice = price * amount;

            return (int) totalPrice;
        }

        return -1;
    } // TC_6

    public static String returnEmployeeSalaryOne (String name, double salary) {
        int oneMethodPartOfNumber = (int) Math.floor(salary);
        int twoMethodPartOfNumber = (int) Math.ceil(salary * 100) - oneMethodPartOfNumber * 100;

        if (name == null || name.equals("") || name.equals(" ") || salary <= 0) {
            return "";
        } else {
            return "" + name + "\t" + oneMethodPartOfNumber + " ��� " + twoMethodPartOfNumber + " ���";
        }
    } // TC_7

    public static String returnEmployeeSalaryTwo (String name1, double salary1, String name2, double salary2) {
        int oneMethodPartOfNumber1 = (int) Math.floor(salary1);
        int twoMethodPartOfNumber1 = (int) Math.ceil(salary1 * 100) - oneMethodPartOfNumber1 * 100;
        int oneMethodPartOfNumber2 = (int) Math.floor(salary2);
        int twoMethodPartOfNumber2 = (int) Math.ceil(salary2 * 100) - oneMethodPartOfNumber2 * 100;

        if (name1 == null || name1.equals("") || name1.equals(" ") || salary1 <= 0 && name2 == null ||
                name2.equals("") || name2.equals(" ") || salary2 <= 0) {
            return "";
        } else {
            return "" + name1 + "\t" + oneMethodPartOfNumber1 + " ��� " + twoMethodPartOfNumber1 + " ���" + "\n"
                    + "" + name2 + "\t" + oneMethodPartOfNumber2 + " ��� " + twoMethodPartOfNumber2 + " ���";
        }
    } // TC_8

    public static String returnX (int x) {
        if (x < 0) {
            return "x is negative number";
        } else if (x > 0) {
            return "x is positive";
        } else {
            return "x is zero";
        }
    } // TC_9

    public static void main(String[] args) {
        // Auto Tests




        // TC_1
        // �������� �����, ������� ��������� �� ���� ����� �� 1 �� 7  � ���������� ���� ������. � ������ ����������
        //                                                                        �������� ����� ���������� �Error�.
        // �������������� �����

        // AAA - triple "A" ������� �������� ������������������� ���� �����

        // A = arrange (�������� ��� ������, ������� ��� ��������)
        int number = 7;
        String day = "�����������";
        String expectedResult1 = "�����������";

        // Act - ���������� �����-�� �������� (�-�, ������� �����) ��� ��������� actual result
        String actualResult1 = dayWeekly(number,day);

        // A = assert - ��������� expectedResult � actualResult � ����� � ���, ������ ���� ��� ����
        verifyEquals(expectedResult1,actualResult1);

        // Report TC_1
        printTCNumber();
        printTestResult(verifyEquals(expectedResult1,actualResult1));





        // TC_2
        // �������� �������� ���������� �������� �������� (int) � ����� �� 3� �������.
        // ��������,
        // int age1 = 20,
        // int age2 = 40,
        // int age3 = 60
        // Average = 40.

        // ���
        // age1 = -5;
        // age2 = -30;
        // age3 = -3;
        // ������ �������  Integer.MIN_VALUE;

        // ������������� �������� �� ���������� � ���������� ��������.

        // AAA - triple "A" ������� �������� ������������������� ���� �����

        // A = arrange (�������� ��� ������, ������� ��� ��������)
        int age1 = -40;
        int age2 = -20;
        int age3 = -60;
        //int exceptedResult2 = 40;
        int expetedResult2 = Integer.MIN_VALUE;

        // A = act - ���������� �����-�� �������� (�-�, ������� �����) ��� ��������� actual result
        int actualResult2 = algoAverage(age1,age2,age3);

        // A = assert - ��������� expectedResult � actualResult � ����� � ���, ������ ���� ��� ����
        verifyEquals(expetedResult2,actualResult2);

        // Report TC_2
        printTCNumber();
        printTestResult(verifyEquals(expetedResult2,actualResult2));





        // TC_3
        // ����� ����������� ��������, ��������� ���������� (�� ������ ������ �� ������ �������)
        // a) k � l
        // b) k, l, m
        // c) k, l, m, n
        // ���������� ������ ���� ���� int

        // Happy path test data:
        // if k = 3, l = 30, m = 300, n = 3000
        // expected results:
        // a) 3
        // b) 3
        // c) 3

        // �������� ����� �� ������ �����.

        // AAA - triple "A" ������� �������� ������������������� ���� �����

        // A = arrange (�������� ��� ������, ������� ��� ��������)
        int k = 3;
        int l = 30;
        int m = 300;
        int n = 3000;
        int expectedResult3 = 3;

        // A = act - ���������� �����-�� �������� (�-�, ������� �����) ��� ��������� actual result
        int actualResult3 = minOfValue3(k,l,m,n);

        // A = assert - ��������� expectedResult � actualResult � ����� � ���, ������ ���� ��� ����
        verifyEquals(expectedResult3,actualResult3);

        // Report TC_3
        printTCNumber();
        printTestResult(verifyEquals(expectedResult3,actualResult3));





        // TC_4
        // �������� �������� ���������� �������� �������� �� 5 ����������� ����������� ���� ����. ����� ���������
        //                                                                      � ���������� �������� ���� double.
        // ��������:
        // t1 = 39
        // t2 = 39
        // t3 = 39
        // t4 = 39
        // t5 = 39
        // TempAverage = 39

        // �� ��������, ��� ����������� ���� ������ ���� ����� ������������ �������. ��������, ������� �� ������ � ���
        //                                                                                 ������� ������� �����������
        // � ������ ������. � ������ ����������� �������� ���� �� ����� �� �������� ����������, ����� ���������� -1.

        // �������� ������������ �������
        // https://vetna.info/bolezni/koshki/ponizhennaya-temperatura-u-kota/
        // https://junglevet.ru/stati/povyshenie-temperatury-tela-u-koshki/

        // ��� ��� ��� ��� ��� ������������ �� 28� �� 41�.
        // �� ���������� �������, ��������� ���� ����� ���� ��� ��� ���� ��� ������������ �� 25� �� 45 �

        // ������������� ����� �� ���������� � ���������� ��������.

        // AAA - triple "A" ������� �������� ������������������� ���� �����

        // A = arrange (�������� ��� ������, ������� ��� ��������)
        double t1 = 19;
        double t2 = 39;
        double t3 = 39;
        double t4 = 39;
        double t5 = 39;
        double exceptedResult4 = -1;

        // A = act - ���������� �����-�� �������� (�-�, ������� �����) ��� ��������� actual result
        double actualResult4 = temperatureOfCat2(t1,t2,t3,t4,t5);


        // A = assert - ��������� expectedResult � actualResult � ����� � ���, ������ ���� ��� ����
        verifyEquals(exceptedResult4,actualResult4);

        // Report TC_4
        printTCNumber();
        printTestResult(verifyEquals(exceptedResult4,actualResult4));





        // TC_5
        // �������� �����, ������� ��������� �� ���� ���������� ����� (int) ������ � ����, ��������� ������ ����
        //                                                                              ������ � ���������� �����,
        // � ���������� ���������� ����� � ����� � ����� ��������.
        // ��� ���������� ��������� ����� ���������� -1.

        // ���������:
        // ��������� ������ ���� ��� ������ ����������� ����� ���� ������. ������ � �������� ����������� ��
        //                                                                  �� ����������.�� ���� ����������
        // �� �������� ��������� � �� ����������� �������� ����� �� ����� ��������. �������� ����������� ��������������
        //                                                                              �������� ���������������� �����.

        // ������ = RedRover.school
        // ���� = Java for beginers

        // �� ���������������� ������ ����� ����������� ������ �������� ���� - 12.

        // � ����������� ��� ����������� � ������� ����������� ������� ������ (������������������, ��������, �������
        //                                                                                              ������� �����),
        // �� ���������� ����� �������� ������� ����� � ���� ��� ����� ��������. �������� ������������ �� ������� ������

        // �� ���������� �����������:
        // ����� �������, ��� � ����� ����������� ��� ���� �������� ���������� �������������� ����� �������� �������
        // https://clubtk.ru/srednee-kolichestvo-rabochikh-dney-v-mesyatse

        // �� �������������� ����� �� ��������, ��� ������ �������� ������ 8 ����� � ����.

        // ������������� ����� �� ���������� � ���������� ��������.

        // AAA - triple "A" ������� �������� ������������������� ���� �����

        // A = arrange (�������� ��� ������, ������� ��� ��������)
        int hour = 25;
        double price = 15;
        int exceptedResult5 = -1;

        // A = act - ���������� �����-�� �������� (�-�, ������� �����) ��� ��������� actual result
        int actualResult5 = calculationSalary(hour,price);

        // A = assert - ��������� expectedResult � actualResult � ����� � ���, ������ ���� ��� ����
        verifyEquals(exceptedResult5,actualResult5);

        // Report TC_5
        printTCNumber();
        printTestResult(verifyEquals(exceptedResult5,actualResult5));





        // TC_6
        // �������� �����, ������� ��������� �� ���� 2 ��������� - ���� � ���������� ������ (���������� � ������).
        // �������� ���������� ����� ������� � ���� ����������� �����.

        // ��������:
        // price for 1 = 25 ��� 50 ��� (25.5)
        // amount = 5
        // expected total = 127 ��� 50 ��� (127.5)

        // ��� ���������� ��������� ����� ���������� -1

        // ��������� ����� �� ���������� � ���������� ��������.

        // AAA - triple "A" ������� �������� ������������������� ���� �����

        // A = arrange (�������� ��� �������� ������, ������� ��� ��������)
        double price1 = 2;
        int amount = 2;
        int exceptedResult6 = 4;

        // A = act - ���������� �����-�� �������� (�-�, ������� �����) ��� ��������� actual result
        int actualResult6 = calculationLoot(price1, amount);

        // A = assert - ��������� expectedResult � actualResult � ����� � ���, ������ ���� ��� ����
        verifyEquals(exceptedResult6,actualResult6);

        // Report TC_6
        printTCNumber();
        printTestResult(verifyEquals(exceptedResult6,actualResult6));





        // TC_7
        // �������� �����, ������� ��������� �� ���� ����������� ��������� � ���������� ������ ��������� ������
        //                                                                                  �������� �����������.
        // ��������:

        // ��������� ����� ��������   70000 ��� 00 ���

        // ���� ��� ���������� ������ � ���� ������ ������ ��� � ���� null (String -  ��� ����������� ��� ������
        //                                                                      � ����� ��������� �������� null),
        // �� � ��������� ������ ���� ����������� ������ ������ "".
        // ���� �� �� ���� ������ ���������� ������ �� ��������, ��� �������� ����� ����������, ��� 0, �� � ���������
        //                                                                  ���� ������ ���� ����������� ������ ������""

        // AAA - triple "A" ������� �������� ������������������� ���� �����

        // A = arrange (�������� ��� ������, ������� ��� ��������)
        String name = "�������� ����� ��������";
        double salary1 = 70000.00;
        String expectedResult7 = "�������� ����� ��������\t70000 ��� 0 ���";

        // A = act - ���������� �����-�� �������� (�-�, ������� �����) ��� ��������� actual result
        String actualResult7 = returnEmployeeSalaryOne(name, salary1);

        // A = assert - ��������� expectedResult � actualResult � ����� � ���, ������ ���� ��� ����
        verifyEquals(expectedResult7,actualResult7);

        // Report TC_7
        printTCNumber();
        printTestResult(verifyEquals(expectedResult7,actualResult7));





        // TC_8
        // ������� �����, ������� �������� ��������� ��� ���������� �����������, ��������� ����� �� ������ 8, ��������:

        // �������� ����� �������� 		70000 ��� 00 ���
        // �������� ���� �������� 		128059 ��� 00 ���

        // ����� � ������� 9 ����� ��������� ������ ���������,� ����������� �� ����, ��� ��� ����� ��� ������ ���������.
        // ����� ����� ������ - ����������� ��������� ����� ��������� ������������. ������ �� ����� ������ �������������
        //                                                                    � ������� ������, ����������� � ������� 8.

        // AAA - triple "A" ������� �������� ������������������� ���� �����

        // A = arrange (�������� ��� ������, ������� ��� ��������)
        String name2 = "�������� ����� ��������";
        double salary2 = 70000.00;
        String name3 = "������ ����� ��������";
        double salary3 = 80000.00;
        String expectedResult8 = "�������� ����� ��������\t70000 ��� 0 ���\n������ ����� ��������\t80000 ��� 0 ���";

        // A = act - ���������� �����-�� �������� (�-�, ������� �����) ��� ��������� actual result
        String actualResult8 = returnEmployeeSalaryTwo(name2, salary2, name3, salary3);

        // A = assert - ��������� expectedResult � actualResult � ����� � ���, ������ ���� ��� ����
        verifyEquals(expectedResult8,actualResult8);

        // Report TC_7
        printTCNumber();
        printTestResult(verifyEquals(expectedResult8,actualResult8));




        // TC_9
        // �������� � ���� ������ � ��������������:
        //���� int x (��. �������)

        // AAA - triple "A" ������� �������� ������������������� ���� �����
        int x = 0;
        String exceptedResult9 = "x is zero";

        // A = act - ���������� �����-�� �������� (�-�, ������� �����) ��� ��������� actual result
        String actualResult9 = returnX(x);

        // A = assert - ��������� expectedResult � actualResult � ����� � ���, ������ ���� ��� ����
        verifyEquals(exceptedResult9,actualResult9);

        // Report TC_9
        printTCNumber();printTestResult(verifyEquals(exceptedResult9,actualResult9));
        System.out.println(returnX(x));

    }
}
