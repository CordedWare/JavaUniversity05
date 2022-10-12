package homework;

public class HW4_P2_P3 {
    public static final String pass = ("\033[1;32m" + " Pass" + "\u001B[0m");
    public static final String fail = ("\033[1;31m" + " Fail" + "\u001B[0m");

    public static void method12(int tempIn) {
        System.out.println("�����������:\n � �������� - " + ((tempIn * 9/5) + 32) + "\n � ����������� - " + tempIn);
    } // ����� ��� 12 ������
    public static void method14(int numberK, int numberL, int numberM) {
        System.out.println("��������� ������� " + numberK + " �� " + numberL + " = " + (numberK / numberL)
                + ", � ������� �� ������� = " + (numberK % numberL));
        System.out.println("��������� ������� " + numberK + " �� " + numberM + " = " + (numberK / numberM)
                + ", � ������� �� ������� = " + (numberK % numberM));
        System.out.println("��������� ������� " + numberL + " �� " + numberM + " = " + (numberL / numberM)
                + ", � ������� �� ������� = " + (numberL % numberM));
        System.out.println("��������� ������� " + numberM + " �� " + numberK + " = " + (numberM / numberK)
                + ", � ������� �� ������� = " + (numberM % numberK));
    } // ����� ��� 14 ������

    public static void method16(double distance1, double time1, double distance2, double time2,
                                double distance3, double time3) {
        //double distance1 = 12;
        //double time1 = 20;
        //double distance2 = 150;
        //double time2 = 150;
        //double distance3 = 300;
        //double time3 = 60;
        double average1 = distance1 / time1;
        double average2 = distance2 / time2;
        double average3 = distance3 / time3;
        System.out.println("������� �������� 1-�� ���������� = " + average1);
        System.out.println("������� �������� 2-�� ���������� = " + average2);
        System.out.println("������� �������� 3-�� ���������� = " + average3);
    } // ����� ��� 16 ������
    public static void headerTask(int hdInt) {
        System.out.println("-------------------------------------------------------------------------------");
        //System.out.println("\u001B[43m\u001B[43m Task # " + hdInt + " \u001B[0m");
        //System.out.println("\u001B[43m\u001B[47m Task # " + hdInt + " \u001B[0m");
        System.out.println("\u001B[46m Task # " + hdInt + " \u001B[0m");
        System.out.println("-------------------------------------------------------------------------------");
    } // ����� ��� ��������� �����

