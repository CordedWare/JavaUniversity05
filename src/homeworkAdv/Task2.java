package homeworkAdv;

public class Task2 {


    public static void main(String[] args) {

        {
            int a, b;
            a = 15;
            b = 20;

            boolean A = (a == b);
            System.out.println(A);

            boolean B = (a < b);
            System.out.println(B);

            boolean C = (a > b);
            System.out.println(C);
        }

        System.out.println();

        {
            int a, b;
            a = 8;
            b = 8;

            if ((a & 2) == 0 & (b & 2) == 0) {
                System.out.println("maybe a and b are even");
            } else {
                if ((a & 2) == 1 & (b & 2) == 1) System.out.println("some variable is odd");
            }
        }

        System.out.println();

        {
            int a;
            a = 8;

            if (a > 10) {
                System.out.println("���������� ������ 10.");
            } else {
                if (a < 100) {
                    System.out.println("���������� ������ 100.");
                } else {
                    if ((a / 2) > 20) {
                        System.out.println("��������� ������� �� 2 ������ 20.");
                    } else {
                        if (a >= 5 | a <= 40 ) {
                            System.out.println("�������� ���������� ����� 5 � 40 ������������.");
                        } else {
                            if (a < 5 | a > 40 ) {
                                System.out.println("�������� ���������� ����� 5 � 40 ������������."); }
                        }
                    }
                }
            }

            System.out.println();

            {
                int Result1 = (int) Math.pow(5, 0);
                int Result2 = (int) Math.pow(5, 1);
                int Result3 = (int) Math.pow(5, 2);
                int Result4 = (int) Math.pow(5, 3);
                int Result5 = (int) Math.pow(5, 4);
                int Result6 = (int) Math.pow(5, 5);

                System.out.println("��������� 5 � 0 �������: " + Result1);
                System.out.println("��������� 5 � 1 �������: " + Result2);
                System.out.println("��������� 5 � 2 �������: " + Result3);
                System.out.println("��������� 5 � 3 �������: " + Result4);
                System.out.println("��������� 5 � 4 �������: " + Result5);
                System.out.println("��������� 5 � 5 �������: " + Result6);
            }

            System.out.println();

            {
                System.out.println("������ ������� �������.");

                for (int i = 40; i <= 60; i++) {
                    if ((i%4)==0)
                        System.out.println("  ����� ������� 4 ����� ������� 40 � 60 ������������: " + i);
                }

                System.out.println();

                System.out.println("������ ������� �������.");

                int[] numbers = {40,44,48,52,56,60};
                for ( int item: numbers ){
                    System.out.println("  ����� ������� 4 ����� ������� 40 � 60 ������������: " + item);
                }
            }
        }
    }
}
