package homework;

public class HW2 {

    public static void main(String args[]) {

        int x, y, z;

        {
            System.out.println("=====================================");
            int number5 = 5;
            System.out.println("Task: " + number5);
            System.out.println("_____________________________________\n");

            x = 5;
            y = 10;
            z = 15;

            System.out.println(x + ", " + y + ", " + z + "\n");
        }

        {
            System.out.println("=====================================");
            int number6 = 6;
            System.out.println("Task: " + number6);
            System.out.println("_____________________________________\n");

            x = 5;
            y = 10;
            z = 15;

            System.out.println("1. Sum of x and y = " + (x + z) + "\n");
            System.out.println("2. x * y = " + (x * z) + "\n");
            System.out.println("3. –азность переменных y и z = " + (y - z) + "\n");
        }

        {
            System.out.println("=====================================");
            int number7 = 7;
            System.out.println("Task: " + number7);
            System.out.println("_____________________________________\n");

            int apple = 40, student = 6;

            System.out.println("≈сли, " + apple + " €блок поделить на " + student + " студентов, то каждый студент " +
                    "получит по " + (apple / student) + " €блок(а), и " + ((apple / student) - student) +
                    " €блок(а) останетс€ учителю.\n");
        }

        {
            System.out.println("=====================================");
            int number8 = 8;
            System.out.println("Task: " + number8);
            System.out.println("_____________________________________\n");

            int apple = 100, student = 21;

            System.out.println("≈сли, " + apple + " €блок поделить на " + student + " студента, то каждый студент " +
                    "получит по " + (apple / student) + " €блока, и " + (apple - (apple / student) * student) +
                    " €блок останетс€ учителю.\n");
        }

        {
            System.out.println("=====================================");
            int number9 = 9;
            System.out.println("Task: " + number9);
            System.out.println("_____________________________________\n");

            int lemon = 6;
            int x1 = 24;
            int apple = (x1 + lemon);
            int pear = (apple - 12);

            System.out.println(apple + pear + lemon + " кг фруктов принесли в столовую.\n");
        }

        {
            System.out.println("=====================================");
            int number10 = 10;
            System.out.println("Task: " + number10);
            System.out.println("_____________________________________\n");

            int nozhki = 40;
            int nozhkiNoyout = 8;
            int nozhkiGudyat = 5;
            int nozhkiChromaut = 7;
            int nozhkiBolyat = 2;
            int nozhkiZdorovye = (nozhki - nozhkiNoyout - nozhkiGudyat - nozhkiChromaut - nozhkiBolyat);

            System.out.println(nozhkiZdorovye + " здоровых ножек.\n");
        }

        {
            System.out.println("=====================================");
            int number11 = 11;
            System.out.println("Task: " + number11);
            System.out.println("_____________________________________\n");

            int x1 = 5, y1 = 8, z1 = 6;

            x = 7 * x1;
            y = 6 * y1;
            z = 9 * z1;

            if (x > 7) {
                System.out.println(x + " больше, чем 7 в " + x1 + " раз.");
            }
            if (y1 < y) {
                System.out.println(y1 + " меньше, чем 48 в " + (y - 42) + " раз.");
            }
            if (z > z1) {
                System.out.println(z + " больше, чем 6 в " + (z - 45) + " раз.\n");
            }
        }

        {
            System.out.println("=====================================");
            int number12 = 12;
            System.out.println("Task: " + number12);
            System.out.println("_____________________________________\n");

            int a, b, c, d;

            if ((48 % 8) == 0) {
                System.out.println("„исло 48 кратно 8, записываетс€ как: (48 % 8) == 0\n");
            }

            if ((6 * 8) == 48) {
                System.out.println("„исло 8 меньше, чем 48 в 6 раз. –ешение: (6 * 8) == 48 \n");
            }

            if ((6 * 9) == 54) {
                System.out.println("„исло 54 больше, чем 6 в 9 раз. –ешение: (6 * 9) == 56)\n");
            }
        }

        {
            System.out.println("=====================================");
            int number13 = 13;
            System.out.println("Task: " + number13);
            System.out.println("_____________________________________\n");

            String Line = "+-------+-----+----+--------+------+------+-------+------+------+";
            String newLine = "\n";
            String tabLine = "\t";
            String stLine = "| ";
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
                    + newLine + Line + newLine);
        }

