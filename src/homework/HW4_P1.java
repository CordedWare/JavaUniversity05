package homework;

public class HW4_P1 {
    public static final String pass = ("\033[1;32m" + " Pass" + "\u001B[0m");
    public static final String fail = ("\033[1;31m" + " Fail" + "\u001B[0m");

    public static void headerTask(int hdInt) {
        System.out.println("-------------------------------------------------------------------------------");
        //System.out.println("\u001B[43m\u001B[43m Task # " + hdInt + " \u001B[0m");
        System.out.println("\u001B[43m\u001B[47m Task # " + hdInt + " \u001B[0m");
        //System.out.println("\u001B[46m Task # " + hdInt + " \u001B[0m");
        System.out.println("-------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        headerTask(3);
        {
            {   // ������:
                // �������� � ���� ���� ��������� ���������� ���������:
                // 1) (2 = 2) � (7 = 7);
                // 2) ��(15 < 3);
                // 3) ("�����" = "���") ��� ("�����" = "���");
                // 4) ��("�����" = "���");
                // 5) (��(15 < 3)) � (10 > 20);
                // 6) ("����� ����, ����� ������") � ("��� ������� ������ ��������� ������ ����");
                // 7) (6/2 = 3) ��� (7*5 = 20)
            }
            // �������:
            String sosna = new String();
            String dub = new String();
            String vyshnya = new String();
            String klen = new String();

            sosna = "wood";
            dub = "wood";
            vyshnya = "deadwood";
            klen = "wood";

            Boolean glaza = true;
            Boolean chtoByVidet = true;
            Boolean chtoByNeVidet = false;

            int etazh3 = 3;
            int etazh2 = 2;

            if (2 == 2 && 7 == 7) {
                System.out.println("1) (2 = 2) � (7 = 7)" + pass);
            } else {
                System.out.println("1) (2 = 2) � (7 = 7)" + fail);
            }

            if ((15 < 3) == !(true)) {
                System.out.println("2) �� (15 < 3)" + pass);
            } else {
                System.out.println("2) �� (15 < 3)" + fail);
            }

            if (sosna.equals(dub) || (vyshnya.equals(klen))) {
                System.out.println("3) (����� = ���) ��� (����� = ���)" + pass);
            } else {
                System.out.println("3) (����� = ���) ��� (����� = ���)" + fail);
            }

            if (sosna.equals(dub) == !(true)) {
                System.out.println("4) ��(����� = ���)" + pass);
            } else {
                System.out.println("4) ��(����� = ���)" + fail);
            }

            if ((15 < 3) == !(true) && (10 > 20)) {
                System.out.println("5) (��(15 < 3)) � (10 > 20)" + pass);
            } else {
                System.out.println("5) (��(15 < 3)) � (10 > 20)" + fail);
            }

            if (glaza == chtoByVidet && etazh3 > etazh2) {
                System.out.println("6) (����� ����, ����� ������) � (��� ������� ������ ��������� ������ ����)" + pass);
            } else {
                System.out.println("6) (����� ����, ����� ������) � (��� ������� ������ ��������� ������ ����)"
                        + fail);
            }

            if (6 / 2 == 3 || 7 * 5 == 20) {
                System.out.println("7) (6/2 = 3) ��� (7*5 = 20)" + pass);
            } else {
                System.out.println("7) (6/2 = 3) ��� (7*5 = 20)" + fail);
            }
        }

        headerTask(4);
        {
            {   // ������:
                // �������� � ���� ���� ��������� ���������:
                // �) ����� ������ ������ � ������
                // �) �� ����� ����� ��������, � �� ����� ����� �����������.
                // �) ������� ����� ����� � �������. ��������� - ��������.
            }
            // �������:
            // a)
            int nameS = 18;
            int nameA = 25;
            int nameN = 28;

            if (nameS < nameA && nameS < nameN) {
                System.out.println("�) ����� ������ ������ � ������" + pass);
            } else {
                System.out.println("�) ����� ������ ������ � ������" + fail);
            }

            // �)
            boolean polka = true;
            boolean bookStand = true;
            boolean bookNotStand = false;
            boolean stol = true;
            boolean spravochnikStand = true;
            boolean spravochnikNotStand = false;

            if ((polka && bookStand == true) && (stol && spravochnikStand == true)) {
                System.out.println("�) �� ����� ����� ��������, � �� ����� ����� �����������" + pass);
            } else {
                System.out.println("�) �� ����� ����� ��������, � �� ����� ����� �����������" + fail);
            }

            // �)
            int girls = 7;
            int boys = 1;

            if (girls > boys) {
                System.out.println("�) ������� ����� ����� � �������. ��������� - ��������" + pass);
            } else {
                System.out.println("�) ������� ����� ����� � �������. ��������� - ��������" + fail);
            }
        }

        headerTask(5);
        {
            {   // ������:
                // ������������ ����� ����� ��������, ������ ����� ���������� 16 ���.
            }
            // �������:
            boolean lawOn = true;
            boolean lawOff = false;
            int age = 16;
            if (age >= 16 && lawOn == true) {
                System.out.println("������������ ����� ����� ��������, �.�. ����������� 16 ���" + pass);
            } else {
                System.out.println("������������ ����� ����� ��������, �.�. ����������� 16 ���" + fail);
            }
        }

        headerTask(6);
        {
            {   // ������:
                // ���� �� ���� � ��������, �� ��� ���� ������ ����� ��� �� ������� � ����
            }
            // �������:
            boolean nameP = true;
            boolean busGo = false;
            boolean bookRead = true;
            boolean windowLook = true;

            if (((nameP != busGo) && (nameP == bookRead)) || (nameP != windowLook)) {
                System.out.println("���� �� ���� � ��������, �� ��� ���� ������ ����� ��� �� ������� � ����" + pass);
            } else {
                System.out.println("���� �� ���� � ��������, �� ��� ���� ������ ����� ��� �� ������� � ����"
                        + fail);
            }
        }

        headerTask(7);
        {
            {   // ������:
                // ���� � ������ ��, ��� ������, � ����� �������� - �����
            }
            // �������:
            boolean whithFriend = true;
            boolean withoutFriend = !false;
            boolean goodElse = true;
            boolean badElse = withoutFriend;

            if (goodElse == whithFriend) {
                System.out.println("�� � ������, ��� ������" + pass);
            } else if (badElse == withoutFriend) {
                System.out.println("�� ��� �����, ��� �����" + fail);
            }
        }

        headerTask(8);
        {
            {   // ������:
                // ��������� ����� x, ������� ����� ��������� �������� 10, 12, -3, 5 � 0.
                // ���� x ������ 10, �� ������� �� ������ �x ������ 10�.
                // ���� x ������ ����, �� ������� �� ������ �x - ������������� �����
                // ���� x = 5, �� ������� �� ������ ��������� x � 5 ����� 0�
                // ����� ������� �� ������ ������ x ������ 11, ������ ��� ����� 0, �� �� ����� 5�.
                // ���������, ������������� �� ��������� ����������� ���� ���������� ������������.
            }

            // �������:
            int x = 5; // ������� ������

            boolean expRes1 = false; // �������� ��� ����������� expectedResult �� ��������� � false
            boolean expRes2 = false;
            boolean expRes3 = false;
            boolean expRes4 = false;
            boolean actRes = false;  // �������� ��� ����������� actualResult �� ��������� � false

            if (x > 10) {
                System.out.println("x ������ 10 ");
                actRes = expRes1 = true; // actRes = expRes1 ����������� ���� true, ���� ������� �����������
            } else if (x < 0) {
                System.out.println("x - ������������� �����");
                actRes = expRes2 = true;
            } else if (x == 5) {
                System.out.println("�������� x � 5 ����� 0");
                actRes = expRes3 = true;
            } else {
                System.out.println("����� x ������ 11, ������ ��� ����� 0, �� �� ����� 5");
                actRes = expRes4 = true;
                ;
            }

            // �������� ������, ��� ������������ 2 ����������
            boolean expectedResult = expRes3; // ��������� ��������� (������ ����, ����� ������� ��������)
            boolean actualResult = actRes = true; // ����������� ���������

            if (actualResult == expectedResult) {
                System.out.println(pass);
            } else {
                System.out.println(fail);
            }
        }

        headerTask(9);
        {
            {   // ������:
                // ��������� ����� �� ��������.���� ����� ������,������� ��� �����, ����� ��������� ����� � �������.
                // �������� ��������� ������ ��������� �� ������.������� � �����������,
                // ����� ���� ����� ������������� ��� ��������.
            }
            // �������:
            boolean expRes9_1 = false;
            boolean expRes9_2 = false;
            boolean actRes9_1 = false;

            int numb = 5;     // ������� ������ (�����)
            int numb1 = numb;
            int numb2 = 2;     // ��� ���������� � �������

            if (numb1 % 2 == 0) { // �������� �� ��������
                System.out.println("����� " + numb + " ������ � �������� = " + (numb1 *= 2)); // ������ �����
                // ���������� �� 2
                actRes9_1 = expRes9_1 = true;
            } else {
                System.out.println("����� �������� " + numb + " � ���������� � ������� = " + Math.pow(numb1, numb2));
                // �������� ����� ���������� � �������
                actRes9_1 = expRes9_2 = true;
            }

            // �������� ������, ��� ������������ 2 ����������
            boolean expectedResult9 = expRes9_2; // ��������� ��������� (������ ����, ����� ������� ��������)
            boolean actualResult9 = actRes9_1 = true; // ����������� ���������

            if (actualResult9 == expectedResult9) {
                System.out.println(pass);
            } else {
                System.out.println(fail);
            }
        }

        headerTask(10);
        {
            {   // ������:
                // �������� �������� �������� �������� �� ������������ �������� (if-else):
                // a) ���������� ����� � 18 ���
                // b) ������ ����� ������ � 16 ���
                // c) � ����� ����� ���� � 5 ���
                // �������� ��������� ������ ��������� �� ������.
            }
            // �������:

            int ageP = 2; // ������� ������ (�����)

            boolean expRes10_1 = false;
            boolean expRes10_2 = false;
            boolean expRes10_3 = false;
            boolean expRes10_4 = false;
            boolean actRes10_1 = false;

            if (ageP >= 18) {
                System.out.println("���������� ����� � 18 ���");
                actRes10_1 = expRes10_1 = true;
            }
            if (ageP >= 16) {
                System.out.println("������ ����� ������ � 16 ���");
                actRes10_1 = expRes10_2 = true;
            }
            if (ageP >= 5) {
                System.out.println("� ����� ����� ���� � 5 ���");
                actRes10_1 = expRes10_3 = true;
            } else {
                System.out.println("��� ������ ������ �� ������� ������!");
                actRes10_1 = expRes10_3 = true;
            }
            // �������� ������, ��� ������������ 2 ����������
            boolean expectedResult10 = expRes10_4 = expRes10_3 = expRes10_2 = expRes10_1; // ��������� ���������
            boolean actualResult10 = actRes10_1 = true; // ����������� ���������

            if (actualResult10 == expectedResult10) {
                System.out.println(pass);
            } else {
                System.out.println(fail);
            }

        }

        headerTask(11);
        {
            {   // ������:
                // �������� �������� ���������, ������� ��������� ������ ������� � ��������� ��������� ��������:
                // 5 - ������ ���������� ������� � ��������� � ��������� �����
                // 4 - ��������� � ��������� �����
                // 3 - ���� ������� �� ���� � ��������� � ��������� �����
                // 2 - ������� ��������� � �������� � ������� ������ �� ������ ���
                // �������� ��������� ������ ��������� �� ������.
            }
            // �������:
            int ageSc = 5; // ������� ������ (�����)

            boolean expRes11_1 = false;
            boolean expRes11_2 = false;
            boolean expRes11_3 = false;
            boolean expRes11_4 = false;
            boolean actRes11_1 = false;

            if (ageSc == 5) {
                System.out.println("5 - ������ ���������� ������� � ��������� � ��������� �����");
                actRes11_1 = expRes11_1 = true;
            } else if (ageSc == 4) {
                System.out.println("4 - ��������� � ��������� �����");
                actRes11_1 = expRes11_2 = true;
            } else if (ageSc == 3) {
                System.out.println("3 - ���� ������� �� ���� � ��������� � ��������� �����");
                actRes11_1 = expRes11_3 = true;
            } else if (ageSc == 2) {
                System.out.println("2 - ������� ��������� � �������� � ������� ������ �� ������ ���");
                actRes11_1 = expRes11_4 = true;
            }
            // �������� ������, ��� ������������ 2 ����������
            boolean expectedResult11 = expRes11_1; // ��������� ���������
            boolean actualResult11 = actRes11_1 = true; // ����������� ���������

            if (actualResult11 == expectedResult11) {
                System.out.println(pass);
            } else {
                System.out.println(fail);
            }
        }
    }
}
