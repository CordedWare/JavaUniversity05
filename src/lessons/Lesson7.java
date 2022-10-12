package lessons;

import java.util.Arrays;

public class Lesson7 {

    public static void main(String[] args) {

        String catName = new String("Readhead");

        System.out.println(catName);

        String catsNames1 = String.valueOf(new String[8]);
        System.out.println(catsNames1);

        int[] catsAgesInt = new int[8];
        System.out.println(catsAgesInt);

        Integer[] catsAgesInteger = new Integer[8];
        System.out.println(catsAgesInteger);

        System.out.println(Arrays.toString(catsAgesInt));
        System.out.println(Arrays.toString(catsAgesInteger));



        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        String[] catsNames = {"Dymka", "Chernysh", "Kokos", "Matroskin", "Kartoshkin",
                "Platon", "Poncchik", "Plusha"};

        System.out.println(Arrays.toString(catsNames));

        catsNames[0] = String.valueOf(2);
        catsNames[1] = String.valueOf(3);
        catsNames[2] = String.valueOf(16);
        catsNames[3] = String.valueOf(3);
        catsNames[4] = String.valueOf(1);
        catsNames[5] = String.valueOf(5);
        catsNames[6] = String.valueOf(10);
        catsNames[7] = String.valueOf(0);


        for(int i = 0; i <= 7; i ++) {
            System.out.println(catsNames[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < catsNames.length; i ++) {
            System.out.println(catsNames[i] + " ");
        }

        for(int i = 0; i < catsNames.length; i ++) {
            if(catsNames[i].equals("Matroskin")); {
                System.out.println("Poglad` " + (Arrays.toString(catsNames[i].toCharArray())));
                break;
            }
        }

        System.out.println("\n\n");

        int day = 8;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
// Outputs "Thursday" (day 4)
    }
}
