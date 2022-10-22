package lessons;

public class Lesson6 {

    public static void printTestResult(String value) {
        System.out.println(value);
    } // ����� ������ ������

    public static String verifyEquals(double exceptedResult, double actualResult) {
        if (exceptedResult == actualResult) {
            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {
            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    } // ����� double ���������

    public static double returnABC (double a, double b, double c) {
        double abc = a * b - c;

        if (abc > 0) {
            return abc;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        // TC_1
        // AAA - triple "A" ������� �������� ������������������� ���� �����

        // A = arrange (�������� ��� ������, ������� ��� ��������)
        double a = 7;
        double b = 2;
        double c = 4;
        double exceptedResult = 10;

        // A = act - ���������� �����-�� �������� (�-�, ������� �����) ��� ��������� actual result
        double actualResult = returnABC(a,b,c);

        // A = assert - ��������� expectedResult � actualResult � ����� � ���, ������ ���� ��� ����
        verifyEquals(exceptedResult,actualResult);

        // Report TC_1
        printTestResult(verifyEquals(exceptedResult,actualResult));
        System.out.println(returnABC(a,b,c));

    }
}
