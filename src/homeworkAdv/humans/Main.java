package homeworkAdv.humans;

public class Main {

    public static void main(String[] args) {

        Person Dima = new Person();
        Dima.name = "Dmitry";
        Dima.sex = 'M';
        Dima.age = 50;

        System.out.println(String.format("name: %s, sex: %s, age: %d", Dima.name, Dima.sex, Dima.age));

        Person Lena = new Person();
        System.out.println(String.format("name: %s, sex: %s, age: %d", Lena.name, Lena.sex, Lena.age));
    }
}
