package lessons;

public class Lesson6_P1 {

    public static void main(String[] args) {

//        for (int java = 1; java <= 5; java++) {
//            System.out.println("      Java for beginners " + java);
//            for (int python = 5; python >= 1; python--) {
//                System.out.println("   Python for beginners " + python);
//                for (int dotNet = 1; dotNet <= 5; dotNet++) {
//                    System.out.println("dot.Net for beginners " + dotNet);
//                }
//            }
//        }

//        char letter = '�';
//        //System.out.println((int)letter);
//
//        for (int i = '�'; i <= '�'; i++) {
//            System.out.println((char)i);

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzze");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzze");
            } else {
                System.out.println(i);
            }
        }
    }
}
