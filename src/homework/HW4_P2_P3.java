package homework;

public class HW4_P2_P3 {
    public static final String pass = ("\033[1;32m" + " Pass" + "\u001B[0m");
    public static final String fail = ("\033[1;31m" + " Fail" + "\u001B[0m");

    public static void method12(int tempIn) {
        System.out.println("Температура:\n в Цельсиях - " + ((tempIn * 9/5) + 32) + "\n в Фаренгейтах - " + tempIn);
    } // метод для 12 задачи
    public static void method14(int numberK, int numberL, int numberM) {
        System.out.println("Результат деления " + numberK + " на " + numberL + " = " + (numberK / numberL)
                + ", а остаток от деления = " + (numberK % numberL));
        System.out.println("Результат деления " + numberK + " на " + numberM + " = " + (numberK / numberM)
                + ", а остаток от деления = " + (numberK % numberM));
        System.out.println("Результат деления " + numberL + " на " + numberM + " = " + (numberL / numberM)
                + ", а остаток от деления = " + (numberL % numberM));
        System.out.println("Результат деления " + numberM + " на " + numberK + " = " + (numberM / numberK)
                + ", а остаток от деления = " + (numberM % numberK));
    } // метод для 14 задачи

    public static void method16(double distance1, double time1, double distance2, double time2,
                                double distance3, double time3) {
        //double distance1 = 12;
        //double time1 = 20;
        //double distance2 = 150;
        //double time2 = 150;
        //double distance3 = 300;
        //double time3 = 60;
        double average1 = distance1 / time1;
        double average2 = distance2 / time2;
        double average3 = distance3 / time3;
        System.out.println("Средняя скорость 1-го транспорта = " + average1);
        System.out.println("Средняя скорость 2-го транспорта = " + average2);
        System.out.println("Средняя скорость 3-го транспорта = " + average3);
    } // метод для 16 задачи
    public static void headerTask(int hdInt) {
        System.out.println("-------------------------------------------------------------------------------");
        //System.out.println("\u001B[43m\u001B[43m Task # " + hdInt + " \u001B[0m");
        //System.out.println("\u001B[43m\u001B[47m Task # " + hdInt + " \u001B[0m");
        System.out.println("\u001B[46m Task # " + hdInt + " \u001B[0m");
        System.out.println("-------------------------------------------------------------------------------");
    } // метод для нумерации задач

