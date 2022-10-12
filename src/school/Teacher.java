package school;

public class Teacher extends Person {

    public static void main (String args[]) {

        String firstName = "Maria";
        String lastName = "Petrovna";
        String middleName = "Ivanovna";
        String subject = "Russian literature";
        int age = 35;

        System.out.println("+----------------+--------------------------+");
        System.out.println(
                "| First Name:\t | \t\t" + firstName + ",\t\t\t\t|" + "\n" +
                        "| Last Name:\t |  \t" + lastName + ",\t\t\t|" + "\n" +
                        "| Middle name:\t |\t\t" + middleName + ",\t\t\t|" + "\n" +
                        "| Age:\t\t\t |\t\t" + age + ",\t\t\t\t\t|" + "\t\n" +
                        "| Subject:\t\t | \t\t" + subject + "." + "\t|"
        );
        System.out.println("+----------------+--------------------------+");

        String firstName2 = "Ivan";
        String lastName2 = "Serebryakov";
        String middleName2 = "Petrovich";
        String subject2 = "Mathematica";
        int age2 = 55;

        //12.

        System.out.println("+----------------+--------------------------+");
        System.out.println(
                "| First Name:\t | \t\t" + firstName2 + ",\t\t\t\t|" + "\n" +
                        "| Last Name:\t |  \t" + lastName2 + ",\t\t|" + "\n" +
                        "| Middle name:\t |\t\t" + middleName2 + ",\t\t\t|" + "\n" +
                        "| Age:\t\t\t |\t\t" + age2 + ",\t\t\t\t\t|" + "\t\n" +
                        "| Subject:\t\t | \t\t" + subject2 + "." + "\t\t|"
        );
        System.out.println("+----------------+--------------------------+");
    }
}
