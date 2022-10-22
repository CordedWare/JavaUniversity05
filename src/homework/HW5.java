package homework;

public class HW5 {
    static int tcNumber = 1; // для нумерации тестов
    public static void printTCNumber() {
        System.out.print("TC_" + tcNumber++ + "  --  ");
    } // метод нумерации
    public static void printTestResult(String value) {
        System.out.println(value);
    } // метод печати отчета
    public static String verifyEquals(int exceptedResult, int actualResult) {
        if (exceptedResult == actualResult) {
            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {
            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    } // метод int сравнения ожидаемого
                                                                                  // и фактического результата

    public static String verifyEquals(double exceptedResult, double actualResult) {
        if (exceptedResult == actualResult) {
            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {
            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    } // метод double сравнения
                                                                            // ожидаемого и фактического результата
    public static String verifyEquals(String exceptedResult, String actualResult) {
        if (exceptedResult == actualResult) {
            return "\033[1;32m" + "Pass" + "\u001B[0m";
        } else {
            return "\033[1;31m" + "Fail" + "\u001B[0m";
        }
    } // метод String сравнения
                                                                            // ожидаемого и фактического результата

    public static int findMaxOutOfTwo1 (int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    } // метод макс из 2 чисел

    public static int findMaxOutOfFour (int a, int b, int c, int d) {
        int max1;
        int max2;
        if (a >= b) {
            max1 = a;
        } else {
            max1 = b;
        }

        if (c >= d) {
            max2 = a;
        } else {
            max2 = b;
        }

        if (max1 >= max2) {
            return max1;
        } else {
            return max2;
        }
    } // метод макс из 4 чисел
    public static String dayWeekly (int number, String day) {
        if (number == 1) {

            return day = "Понедельник";

        } else if (number == 2) {

            return day = "Вторник";

        } else if (number == 3) {

            return day = "Среда";

        } else if (number == 4) {

            return day = "Четверг";

        } else if (number == 5) {

            return day = "Пятница";

        } else if (number == 6) {

            return day = "Суббота";

        } else if (number == 7) {

            return day = "Воскресенье";

        }
        return "Error";
    } // TC_1
    public static int algoAverage (int age1, int age2, int age3) {
        if ((age1 >= 0 && age1 <= 150) && (age2 >= 0 && age2 <= 150) && (age3 >= 0 && age3 <= 150)) {
            int average = ((age1 + age2 + age3) / 3);

            return average;

        }

        return Integer.MIN_VALUE;
    } // TC_2

    // public static int minOfValue1 (int k, int l) {
    //     if (k <= l) {
    //         return k;
    //     } else {
    //         return l;
    //     }
    // } // TC_2

    public static int minOfValue1 (int k, int l) {
        return Math.min(k,l);
    } // TC_3

    public static int minOfValue2 (int k, int l, int m) {
        return Math.min(k,Math.min(l,m));
    } // TC_3

    public static int minOfValue3 (int k, int l, int m, int n) {
        return Math.min(k,Math.min(l,Math.min(m,n)));
    } // TC_3

    //public static int minOfValue4(int a, int b, int c, int d) {
    //    int max1;
    //    int max2;
    //    if (a <= b) {
    //        max1 = a;
    //    } else {
    //        max1 = b;
    //    }
//
    //    if (c <= d) {
    //        max2 = a;
    //    } else {
    //        max2 = b;
    //    }
//
    //    if (max1 <= max2) {
    //        return max1;
    //    } else {
    //        return max2;
    //    }
    //}

    public static double temperatureOfCat2 (double t1, double t2, double t3, double t4, double t5) {
        double averageTemp = ((t1 + t2 + t3 + t4 + t5) / 5);

        if (t1 >= 28 && t1 <= 41 && t2 >= 28 && t2 <= 41 && t3 >= 28 && t3 <= 41
                && t4 >= 28 && t4 <= 41 && t5 >= 28 && t5 <= 41) {

            return averageTemp;

        } else {

            return -1;
        }
    } // TC_4

    public static int calculationSalary (int hour, double price) {
        if(price >= 12 && hour > 0 && hour <= 24) {
            int salary = (int) (hour * price * 21);
            return salary;
        }

        return -1;
    } // TC_5

    public static int calculationLoot (double price, int amount) {
        if(price > 0 && amount > 0) {
            double totalPrice = price * amount;

            return (int) totalPrice;
        }

        return -1;
    } // TC_6

    public static String returnEmployeeSalaryOne (String name, double salary) {
        int oneMethodPartOfNumber = (int) Math.floor(salary);
        int twoMethodPartOfNumber = (int) Math.ceil(salary * 100) - oneMethodPartOfNumber * 100;

        if (name == null || name.equals("") || name.equals(" ") || salary <= 0) {
            return "";
        } else {
            return "" + name + "\t" + oneMethodPartOfNumber + " руб " + twoMethodPartOfNumber + " коп";
        }
    } // TC_7

    public static String returnEmployeeSalaryTwo (String name1, double salary1, String name2, double salary2) {
        int oneMethodPartOfNumber1 = (int) Math.floor(salary1);
        int twoMethodPartOfNumber1 = (int) Math.ceil(salary1 * 100) - oneMethodPartOfNumber1 * 100;
        int oneMethodPartOfNumber2 = (int) Math.floor(salary2);
        int twoMethodPartOfNumber2 = (int) Math.ceil(salary2 * 100) - oneMethodPartOfNumber2 * 100;

        if (name1 == null || name1.equals("") || name1.equals(" ") || salary1 <= 0 && name2 == null ||
                name2.equals("") || name2.equals(" ") || salary2 <= 0) {
            return "";
        } else {
            return "" + name1 + "\t" + oneMethodPartOfNumber1 + " руб " + twoMethodPartOfNumber1 + " коп" + "\n"
                    + "" + name2 + "\t" + oneMethodPartOfNumber2 + " руб " + twoMethodPartOfNumber2 + " коп";
        }
    } // TC_8

    public static String returnX (int x) {
        if (x < 0) {
            return "x is negative number";
        } else if (x > 0) {
            return "x is positive";
        } else {
            return "x is zero";
        }
    } // TC_9

    public static void main(String[] args) {
        // Auto Tests




        // TC_1
        // Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели. В случае невалидных
        //                                                                        значений метод возвращает “Error”.
        // Протестировать метод

        // AAA - triple "A" правило создания автоматизированного тест кейса

        // A = arrange (объявить все данные, которые нам известны)
        int number = 7;
        String day = "Воскресенье";
        String expectedResult1 = "Воскресенье";

        // Act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
        String actualResult1 = dayWeekly(number,day);

        // A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
        verifyEquals(expectedResult1,actualResult1);

        // Report TC_1
        printTCNumber();
        printTestResult(verifyEquals(expectedResult1,actualResult1));





        // TC_2
        // Написать алгоритм вычисления среднего возраста (int) в семье из 3х человек.
        // Например,
        // int age1 = 20,
        // int age2 = 40,
        // int age3 = 60
        // Average = 40.

        // или
        // age1 = -5;
        // age2 = -30;
        // age3 = -3;
        // должно вернуть  Integer.MIN_VALUE;

        // Протестируйте алгоритм на позитивные и негативные сценарии.

        // AAA - triple "A" правило создания автоматизированного тест кейса

        // A = arrange (объявить все данные, которые нам известны)
        int age1 = -40;
        int age2 = -20;
        int age3 = -60;
        //int exceptedResult2 = 40;
        int expetedResult2 = Integer.MIN_VALUE;

        // A = act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
        int actualResult2 = algoAverage(age1,age2,age3);

        // A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
        verifyEquals(expetedResult2,actualResult2);

        // Report TC_2
        printTCNumber();
        printTestResult(verifyEquals(expetedResult2,actualResult2));





        // TC_3
        // Найти минимальное значение, используя переменные (по одному методу на каждый вариант)
        // a) k и l
        // b) k, l, m
        // c) k, l, m, n
        // Переменные должны быть типа int

        // Happy path test data:
        // if k = 3, l = 30, m = 300, n = 3000
        // expected results:
        // a) 3
        // b) 3
        // c) 3

        // Написать тесты на каждый метод.

        // AAA - triple "A" правило создания автоматизированного тест кейса

        // A = arrange (объявить все данные, которые нам известны)
        int k = 3;
        int l = 30;
        int m = 300;
        int n = 3000;
        int expectedResult3 = 3;

        // A = act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
        int actualResult3 = minOfValue3(k,l,m,n);

        // A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
        verifyEquals(expectedResult3,actualResult3);

        // Report TC_3
        printTCNumber();
        printTestResult(verifyEquals(expectedResult3,actualResult3));





        // TC_4
        // Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота. Метод принимает
        //                                                                      и возвращает значения типа double.
        // Например:
        // t1 = 39
        // t2 = 39
        // t3 = 39
        // t4 = 39
        // t5 = 39
        // TempAverage = 39

        // Не забудьте, что температура тела ЖИВОГО кота имеет определенные границы. Значения, которые не входят в эти
        //                                                                                 границы считаем невалидными
        // и выдаем ошибку. В случае невалидного значения хотя бы одной из входящих температур, метод возвращает -1.

        // Согласно документации клиента
        // https://vetna.info/bolezni/koshki/ponizhennaya-temperatura-u-kota/
        // https://junglevet.ru/stati/povyshenie-temperatury-tela-u-koshki/

        // кот все еще жив при температурах от 28С до 41С.
        // По статистике клиента, некоторые коты могут быть все еще живы при температурах от 25С до 45 С

        // Протестируйте метод на позитивные и негативные сценарии.

        // AAA - triple "A" правило создания автоматизированного тест кейса

        // A = arrange (объявить все данные, которые нам известны)
        double t1 = 19;
        double t2 = 39;
        double t3 = 39;
        double t4 = 39;
        double t5 = 39;
        double exceptedResult4 = -1;

        // A = act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
        double actualResult4 = temperatureOfCat2(t1,t2,t3,t4,t5);


        // A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
        verifyEquals(exceptedResult4,actualResult4);

        // Report TC_4
        printTCNumber();
        printTestResult(verifyEquals(exceptedResult4,actualResult4));





        // TC_5
        // Написать метод, который принимает на вход количество часов (int) работы в день, стоимость одного часа
        //                                                                              работы в десятичном числе,
        // и возвращает заработную плату в месяц в целых единицах.
        // При невалидных значениях метод возвращает -1.

        // Уточнения:
        // Стоимость одного часа для разных сотрудников может быть разная. Данные о зарплате сотрудников мы
        //                                                                  не разглашаем.Но наши сотрудники
        // не работают бесплатно и не выплачивают компании долги за право работать. Зарплата сотрудников рассчитывается
        //                                                                              согласно законодательства штата.

        // Страна = RedRover.school
        // Штат = Java for beginers

        // По законодательству нашего штата минимальная оплата рабочего часа - 12.

        // В организации нет сотрудников у которых сокращенная рабочая неделя (несовершеннолетние, инвалиды, вредные
        //                                                                                              условия труда),
        // но сотрудники могут выбирать сколько часов в день они могут работать. Овертайм оплачивается по обычной ставке

        // ПО уточненным требованиям:
        // Будем считать, что в нашей организации вот этот документ определяет Среднемесячную норму рабочего времени
        // https://clubtk.ru/srednee-kolichestvo-rabochikh-dney-v-mesyatse

        // Но среднемесячная норма не означает, что нельзя работать больше 8 часов в день.

        // Протестируйте метод на позитивные и негативные сценарии.

        // AAA - triple "A" правило создания автоматизированного тест кейса

        // A = arrange (объявить все данные, которые нам известны)
        int hour = 25;
        double price = 15;
        int exceptedResult5 = -1;

        // A = act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
        int actualResult5 = calculationSalary(hour,price);

        // A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
        verifyEquals(exceptedResult5,actualResult5);

        // Report TC_5
        printTCNumber();
        printTestResult(verifyEquals(exceptedResult5,actualResult5));





        // TC_6
        // Написать метод, который принимает на вход 2 параметра - цену и количество товара (количество в штуках).
        // Алгоритм возвращает сумму покупки в виде десятичного числа.

        // Например:
        // price for 1 = 25 руб 50 коп (25.5)
        // amount = 5
        // expected total = 127 руб 50 коп (127.5)

        // При невалидных значениях метод возвращает -1

        // Проверьте метод на позитивный и негативный сценарий.

        // AAA - triple "A" правило создания автоматизированного тест кейса

        // A = arrange (объявить все входящие данные, которые нам известны)
        double price1 = 2;
        int amount = 2;
        int exceptedResult6 = 4;

        // A = act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
        int actualResult6 = calculationLoot(price1, amount);

        // A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
        verifyEquals(exceptedResult6,actualResult6);

        // Report TC_6
        printTCNumber();
        printTestResult(verifyEquals(exceptedResult6,actualResult6));





        // TC_7
        // Написать метод, который принимает на вход необходимые параметры и возвращает строку ведомости выдачи
        //                                                                                  зарплаты сотрудникам.
        // Например:

        // “Смирнова Мария Ивановна   70000 руб 00 коп”

        // Если имя сотрудника придет в виде пустой строки или в виде null (String -  это референсный тип данных
        //                                                                      и может принимать значение null),
        // то в ведомости должна быть распечатана пустая строка "".
        // Если же на вход придет невалидное данное по зарплате, или зарплата будет рассчитана, как 0, то в ведомости
        //                                                                  тоже должна быть распечатана пустая строка""

        // AAA - triple "A" правило создания автоматизированного тест кейса

        // A = arrange (объявить все данные, которые нам известны)
        String name = "Смирнова Мария Ивановна";
        double salary1 = 70000.00;
        String expectedResult7 = "Смирнова Мария Ивановна\t70000 руб 0 коп";

        // A = act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
        String actualResult7 = returnEmployeeSalaryOne(name, salary1);

        // A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
        verifyEquals(expectedResult7,actualResult7);

        // Report TC_7
        printTCNumber();
        printTestResult(verifyEquals(expectedResult7,actualResult7));





        // TC_8
        // Создать метод, который печатает ведомость для нескольких сотрудников, используя метод из задачи 8, например:

        // Смирнова Мария Ивановна 		70000 руб 00 коп
        // Серебров Иван Петрович 		128059 руб 00 коп

        // Метод в задании 9 может принимать разные параметры,в зависимости от того, что вам нужно для печати ведомости.
        // Смысл этого метода - распечатать несколько строк ведомости одновременно. Каждая из строк должна формироваться
        //                                                                    с помощью метода, написанного в задании 8.

        // AAA - triple "A" правило создания автоматизированного тест кейса

        // A = arrange (объявить все данные, которые нам известны)
        String name2 = "Смирнова Мария Ивановна";
        double salary2 = 70000.00;
        String name3 = "Смирно Мария Ивановна";
        double salary3 = 80000.00;
        String expectedResult8 = "Смирнова Мария Ивановна\t70000 руб 0 коп\nСмирно Мария Ивановна\t80000 руб 0 коп";

        // A = act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
        String actualResult8 = returnEmployeeSalaryTwo(name2, salary2, name3, salary3);

        // A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
        verifyEquals(expectedResult8,actualResult8);

        // Report TC_7
        printTCNumber();
        printTestResult(verifyEquals(expectedResult8,actualResult8));




        // TC_9
        // Записать в виде метода и протестировать:
        //дано int x (см. рисунок)

        // AAA - triple "A" правило создания автоматизированного тест кейса
        int x = 0;
        String exceptedResult9 = "x is zero";

        // A = act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
        String actualResult9 = returnX(x);

        // A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал
        verifyEquals(exceptedResult9,actualResult9);

        // Report TC_9
        printTCNumber();printTestResult(verifyEquals(exceptedResult9,actualResult9));
        System.out.println(returnX(x));

    }
}