    public static void main(String[] args) {

        headerTask(12);
        {
            {   // ������:
                // �������� �����, ������� ������ �� ���� ����������� � ��������, � ����������� ��������� �����������
                // � �������� � � �����������.
            }
            // �������:
            method12(25);
        }

        headerTask(13);
        {
            {   // ������:
                // �������� �������� ���������, ������� ��������� 2 �����.
                // ��������� ���������� �����, ������� ������� �� 3 ��� �������, � �������� �����, ������� ������� �� 5
                // ��� �������.
                // ��������� ������� �� ������ ��������� ����������.
                // ��������� �������� �����, ������� ������� �� 2 ��� �������, �� ���� ���� �� ���� ����� �������������,
                // ��������� �������� ��������� �������� �� (-1).
                // ��������� ������� �� ������ ��������� ����������.
                // ���� ����� �� ������ �� ���� ��������, ��������� ������� �� ������ ������ � ������������� ����������
                // ��������.
            }
            // �������:
            int numbA = 20;
            int numbB = 20;

            boolean expRes13_1 = false;
            boolean expRes13_2 = false;
            boolean expRes13_3 = false;
            boolean expRes13_4 = false;
            boolean expRes13_5 = false;
            boolean actRes13 = false;

            if (numbA % 3 == 0 && numbB % 3 == 0) {
                int sumAB = numbA + numbB;
                System.out.println("��������� ���������� �����, ������� ������� �� 3 ��� �������");
                actRes13 = expRes13_1 = true;
            } else if (numbA % 5 == 0 && numbB % 5 == 0) {
                int subAB = numbA - numbB;
                System.out.println("��������� �������� �����, ������� ������� �� 5 ��� �������");
                actRes13 = expRes13_2 = true;
            } else if (numbA % 2 == 0 && numbB % 2 == 0) {
                int umnAB = numbA * numbB;
                System.out.println("��������� �������� �����, ������� ������� �� 2 ��� �������");
                actRes13 = expRes13_3 = true;
            } else if (numbA < 0 || numbB < 0) {
                int umnAB = (numbA * numbB) * (-1);
                System.out.println("E��� ���� �� ���� ����� �������������, ��������� �������� ����������� (-1)");
                actRes13 = expRes13_4 = true;
            } else {
                System.out.println("������������� ���������� ��������");
                actRes13 = expRes13_5 = true;
            }
            // �������� ������, ��� ������������ 2 ����������
            boolean expectedResult13 = expRes13_2; // ��������� ��������� (������ ����, ����� ������� ��������)
            boolean actualResult13 = actRes13 = true; // ����������� ���������

            if (actualResult13 == expectedResult13) {
                System.out.println(pass);
            } else {
                System.out.println(fail);
            }
        }

        headerTask(14);
        {
            {   // ������:
                // ����������� ��������� ���������, ��������� ����� � ��������� k, l, m:
                // ��������� ������� k �� l = �, � ������� �� �������  = �
                // ��������� ������� k �� m = �, � ������� �� �������  = �
                // ��������� ������� l �� m = �, � ������� �� �������  = �
                // ��������� ������� m �� k = �, � ������� �� �������  = �
            }
            // �������:
            method14(9,2,4);
        }

        headerTask(15);
        {
            {   // ������:
                // � ������ ��������� ������ � �������. ��������, ��� � ��� 35 ����� � 94 ����. ������� ����� ������� �
                // ����� ��������.
                // ��������� ������ ������ ��������� ������
            }
            // �������:
            int rabbits = 0; // ����������� ����� ������
            int pheasant; // ����������� ����� �������

            int heads = 35; // ��������� ����� ����� �����
            int legs = 94; // ��������� ����� ����� �����������

            if (heads * 2 > 0) {
                System.out.println("35 * 2 = " + heads * 2);
            }
            if (heads * 2 == 70 && legs - 70 > 0) {
                System.out.println("94 - 70 = " + (legs - 70));
            }
            if (legs - 70 >= 24) {
                System.out.println((rabbits = (24 / 2)) + " - �������� � ������.");
            }
            if (heads - 12 > 0) {
                System.out.println((pheasant = (heads - 12)) + " - ������� � ������ \n� ������ " + pheasant
                        + " ������ � " + rabbits + " ��������.");
            }
        }

        headerTask(16);
        {
            {   // ������:
                // �������� �����, ������� ������������ ������� �������� �������� (speedAverage) ������������� ��������
                // ��� ������ �������� � ������� ����������� distance � time.
                // �������������� �����.

                // �������� ������:
                // distance		time
                // 12			20 min
                // 150	    	2,5 hours
                // 300		    1? hours
            }
            // �������:
            method16(12,20,150,150,300,60);
        }

        headerTask(17);
        {
            {   // ������:
                // ��������� ������� 7 � 8 �� HW2 � ������� ������ � ����������:

                // �������� ����� ���, ����� ���������� ��������� ���� (�-�, �����, ������ ��� ������;
                // ������� - ��������) ���������� ������������� � ����������� �� �������� ����������.
                // ����������� ��������� � �����������:
                // apple = 42, 55, 1
                // student = 42, 5, 2
            }

            // �������:

        }

        headerTask(18);
        {
            {   // ������:
                // ����������� ������� �� HW3,  ������� 11 � ������� ������� � ���������� (�������� f, ff, d, dd �����
                // ���� ������). �������� �������� �� ��, ��� ����� ����� ������� � ��� ����� ����� ��, ��� ������
                // ����� �������.
            }
            // �������:

        }

        headerTask(19);
        {
            {   // ������:
                // �������� �������� ���������, ������� ��������� ����� ���� short �� ���������� ��������, � ��������
                // ��������� ��������.
                // ( ��������, �It�s a two-digit number.�, �It�s a five-digit number.�, etc)
                // �������� ��������� �������� �� ������.
            }
            // �������:(1/10=10%) 10, 10, 28, 37 // (1/25=4%) 18, 58, 31, 8 // (1/67=1.5%) 70, 13, 8, 300


        }

        headerTask(20);
        {
            {   // ������:
                // �� ����� https://openweathermap.org/ ������������������ � �������� ���� (key). ����� � ������������
                // ������ ������� � ����������� ��������� ������� (� �� � ��������������� ������������). ������������ �
                // ��������� ������ �� ������ (manually). � ���������� ������ ����� �������������� ���������� ���
                // ��������� �������:
                // London
                // Paris
                // Rome
                // (�� ��������� ������� HW3 - ��� ���� ��������, ��� ���������� ������)
            }
            // �������: �������� ������, �������

        }
    }
}
