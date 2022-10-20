package lessons;

public class HWtest {

        public static void main(String[] args) {
//            int[] number = {-45, 590, 234, 985, 12, 68};
//            int[] start = number;
//            for (int i = 0; i <= number.length; i++)
//                if (start[i] % 2 != 0)
//                    System.out.print(start[i] + ", ");

            int[] arrayNumber = {-45, 590, 234, 985, 12, 68};
            int[] newArray = new int[arrayNumber.length / 2];
            int j = 1;
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = arrayNumber[j];
                j = j + 2;
                System.out.println(arrayNumber[j] + ", ");
            }

        }
    }
