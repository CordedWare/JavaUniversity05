package lessons;

public class Table {

    static String Line = "+-------+-----+----+--------+------+------+-------+------+------+";
    static String newLine = "\n";
    static String tabLine = "\t";
    static String stLine = "| ";

    public static void printLine() {
        System.out.println("+-------+-----+----+--------+------+------+-------+------+------+");
    }

    public static void printString(String text) {
        System.out.println(text);
    }

    public static void printInt(int numberInt) {
        System.out.println(numberInt);
    }

    public static void printIntAndIntegerAndDouble(int printInt, String printText, double printDouble) {
        System.out.println(printInt);
        System.out.println("text " + printText);
        System.out.println(printDouble);
    }

    public static void newObject(Object obj) {
        System.out.println(obj);
    }

    public static void headerTask(int hdInt) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println(" Task №" + hdInt);
        System.out.println("-----------------------------------------------------------------");
    }

    public static void main(String[] args) {

        {String lesson = "lesson";

        printLine();
        printString(Line);
        printString("Task #");
        printString(lesson);
        printString("Java");
        printInt(148);
        printIntAndIntegerAndDouble(12,"Lol",12.0);
        newObject(22.0 + " Lol");
        headerTask(1);

        String kLine = "k = 5 ";
        String lLine = "l = 10 ";
        String mLine = "m = 15 ";

        int a = 10;
        int b = 5;
        int c = 100;
        int d = 2;

        int k = 5;
        int l = 10;
        int m = 15;

        System.out.println(Line + newLine

                + stLine + tabLine + "  " + tabLine + stLine + "+" + a + " " + stLine + "-" + b + " "
                + stLine + " *" + c + "  "
                + stLine + " /" + d + "  " + stLine + " %" + d + "  " + stLine + " ^" + d + "   "
                + stLine + " ++  " + stLine + " --  |\n"

                + Line + newLine

                + "|" + kLine + " " + stLine
                + "" + (k + a) + "  "
                + stLine + " " + (k - b) + " "
                + stLine + "  " + (k * c) + "  "
                + stLine + "  " + (k / d) + "  "
                + stLine + "  " + (k % d) + "  "
                + stLine + (k == d) + " "
                + stLine + "  " + (k++) + "  "
                + stLine + "  " + (k--) + "  |"
                + newLine + Line + newLine


                + "|" + lLine + stLine
                + "" + (l + a) + "  "
                + stLine + " " + (l - b) + " "
                + stLine + " " + (l * c) + "  "
                + stLine + "  " + (l / d) + "  "
                + stLine + "  " + (l % d) + "  "
                + stLine + (l == d) + " "
                + stLine + " " + (l++) + "  "
                + stLine + " " + (l--) + "  |"
                + newLine + Line + newLine


                + "|" + mLine + stLine
                + "" + (m + a) + "  "
                + stLine + "" + (m - b) + " "
                + stLine + " " + (m * c) + "  "
                + stLine + "  " + (m / d) + "  "
                + stLine + "  " + (m % d) + "  "
                + stLine + (m == d) + " "
                + stLine + " " + (m++) + "  "
                + stLine + " " + (m--) + "  |"
                + newLine + Line + newLine);}

//        //Андрей старше Светы и Наташа старше Светы.
//
//        int ageA = 25;
//        int ageN = 20;
//        int ageS = 16;
//
//        if (ageA > ageS);
//        else if (ageN > ageS);
//        System.out.println("Sex");

        int a = 0;
        int b = 7;
        int c = 25;

        if (a > b || b < c) {
            a = 7;
            int sum = b + c;
            System.out.println(a);
            System.out.println(sum);
        } else {
            a = 10;
            System.out.println(a);
        }
    }
}
