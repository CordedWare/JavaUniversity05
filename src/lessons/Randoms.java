package lessons;

import java.util.Random;

public class Randoms {

    public static void main(String[] args) {

        Random dice = new Random();
        int number;
        int iteration_count = 0;

        for (int i = 1;; i++) {
            number = dice.nextInt(22_000_000); // диапазон до какого числа запускать Random
            iteration_count++;
            System.out.println("Случайное число - " + number + "\t ||   Кол-во попыток - " + iteration_count);
            if (number >= 1 && number <= 25_000 || number >= 700_000 && number <= 725_000
            || number >= 1_000_000 && number <= 1_025_000 || number >= 5_200_000 && number <= 5_225_000
            || number >= 15_000_000 && number <= 15_025_000 || number >= 21_200_000 && number <= 21_225_000
            || number >= 13_000_000 && number <= 13_025_000 || number >= 900_000 && number <= 925_000
            || number >= 3_000_000 && number <= 3_025_000 || number >= 8_200_000 && number <= 8_225_000
            || number >= 18_000_000 && number <= 18_025_000 || number >= 19_200_000 && number <= 19_225_000
            ) { // число, которое если совпадет с Random, то завершится
                return;
            }
        }
    }

    private int nextInt(int i) {
        return 0;
    }
}
