package school;

public class Student extends Person {

    public static void main(String[] args) {

        String firstName = "Vova";
        String lastName = "Sidorov";
        String student = "5 class";
        int age = 10;

        String firstName2 = "Masha";
        String lastName2 = "Semenova";
        String student2 = "9 class";
        int age2 = 14;

        System.out.println("+----------------+--------------+---------------+");
        System.out.println(
                "| First Name:\t | \t" + firstName + "\t\t| " + firstName2 + " \t\t|\n" +
                        "| Last Name:\t |  " + lastName + "\t\t| " + lastName2 + "\t\t|\n" +
                        "| Age:\t\t\t |\t" + age + "\t\t\t| " + age2 + " \t\t\t|\n" +
                        "| Student group: | \t" + student + "" + " \t| " + student2 + "\t\t|"
        );
        System.out.println("+----------------+--------------+---------------+");

    }
}
