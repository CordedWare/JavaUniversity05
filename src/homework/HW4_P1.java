package homework;

public class HW4_P1 {
    public static final String pass = ("\033[1;32m" + " Pass" + "\u001B[0m");
    public static final String fail = ("\033[1;31m" + " Fail" + "\u001B[0m");

    public static void headerTask(int hdInt) {
        System.out.println("-------------------------------------------------------------------------------");
        //System.out.println("\u001B[43m\u001B[43m Task # " + hdInt + " \u001B[0m");
        System.out.println("\u001B[43m\u001B[47m Task # " + hdInt + " \u001B[0m");
        //System.out.println("\u001B[46m Task # " + hdInt + " \u001B[0m");
        System.out.println("-------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        headerTask(3);
        {
            {   // Задача:
                // Записать в виде кода следующие логические выражения:
                // 1) (2 = 2) И (7 = 7);
                // 2) Не(15 < 3);
                // 3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
                // 4) Не("Сосна" = "Дуб");
                // 5) (Не(15 < 3)) И (10 > 20);
                // 6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
                // 7) (6/2 = 3) ИЛИ (7*5 = 20)
            }
            // Решение:
            String sosna = new String();
            String dub = new String();
            String vyshnya = new String();
            String klen = new String();

            sosna = "wood";
            dub = "wood";
            vyshnya = "deadwood";
            klen = "wood";

            Boolean glaza = true;
            Boolean chtoByVidet = true;
            Boolean chtoByNeVidet = false;

            int etazh3 = 3;
            int etazh2 = 2;

            if (2 == 2 && 7 == 7) {
                System.out.println("1) (2 = 2) И (7 = 7)" + pass);
            } else {
                System.out.println("1) (2 = 2) И (7 = 7)" + fail);
            }

            if ((15 < 3) == !(true)) {
                System.out.println("2) Не (15 < 3)" + pass);
            } else {
                System.out.println("2) Не (15 < 3)" + fail);
            }

            if (sosna.equals(dub) || (vyshnya.equals(klen))) {
                System.out.println("3) (Сосна = Дуб) ИЛИ (Вишня = Клён)" + pass);
            } else {
                System.out.println("3) (Сосна = Дуб) ИЛИ (Вишня = Клён)" + fail);
            }

            if (sosna.equals(dub) == !(true)) {
                System.out.println("4) Не(Сосна = Дуб)" + pass);
            } else {
                System.out.println("4) Не(Сосна = Дуб)" + fail);
            }

            if ((15 < 3) == !(true) && (10 > 20)) {
                System.out.println("5) (Не(15 < 3)) И (10 > 20)" + pass);
            } else {
                System.out.println("5) (Не(15 < 3)) И (10 > 20)" + fail);
            }

            if (glaza == chtoByVidet && etazh3 > etazh2) {
                System.out.println("6) (Глаза даны, чтобы видеть) И (Под третьим этажом находится второй этаж)" + pass);
            } else {
                System.out.println("6) (Глаза даны, чтобы видеть) И (Под третьим этажом находится второй этаж)"
                        + fail);
            }

            if (6 / 2 == 3 || 7 * 5 == 20) {
                System.out.println("7) (6/2 = 3) ИЛИ (7*5 = 20)" + pass);
            } else {
                System.out.println("7) (6/2 = 3) ИЛИ (7*5 = 20)" + fail);
            }
        }

        headerTask(4);
        {
            {   // Задача:
                // Записать в виде кода следующие выражения:
                // а) Света младше Андрея и Наташи
                // б) На полке стоят учебники, а на столе лежат справочники.
                // в) БОльшая часть детей — девочки. Остальные - мальчики.
            }
            // решение:
            // a)
            int nameS = 18;
            int nameA = 25;
            int nameN = 28;

            if (nameS < nameA && nameS < nameN) {
                System.out.println("а) Света младше Андрея и Наташи" + pass);
            } else {
                System.out.println("а) Света младше Андрея и Наташи" + fail);
            }

            // б)
            boolean polka = true;
            boolean bookStand = true;
            boolean bookNotStand = false;
            boolean stol = true;
            boolean spravochnikStand = true;
            boolean spravochnikNotStand = false;

            if ((polka && bookStand == true) && (stol && spravochnikStand == true)) {
                System.out.println("б) На полке стоят учебники, а на столе лежат справочники" + pass);
            } else {
                System.out.println("б) На полке стоят учебники, а на столе лежат справочники" + fail);
            }

            // в)
            int girls = 7;
            int boys = 1;

            if (girls > boys) {
                System.out.println("в) БОльшая часть детей — девочки. Остальные - мальчики" + pass);
            } else {
                System.out.println("в) БОльшая часть детей — девочки. Остальные - мальчики" + fail);
            }
        }

        headerTask(5);
        {
            {   // Задача:
                // Водительские права можно получить, только когда исполнится 16 лет.
            }
            // решение:
            boolean lawOn = true;
            boolean lawOff = false;
            int age = 16;
            if (age >= 16 && lawOn == true) {
                System.out.println("Водительские права можно получить, т.к. исполнилось 16 лет" + pass);
            } else {
                System.out.println("Водительские права можно получить, т.к. исполнилось 16 лет" + fail);
            }
        }

        headerTask(6);
        {
            {   // Задача:
                // Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно
            }
            // решение:
            boolean nameP = true;
            boolean busGo = false;
            boolean bookRead = true;
            boolean windowLook = true;

            if (((nameP != busGo) && (nameP == bookRead)) || (nameP != windowLook)) {
                System.out.println("Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно" + pass);
            } else {
                System.out.println("Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно"
                        + fail);
            }
        }

        headerTask(7);
        {
            {   // Задача:
                // Если с другом ты, это хорошо, а когда наоборот - плохо
            }
            // решение:
            boolean whithFriend = true;
            boolean withoutFriend = !false;
            boolean goodElse = true;
            boolean badElse = withoutFriend;

            if (goodElse == whithFriend) {
                System.out.println("Ты с другом, это хорошо" + pass);
            } else if (badElse == withoutFriend) {
                System.out.println("Ты без друга, это плохо" + fail);
            }
        }

        headerTask(8);
        {
            {   // Задача:
                // Проверить число x, которое может принимать значения 10, 12, -3, 5 и 0.
                // Если x больше 10, то вывести на печать “x больше 10”.
                // Если x меньше нуля, то вывести на печать “x - отрицательное число”
                // Если x = 5, то вывести на печать “Разность x и 5 равна 0”
                // Иначе вывести на печать “Число x меньше 11, больше или равно 0, но не равно 5”.
                // Проверить, соответствует ли последнее утверждение всем предыдущим утверждениям.
            }

            // решение:
            int x = 5; // входные данные

            boolean expRes1 = false; // задается для определения expectedResult по умолчанию с false
            boolean expRes2 = false;
            boolean expRes3 = false;
            boolean expRes4 = false;
            boolean actRes = false;  // задается для определения actualResult по умолчанию с false

            if (x > 10) {
                System.out.println("x больше 10 ");
                actRes = expRes1 = true; // actRes = expRes1 присваивают себе true, если условие выполняется
            } else if (x < 0) {
                System.out.println("x - отрицательное число");
                actRes = expRes2 = true;
            } else if (x == 5) {
                System.out.println("Разность x и 5 равна 0");
                actRes = expRes3 = true;
            } else {
                System.out.println("Число x меньше 11, больше или равно 0, но не равно 5");
                actRes = expRes4 = true;
                ;
            }

            // выходные данные, где сравниваются 2 результата
            boolean expectedResult = expRes3; // ожидаемый результат (задаем сами, какой ожидаем получить)
            boolean actualResult = actRes = true; // фактический результат

            if (actualResult == expectedResult) {
                System.out.println(pass);
            } else {
                System.out.println(fail);
            }
        }

        headerTask(9);
        {
            {   // задача:
                // Проверьте число на четность.Если число четное,удвойте это число, иначе возведите число в квадрат.
                // Выведите результат работы алгоритма на печать.Найдите в презентации,
                // какой блок схеме соответствует ваш алгоритм.
            }
            // решение:
            boolean expRes9_1 = false;
            boolean expRes9_2 = false;
            boolean actRes9_1 = false;

            int numb = 5;     // входные данные (число)
            int numb1 = numb;
            int numb2 = 2;     // для возведения в квадрат

            if (numb1 % 2 == 0) { // проверка на четность
                System.out.println("Число " + numb + " четное и удвоенно = " + (numb1 *= 2)); // четное число
                // умножается на 2
                actRes9_1 = expRes9_1 = true;
            } else {
                System.out.println("Число нечетное " + numb + " и возведенно в квадрат = " + Math.pow(numb1, numb2));
                // нечетное число возводится в квадрат
                actRes9_1 = expRes9_2 = true;
            }

            // выходные данные, где сравниваются 2 результата
            boolean expectedResult9 = expRes9_2; // ожидаемый результат (задаем сами, какой ожидаем получить)
            boolean actualResult9 = actRes9_1 = true; // фактический результат

            if (actualResult9 == expectedResult9) {
                System.out.println(pass);
            } else {
                System.out.println(fail);
            }
        }

        headerTask(10);
        {
            {   // Задача:
                // Напишите алгоритм проверки возраста на соответствие условиям (if-else):
                // a) Голосовать можно с 18 лет
                // b) Машину можно водить с 16 лет
                // c) В школу можно идти с 5 лет
                // Выведите результат работы алгоритма на печать.
            }
            // решение:

            int ageP = 2; // входные данные (число)

            boolean expRes10_1 = false;
            boolean expRes10_2 = false;
            boolean expRes10_3 = false;
            boolean expRes10_4 = false;
            boolean actRes10_1 = false;

            if (ageP >= 18) {
                System.out.println("Голосовать можно с 18 лет");
                actRes10_1 = expRes10_1 = true;
            }
            if (ageP >= 16) {
                System.out.println("Машину можно водить с 16 лет");
                actRes10_1 = expRes10_2 = true;
            }
            if (ageP >= 5) {
                System.out.println("В школу можно идти с 5 лет");
                actRes10_1 = expRes10_3 = true;
            } else {
                System.out.println("Вам ничего нельзя по условию задачи!");
                actRes10_1 = expRes10_3 = true;
            }
            // выходные данные, где сравниваются 2 результата
            boolean expectedResult10 = expRes10_4 = expRes10_3 = expRes10_2 = expRes10_1; // ожидаемый результат
            boolean actualResult10 = actRes10_1 = true; // фактический результат

            if (actualResult10 == expectedResult10) {
                System.out.println(pass);
            } else {
                System.out.println(fail);
            }

        }

        headerTask(11);
        {
            {   // Задача:
                // Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
                // 5 - выдать похвальную грамоту и перевести в следующий класс
                // 4 - перевести в следующий класс
                // 3 - дать задание на лето и перевести в следующий класс
                // 2 - вызвать родителей и оставить в текущем классе на второй год
                // Выведите результат работы алгоритма на печать.
            }
            // решение:
            int ageSc = 5; // входные данные (число)

            boolean expRes11_1 = false;
            boolean expRes11_2 = false;
            boolean expRes11_3 = false;
            boolean expRes11_4 = false;
            boolean actRes11_1 = false;

            if (ageSc == 5) {
                System.out.println("5 - выдать похвальную грамоту и перевести в следующий класс");
                actRes11_1 = expRes11_1 = true;
            } else if (ageSc == 4) {
                System.out.println("4 - перевести в следующий класс");
                actRes11_1 = expRes11_2 = true;
            } else if (ageSc == 3) {
                System.out.println("3 - дать задание на лето и перевести в следующий класс");
                actRes11_1 = expRes11_3 = true;
            } else if (ageSc == 2) {
                System.out.println("2 - вызвать родителей и оставить в текущем классе на второй год");
                actRes11_1 = expRes11_4 = true;
            }
            // выходные данные, где сравниваются 2 результата
            boolean expectedResult11 = expRes11_1; // ожидаемый результат
            boolean actualResult11 = actRes11_1 = true; // фактический результат

            if (actualResult11 == expectedResult11) {
                System.out.println(pass);
            } else {
                System.out.println(fail);
            }
        }
    }
}
