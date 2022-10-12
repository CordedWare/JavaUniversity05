package homework;

public class HW3 {
    Double dd;
    double ff;
    private double d;
    private double f;

    static public void main (String args[]){

        { // Start #2-4

            System.out.println("=====================================");
            int number2 = 2;
            int number3 = 3;
            int number4 = 4;
            System.out.println("Task: " + number2 + ", " + number3 + ", " + number4);
            System.out.println("_____________________________________\n");

            // task 2
            byte a = 4;
            byte b = 2;

            // task 3
            short s = 32767;
            short t = -32768;

            // task 4
            int i = -2147483648;

            String Line = "+---------+-------------+";
            String newLine = "\n";
            String stLine = " | ";
            String intMin = "| int min";
            String intMax = "| int max";

            //int TaskFor = Integer.MAX_VALUE (i);

            System.out.println( Line + newLine +
                    intMin + stLine + Integer.MIN_VALUE + stLine + newLine
                    + Line + newLine
                    + intMax + stLine + " " + Integer.MAX_VALUE + stLine + newLine
                    + Line + newLine );

        } // Final #2-4

        { // Start #5

            System.out.println("=====================================");
            int number5 = 5;
            System.out.println("Task: " + number5);
            System.out.println("_____________________________________\n");

            String phoneNumber = "8231832";
            String phoneCode = "9865";

            System.out.println("Phone number: " + phoneCode + phoneNumber + "\n");

        } // Final #5

        { // Start #6

            System.out.println("=====================================");
            int number6 = 6;
            System.out.println("Task: " + number6);
            System.out.println("_____________________________________\n");

            float f = 100.101101f;
            double d = 100.101101d;

            String Line = "+-----------------------+-------------+";
            String newLine = "\n";
            String stLine = " | ";
            String floatF = "| float f  = 100.101101";
            String doubleD = "| double d = 100.101101";

            System.out.println( Line + newLine +
                    floatF + stLine + f + " " + stLine + newLine
                    + Line + newLine
                    + doubleD + stLine + d + " " + stLine + newLine
                    + Line + newLine );

        } // Final #6

        { // Start #7

            System.out.println("=====================================");
            int number7 = 7;
            System.out.println("Task: " + number7);
            System.out.println("_____________________________________\n");

            HW3 test1 = new HW3();
            HW3 test2 = new HW3();


            test1.dd = 10.09999;
            test2.dd = 20.099999;

            test1.ff = 10.09999f;
            test2.ff = 20.099999f;

            System.out.println("Double с именем dd: " + test1.dd);
            System.out.println("Double с именем dd: " + test2.dd);
            System.out.println("Сумма двух чисел Double dd: " + (test2.dd + test1.dd));

            System.out.println();

            System.out.println("Float с именем ff: " + test1.ff);
            System.out.println("Float с именем ff: " + test2.ff);
            System.out.println("Сумма двух чисел Float ff: " + (test1.ff + test2.ff + "\n"));

        } // Final #7

        { // Start #8

            System.out.println("=====================================");
            int number8 = 8;
            System.out.println("Task: " + number8);
            System.out.println("_____________________________________\n");

            float ff = (float) (10.0/3.0);
            double dd = (double) (10.0/3.0);

            System.out.println("Results " + ff + " and " + dd + "\n");

        } // Final #8

        { // Start #9

            System.out.println("=====================================");
            int number9 = 9;
            System.out.println("Task: " + number9);
            System.out.println("_____________________________________\n");

            float f = (float) (10.2);
            float ff = (float) (10.5);

            Float floatSum = new Float(f + ff);
            Float floatSub = ((f = (float) 5.2) - (ff = 4));
            Float floatProduct = new Float(ff = 12);
            Float floatQuotient  = ((f = (float) 10.2) / (ff = (float) 10.5));
            Float floatRemainder = new Float(f / ff);

            System.out.println(floatSum);
            System.out.println(floatSub);
            System.out.println(floatProduct);
            System.out.println(floatQuotient);
            System.out.println(floatRemainder + "\n");

        } // Final #9

        {  // Final #10

            System.out.println("=====================================");
            int number10 = 10;
            System.out.println("Task: " + number10);
            System.out.println("_____________________________________\n");

            double d = (double) (10.2);
            double dd = (double) (10.5);

            Double doubleSum = new Double(d + dd);
            Double doubleSub = (d = (double) (5.2) - (dd = 4));
            Double doubleProduct = new Double(dd = 12);
            Double doubleQuotient  = ((d = (double) 10.2) / (dd = (double) 10.5));
            Double doubleRemainder = new Double(d / dd);

            System.out.println(doubleSum);
            System.out.println(doubleSub);
            System.out.println(doubleProduct);
            System.out.println(doubleQuotient);
            System.out.println(doubleRemainder + "\n");

        } // Final #10

        { // Start #11

            System.out.println("=====================================");
            int number11 = 11;
            System.out.println("Task: " + number11);
            System.out.println("_____________________________________\n");

            String Line = "+--------------------+---------------+---------------+------------------+";
            String newLine = "\n";
            String tL = "\t";
            String stLine = "| ";
            String sttLine = " | ";

            HW3 test3 = new HW3();
            HW3 test4 = new HW3();
            HW3 test5 = new HW3();
            HW3 test6 = new HW3();

            double d = (double) (10.2);
            double dd = (double) (10.5);
            float f = (float) (10.2);
            float ff = (float) (10.5);

            test3.d = 10.2;
            test4.dd = 10.5;
            test5.f = 10.2;
            test6.ff = 10.5;

            Float floatSum = new Float(f + ff);
            Float floatSub = ((f = (float) 5.2) - (ff = 4));
            Float floatProduct = new Float(ff = 12);
            Float floatQuotient  = ((f = (float) 10.2) / (ff = (float) 10.5));
            Float floatRemainder = new Float(f / ff);

            Double doubleSum = new Double(d + dd);
            Double doubleSub = (d = (double) (5.2) - (dd = 4));
            Double doubleProduct = new Double(dd = 12);
            Double doubleQuotient  = ((d = (double) 10.2) / (dd = (double) 10.5));
            Double doubleRemainder = new Double(d / dd);

            System.out.println( Line + newLine + stLine + "d = " + test3.d + tL + tL + "" + tL + sttLine + "dd = " + test4.dd + " " + "" + tL + sttLine
                    + "f = " + test5.f + tL + tL + sttLine + "ff = " + test6.ff + tL + tL + stLine + newLine + Line + newLine
                    + stLine + "doubleSum = " + doubleSum + tL + tL + tL + tL + "  " + tL + "  " +  sttLine + "floatSum = " + floatSum  + tL + tL + tL + "" + tL + "" + stLine + newLine
                    + stLine + "doubleSub = " + doubleSub + "  " + tL + "  " + sttLine + "floatSub = " + floatSub  + "  " + tL + tL + "    " +  stLine + newLine
                    + stLine + "doubleProduct = " + doubleProduct  + tL + tL + tL + tL + "  " + sttLine + "floatProduct = " + floatProduct + tL + tL + "    " + stLine + newLine
                    + stLine + "doubleQuotient = " + doubleQuotient + " " + sttLine + "floatQuotient = " + floatQuotient + " " + tL + tL + stLine + newLine
                    + stLine + "doubleRemainder = " + doubleRemainder + sttLine + "floatRemainder = " + floatRemainder + " " + tL + stLine + newLine
                    + Line + "\n"
            );

        } // Final #11

        {  // Final #12

            System.out.println("=====================================");
            int number12 = 12;
            System.out.println("Task: " + number12);
            System.out.println("_____________________________________\n");

            String l1 = "     .       .     .      .       .";
            String l2 = "     .     .  .     .    .      .  . ";
            String l3 = "     .    . .. .     .  .      . .. . ";
            String l4 = "  . .    .      .     ..      .      . ";

            System.out.println(l1 + "\n" + l2 + "\n" + l3 + "\n" + l4 + "\n");

        } // Final #12
        // остальные дз перенесены в класс HW3parth2
    }
}

