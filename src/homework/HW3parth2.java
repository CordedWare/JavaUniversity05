package homework;

import static java.lang.Double.*;

public class HW3parth2 {

    public static void main(String[] args) {

// 13
        System.out.println("Task: 13" + "\n");
        Double t1 = new Double(0);
        Double t2 = new Double(150);
        Double t3 = new Double(-120);
        Double t4 = new Double(-505.505);
        Double t5 = new Double(100100);
        Double t6 = new Double(100010001000d);
        Double t7 = new Double(2.66666666666666);
        Double t8 = new Double(-1000000.001);
        Double t9 = new Double(1010);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
        System.out.println(t8);
        System.out.println(t9 + "\n");
//13

//14 passed

//15
        System.out.println("Task: 15" + "\n");
        Integer num1 = 1;
        Integer num2 = 1;

        if (num1.equals(num2) == true) {
            System.out.println("���� num1 ����� num2, �� ��������� ��������� ������� .equals() = "
                    + num1.equals(num2) + "\n");
        } else {
            System.out.println("���� num1 �� ����� num2, �� ��������� ��������� ������� .equals() = "
                    + num1.equals(num2) + "\n");
        }
//15

//16
        System.out.println("Task: 16" + "\n");
        int number1 = 1;
        int number2 = 1;

        if (number1 == number2) System.out.println("a) ���������� ��������");
        number2 = 2;
        if (number1 < number2) System.out.println("b) number1 < number2");
        number1 = 3;
        if (number1 > number2) System.out.println("c) number1 > number2" + "\n");
//16

//17
        System.out.println("Task: 17" + "\n");

        Float aFloat = Float.valueOf(234.9999f);
        int bInt = aFloat.intValue();

        System.out.println("Float 234.9999f �������� � int = " + bInt + "\n");

//17

//18

        System.out.println("Task: 18" + "\n");

        double newDouble1 = 15.4;
        double newDouble2 = 18.6;

        Double newD1 = new Double(newDouble1);      // 1 ������� ������������
        Double newD2 = valueOf(newDouble2);  // 2 ������� ������������

        System.out.println(sum(newD1,newD2) + "\n");
//18

//19
        System.out.println("Task: 19" + "\n");

        Float newFloat1 = Float.valueOf(4.4f);
        Float newFloat2 = Float.valueOf(55.2f);;


        Integer newI1 = newFloat1.intValue();
        Integer newI2 = newFloat2.intValue();

        System.out.println(Integer.sum(newFloat1.intValue(),newFloat2.intValue()) + "\n");
//19

//20
        System.out.println("Task: 20" + "\n");

        Short short1 = 12000;
        Short short2 = 12300;

        String varA = "12000 - 12300 = ";
        String varB = "12500 - 12300 = ";

        //Short shortTest1 = 12000;
        //Short shortTest2 = Short.valueOf((short) 12000);
        //Short shortTest3 = Short.valueOf(String.valueOf(12000));

        System.out.println(varA + (Short.valueOf(short1) - Short.valueOf(short2)));

        short1 = 12500;

        System.out.println(varB + (Short.valueOf(short1) - Short.valueOf(short2)) + "\n");
//20

//21
        System.out.println("Task: 21" + "\n");

        String str1 = "123.56";
        String str2 = "123.55";

        Double doub1 = 123.56;
        Double doub2 = 123.55;

        double value1 = parseDouble(str1);
        double value2 = parseDouble(str2);

        System.out.println("Sub of doub1 - doub2 = " + (doub1 - doub2));
        System.out.println("ParseDouble sub of str1 - str2 = " + (parseDouble(str1)- parseDouble(str2)));
        System.out.println("Compare doub1 and doub2 = " + compare(doub1,doub2));
        System.out.println("Compare doub1 and doub2 = " + compare(value1,value2));
//21

//22
        System.out.println("Task: 22" + "\n");

        float catBodyTempMax = 39.5f; // C�
        float catBodyTempMin = 38.2f; // C�

        System.out.println("����������� ����������� ���� = " + Float.max(catBodyTempMax,catBodyTempMin) + " C�");
        System.out.println("����������� ����������� ���� = " + Float.min(catBodyTempMax,catBodyTempMin) + " C�");
        System.out.println("������� ����������� ���� = " + (catBodyTempMax+catBodyTempMin)/2 + " C�\n");
//22

//23
        System.out.println("Task: 23" + "\n");

        Number n;

        n = 999_999_999;
        System.out.println("���������� n ����� ��������� ��������: " +
                "n = " + n);

        n = 10;
        System.out.println("���������� n ����� ��������� ��������: " +
                "n = " + n);

        n = 10.999_999_999;
        System.out.println("���������� n ����� ��������� ��������: " +
                "n = " + n);

        System.out.println("��� ��������, ������ ��� ����������� ������ ��� ������ ��������. " +
                "�������� n = 999_999_999, n = 10, n = 10.999_999_999.\n");
//23

//24
        System.out.println("Task: 24" + "\n");

        Integer numberInteger = 100;
        Object numberIntegerToString = numberInteger.toString(numberInteger);

        System.out.println(numberInteger);
        System.out.println(numberInteger.toString(100)); // ������� � String
        System.out.println(numberInteger.toString(numberInteger));
        System.out.println(numberInteger.getClass()); //.getClass ��������� ������ ���� ��������
        System.out.println(numberIntegerToString.getClass()); //.getClass ��������� ������ ���� ��������
//24

//25
        System.out.println("\nTask: 25 \n");

        float kilogram = 1;
        float lb = 1;

        float meters = 1;
        float miles = 1;

        kilogram = 2.20462f; // ���������, ����� 1 kg ����� 2.20462 lb
        kilogram *= 50; // �������� �� 50 kg

        lb = 0.45359237f; // ���������, ����� 1 lb ����� 0.45359237 kg
        lb *= 50;  // �������� �� 50 lb

        meters = 0.00062f;
        meters *= 100;

        miles = 1609.34f;
        miles *= 100;

        System.out.println("50 kilogram = " + kilogram + " lbs, 50 lb = " + lb + " kg");
        System.out.println("100 meters = " + meters + " miles, 100 miles = " + miles + " meters");
//25
    }
}