        {
            System.out.println("=====================================");
            int number14 = 14;
            System.out.println("Task: " + number14);
            System.out.println("_____________________________________\n");

            double x1 = 7;
            double y1 = 18;
            double n1 = 3;

            System.out.println("x? ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y)) = "
                    + ((5 * x1 + 7 * y1) / (8 * x1 + 10 * y1)) / ((3 * x1 - y1) / (x1 + y1)) + "\n");
        }

        {
            System.out.println("=====================================");
            int number15 = 15;
            System.out.println("Task: " + number15);
            System.out.println("_____________________________________\n");

            int FiveDayWork = 5;
            int fiveteenShirtsFromFiveDayWork = 15;
            int maxDay = 69;
            int X;

            X = (maxDay / (fiveteenShirtsFromFiveDayWork / FiveDayWork));

            System.out.println("«а " + X + " дн€, сошьют " + maxDay + " костюмов.");
        }

        {
            System.out.println("=====================================");
            int number16 = 16;
            System.out.println("Task: " + number16);
            System.out.println("_____________________________________\n");

            int a = 5, b = 10, c = 15;

            c++; System.out.println("sumABC = " + (a+b+c));

            a = 5; b = 10; c = 15;

            b--; System.out.println("sumCBA = " + (c-b-a));

        }

        {
            System.out.println("=====================================");
            int number17 = 17;
            System.out.println("Task: " + number17);
            System.out.println("_____________________________________\n");

            int xX;
            int yY = 3;
            int dD = 4;
            xX = dD;

            System.out.println("(х + 3)*2 = " + ((xX + yY)*2));

        }

        {
            System.out.println("=====================================");
            int number18 = 18;
            System.out.println("Task: " + number18);
            System.out.println("_____________________________________\n");

            double xNew = 2;
            double yNew = 4;
            double a = 5;
            double b = 3;
            double c = 6;
            double oneVar = ((3 + 4*xNew)/5);
            double twoVar = ((10*(yNew - 5)*(a + b + c))/xNew);
            double threeVar = (9*((4/xNew)+((9+xNew)/yNew)));

            System.out.println("1-e действие решени€: (3 + 4x)/5 = " + oneVar + "\n");
            System.out.println("2-e действие решени€: (10(y - 5)(a + b + c)) / x = " + twoVar + "\n");
            System.out.println("3-e действие решени€: 9(((4/x)+((9+x)/y)) = " + threeVar + "\n");
            System.out.println("4-e действие решени€: (1 решение) - (2 решение) + (3 решение) = " + (oneVar - twoVar + threeVar) + "\n");

        }

        {
            System.out.println("=====================================");
            int number19 = 19;
            System.out.println("Task: " + number19);
            System.out.println("_____________________________________\n");

            double xxNew = 2;
            double yyNew = 4;
            double a = 5;
            double b = 3;
            double c = 6;
            double d = 8;

            double oneVar2 = ((5*xxNew) + (7*yyNew)/((8*xxNew) + (10*yyNew)));
            double twoVar2 = ((3*xxNew)-(yyNew)/(xxNew+yyNew));
            double threeVar2 = (oneVar2 / twoVar2);
            double forVar2 = (a + b + (c/d) + ((a+b)/(c+d)) + (a * b));

            System.out.println("1-e действие решени€: ((5x + 7y)/(8x + 10y)) = " + oneVar2 + "\n");
            System.out.println("2-e действие решени€: ((3x-y)/(x+y)) = " + twoVar2 + "\n");
            System.out.println("3-e действие решени€: ((5x + 7y)/(8x + 10y))/((3x-y)/(x+y)) = " + threeVar2 + "\n");
            System.out.println("4-e действие решени€: a + b + (c/d) + ((a+b)/(c+d)) + a * b = " + forVar2 + "\n");
            System.out.println("5-e действие решени€: ((5x + 7y)/(8x + 10y))/((3x-y)/(x+y)) / (a + b + (c/d) + ((a+b)/(c+d)) + a * b) = " + (threeVar2 / forVar2) + "\n");

        }

    }
}

