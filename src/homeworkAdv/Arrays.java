package homeworkAdv;

import java.util.OptionalInt;

public class Arrays {

    public static void main(String[] args) {

        //task 1-4
        int[] arr1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        {
            System.out.println("Task - 1.");
            //task 1 var.1
            int sum = 0;

            for (int i = 0; i < arr1.length; i++) {
                sum += arr1[i];
            }
            System.out.println("  Sum numbers (var.1): " + sum);

            //task 1 var.2
            int sum2 = java.util.Arrays.stream(arr1).sum();

            System.out.println("  Sum numbers (var.2): " + sum2);

            //task 1 var.2
            int sum3 = 0;
            for (int element : arr1)
                sum3 += element;

            System.out.println("  Sum numbers (var.3): " + sum3 + "\n");
        } // 1

        {
            //task 2 var.1
            System.out.println("Task - 2.");
            int maxNum = arr1[0];

            for (int j : arr1) {
                if (j > maxNum)
                    maxNum = j;
            }
            System.out.println("  Maximum number: " + maxNum + "\n");
        } // 2

        {
            //task 3 var.1 (не правильно считает, уточнить на уроке)
            System.out.println("Task - 3.");
            int minNum = arr1[0];

            for (int k : arr1) {
                if (k < minNum)
                    minNum = k;
            }
            System.out.println("  Minimum number (var.1): " + minNum);

            //task 3 var.2
            OptionalInt minNum2 = java.util.Arrays.stream(arr1).min();
            System.out.println("  Minimum number (var.2): "
                    + (minNum2.isPresent() ? minNum2.getAsInt() : "empty array"));

            //task 3 var.3
            int minNumTwo = arr1[0];
            for (int num : arr1) {
                if (num < minNumTwo) {
                    minNumTwo = num;
                }
            }
            System.out.println("  Minimum number (var.3): " + minNumTwo);

            //task 3 var.4
            int minNumFree = arr1[0] + 1;
            for (int m = 0; m < arr1.length; m++) {
                if (arr1[m] < minNumFree) {
                    minNumFree = arr1[m];
                }
            }
            System.out.println("  Minimum number (var.4): " + minNumFree + "\n");
        } // 3

        {
            //task 4 var.1 (не правильно считает, уточнить на уроке)
            System.out.println("Task - 4.");

            double average = 0;
            if (arr1.length > 0) ;
            {
                double sum5 = 0;
                for (int z = 0; z < arr1.length; z++) {
                    sum5 += arr1[z];
                }
                average = (sum5 / arr1.length);
            }
            System.out.println("  Average number (var.1): " + average);

            //task 4 var.2
            double average2 = 0;
            for (int o : arr1) {
                average2 += o;
            }
            System.out.println("  Average number (var.2): " + average2 / arr1.length + "\n");
        } // 4


        //task 5-7
        int[][] arr2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        {
            System.out.println("Task - 5.");
            //task 5 var.1

            int sum6 = 0;

            for (int n = 0; n < arr2.length; n++) {
                for (int b = 0; b < arr2[n].length; b++) {
                    sum6 = sum6 + arr2[n][b];
                }
            }
            System.out.println("  Sum of two-dimensional arrays (var.1): " + sum6 + "\n");
        } // 5

        {
            System.out.println("Task - 6.");
            //task 6 var.1
            int maxNum2 = 0;
            for (int f = 0; f < arr2.length; f++) {
                for(int u = 0; u < arr2[f].length; u++) {
                    if (maxNum2 < arr2[f][u]){
                        maxNum2 = arr2[f][u];
                    }
                }
            }
            System.out.println("  Max. number of two-dimensional arrays (var.1): " + maxNum2 + "\n");
        } // 6

        {
            System.out.println("Task - 7.");
            //task 7 var.1
            int count = arr2.length;
            System.out.println("  Number of elements in the arrays (var.1): " + count);
        } // 7
    }
}
