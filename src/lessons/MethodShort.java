package lessons;

public class MethodShort {

    public static void printKLMActions(int parameter1, int parameter2, String varName1, String varName2) {
        int quotient = parameter1 / parameter2;
        int remainder = parameter1 % parameter2;
        System.out.println("Результат деления " + varName1 + " на " + varName2 + " = " + quotient
                                                      + ", а остаток от деления = " + remainder);
    }

    public static void main(String[] args) {

        int k = 20;
        int l = 10;
        int m = 5;

        printKLMActions(k,l,"k","l");
        printKLMActions(k,m,"k","m");
        printKLMActions(l,m,"l","m");

    }
}