    public static void main(String[] args) {

        headerTask(12);
        {
            {   // Задача:
                // Напишите метод, который примет на вход температуру в Цельсиях, и распечатает результат температуры
                // в Цельсиях и в Фаренгейтах.
            }
            // Решение:
            method12(25);
        }

        headerTask(13);
        {
            {   // Задача:
                // Напишите алгоритм программы, которая проверяет 2 числа.
                // Программа складывает числа, которые делятся на 3 без остатка, и вычитает числа, которые делятся на 5
                // без остатка.
                // Программа выводит на печать результат вычислений.
                // Программа умножает числа, которые делятся на 2 без остатка, но если хотя бы одно число отрицательное,
                // программа умножает результат действия на (-1).
                // Программа выводит на печать результат вычислений.
                // Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести
                // действия.
            }
            // решение:
            int numbA = 20;
            int numbB = 20;

            boolean expRes13_1 = false;
            boolean expRes13_2 = false;
            boolean expRes13_3 = false;
            boolean expRes13_4 = false;
            boolean expRes13_5 = false;
            boolean actRes13 = false;

            if (numbA % 3 == 0 && numbB % 3 == 0) {
                int sumAB = numbA + numbB;
                System.out.println("Программа складывает числа, которые делятся на 3 без остатка");
                actRes13 = expRes13_1 = true;
            } else if (numbA % 5 == 0 && numbB % 5 == 0) {
                int subAB = numbA - numbB;
                System.out.println("Программа вычитает числа, которые делятся на 5 без остатка");
                actRes13 = expRes13_2 = true;
            } else if (numbA % 2 == 0 && numbB % 2 == 0) {
                int umnAB = numbA * numbB;
                System.out.println("Программа умножает числа, которые делятся на 2 без остатка");
                actRes13 = expRes13_3 = true;
            } else if (numbA < 0 || numbB < 0) {
                int umnAB = (numbA * numbB) * (-1);
                System.out.println("Eсли хотя бы одно число отрицательное, программа умножает результатна (-1)");
                actRes13 = expRes13_4 = true;
            } else {
                System.out.println("Невозможность произвести действия");
                actRes13 = expRes13_5 = true;
            }
            // выходные данные, где сравниваются 2 результата
            boolean expectedResult13 = expRes13_2; // ожидаемый результат (задаем сами, какой ожидаем получить)
            boolean actualResult13 = actRes13 = true; // фактический результат

            if (actualResult13 == expectedResult13) {
                System.out.println(pass);
            } else {
                System.out.println(fail);
            }
        }

        headerTask(14);
        {
            {   // Задача:
                // Распечатать следующие выражения, используя метод и параметры k, l, m:
                // Результат деления k на l = …, а остаток от деления  = …
                // Результат деления k на m = …, а остаток от деления  = …
                // Результат деления l на m = …, а остаток от деления  = …
                // Результат деления m на k = …, а остаток от деления  = …
            }
            // решение:
            method14(9,2,4);
        }

        headerTask(15);
        {
            {   // Задача:
                // В клетке находятся фазаны и кролики. Известно, что у них 35 голов и 94 ноги. Узнайте число фазанов и
                // число кроликов.
                // Проверить работу вашего алгоритма тестом
            }
            // решение:
            int rabbits = 0; // неизвестное число зайцев
            int pheasant; // неизвестное число фазанов

            int heads = 35; // известное число всего голов
            int legs = 94; // известное число всего конечностей

            if (heads * 2 > 0) {
                System.out.println("35 * 2 = " + heads * 2);
            }
            if (heads * 2 == 70 && legs - 70 > 0) {
                System.out.println("94 - 70 = " + (legs - 70));
            }
            if (legs - 70 >= 24) {
                System.out.println((rabbits = (24 / 2)) + " - кроликов в клетке.");
            }
            if (heads - 12 > 0) {
                System.out.println((pheasant = (heads - 12)) + " - фазанов в клетке \nВ клетке " + pheasant
                        + " фазана и " + rabbits + " кроликов.");
            }
        }

        headerTask(16);
        {
            {   // Задача:
                // Написать метод, который рассчитывает среднюю скорость движения (speedAverage) транспортного средства
                // или живого существа с разными параметрами distance и time.
                // Протестировать метод.

                // Тестовые данные:
                // distance		time
                // 12			20 min
                // 150	    	2,5 hours
                // 300		    1? hours
            }
            // решение:
            method16(12,20,150,150,300,60);
        }

        headerTask(17);
        {
            {   // Задача:
                // Выполнить задание 7 и 8 из HW2 с помощью метода и параметров:

                // Написать метод так, чтобы правильные склонения слов (н-р, яблок, яблоко или яблока;
                // ученики - учеников…) печатались автоматически в зависимости от значений параметров.
                // Распечатать выражение с параметрами:
                // apple = 42, 55, 1
                // student = 42, 5, 2
            }

            // решение:

        }

        headerTask(18);
        {
            {   // задача:
                // Распечатать таблицу из HW3,  задание 11 с помощью методов и параметров (значения f, ff, d, dd могут
                // быть любыми). Обратите внимание на то, что левая часть таблицы у вас почти такая же, как правая
                // часть таблицы.
            }
            // решение:

        }

        headerTask(19);
        {
            {   // Задача:
                // Напишите алгоритм программы, которая проверяет число типа short на количество разрядов, и выводить
                // результат проверки.
                // ( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
                // Выведите результат проверки на печать.
            }
            // решение:(1/10=10%) 10, 10, 28, 37 // (1/25=4%) 18, 58, 31, 8 // (1/67=1.5%) 70, 13, 8, 300


        }

        headerTask(20);
        {
            {   // Задача:
                // На сайте https://openweathermap.org/ зарегистрироваться и получить ключ (key). Найти в документации
                // пример запроса с параметрами “Название города” (а не с географическими координатами). Сформировать и
                // отправить запрос на сервер (manually). В полученном ответе найти географические координаты для
                // следующих городов:
                // London
                // Paris
                // Rome
                // (См окончание разбора HW3 - там было показано, как отправлять запрос)
            }
            // решение: ПОНЯТНАЯ ЗАДАЧА, ПРОПУСК

        }
    }
}
