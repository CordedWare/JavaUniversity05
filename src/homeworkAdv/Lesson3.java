package homeworkAdv;

import java.util.Arrays;

public class Lesson3 {

    static String preparePrintArray(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
            if (i != arr.length-1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(']');
        String result = stringBuilder.toString();
        return result;
    }

    public static void main(String args[]) {

//        int a = 2;
//        int b = 1;
//
//        boolean b2 = !true;
//        boolean b3 = b2;
//        b3 = true;
//
//        System.out.println(b3);

        //////////////////////////////////

        int[] a = {1, 2, 3, 4, 5};
        int[] b = a;

        a[0] = 23;

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        System.out.println("a == b is " + (a == b));



        String str = "Hello Java!";

        System.out.println(str.contains("Hello ")); // сравнивание строк



        //String a = "1 2 3 4 5 6";
        //String[] arr = a.split(" ");
        int[] arr1 = {1, 2, 5, 8, 0};
        System.out.println("arr: " + preparePrintArray(arr1));


        int[] arr = {1, 2, -4, 7, 1, 30_300, -2_000_000, 0};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("i=  " + i + " arr[i] = " + arr[i]);

           System.out.println(arr[5]);
            System.out.println();
            System.out.println();
            System.out.println(Arrays.toString(arr));

           int[][][] arr2 = {
                   {{1,2,3},{2,5,4},{7,5,7}},
                   {{2,5,4},{4,0,9},{1,2,3}},
                   {{7,5,7},{1,2,3},{7,5,7}},
                   {{4,0,9},{4,0,9},{2,5,4}}
            };
            //System.out.println(Arrays.toString(arr2[1]));
            System.out.println(Arrays.toString(arr2[1][2]));
            System.out.println(Arrays.deepToString(arr2));

        int[] arr3 = {33, -2, 4, 67, 4, 9, 4};
        int min = arr3[0];
        for (int j = 1; 1 < arr3.length; j++) {
            if (min > arr3[i]) {
                min = arr3[i];
            }
        }
            System.out.println(String.format("minimal element is arr[%d] and value is %d, max =",min));
        }
    }
}