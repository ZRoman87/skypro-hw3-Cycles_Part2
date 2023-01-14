public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    /*
        Задача 1
        С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
        что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        Результат программы должен быть выведен в консоль с тем количеством месяцев, которое необходимо для накопления данной суммы.
        Формат сообщения: «Месяц …, сумма накоплений равна … рублей».
    */
    public static void task1() {
        System.out.println("Задача 1");

        int target = 2_459_000;
        int total = 0;
        int contribution = 15_000;
        int month = 0;

        while (total < target) {
            total += contribution;
            month++;
            if (total >= 2_459_000) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println();
    }

    /*
    Задача 2
    Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
    На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
    Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
    Не забудьте выполнить переход на новую строку между двумя циклами.
    В результате программы вывод должен получиться следующий:
    1 2 3 4 5 6 7 8 9 10
    10 9 8 7 6 5 4 3 2 1
    */
    public static void task2() {
        System.out.println("Задача 2");

        int i = 0;

        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (;i>0;i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /*
    Задача 3
    В стране Y население равно 12 миллионов человек.
    Рождаемость составляет 17 человек на 1000, смертность — 8 человек. Рассчитайте, какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.
    В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».
    */
    public static void task3() {
        System.out.println("Задача 3");

        int year = 0;
        int years = 10;
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int coeff = 1_000;
        int diff = birthRate - deathRate;

        while (year<years) {
            year++;
            population += diff*population/coeff;
            System.out.println("Год " + year + " , численность населения составляет " + population);
        }
        System.out.println();
    }

    /*
    Задача 4
    Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей.
    Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%.
    Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
    */
    public static void task4() {
        System.out.println("Задача 4");

        int month = 0;
        int total = 15_000;
        int finalSum = 12_000_000;
        double percentPerMonth = 0.07;

        while (total < finalSum) {
            month++;
            total += (int)(total*percentPerMonth);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }

    /*
    Задача 5
    Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.
    Должны быть видны накопления за 6, 12, 18, 24-й и следующие месяцы.
    */
    public static void task5() {
        System.out.println("Задача 5");

        int month = 0;
        int total = 15_000;
        int finalSum = 12_000_000;
        double percentPerMonth = 0.07;

        while (total < finalSum) {
            month++;
            total += (int) (total * percentPerMonth);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }

            System.out.println();
        }
    }

    /*
    Задача 6
    Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
    Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.
    Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
    */
    public static void task6() {
        System.out.println("Задача 6");

        int i = 0;
        int total = 15_000;
        int finalYear = 9;
        int percentPerMonth = 7;

        while (i < finalYear*12) {
            i++;
            total = total + total*percentPerMonth/100;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }

        System.out.println();
    }

    /*
    Задача 7
    В компании пятница — отчетный день.
    Нужно написать программу, которая считает дни месяца по датам, определяет,
    какой день пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
    Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
    Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
    «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
    В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений с напоминаниями по разным датам.
    */
    public static void task7() {
        System.out.println("Задача 7");

        int firstFriday = 4;
        int day = 0;

        System.out.println("Вариант 1");

        while (day < 31) {
            day++;
            if ((day - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }

        // Чем меньше итераций в цикле, тем быстрее работает код.

        System.out.println("Вариант 2");

        day = firstFriday;
        while (day < 31) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            day+=7;
        }
        System.out.println();
    }

    /*
    Задача 8
    Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.
    Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
    В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления (ближайшие 100 лет).
    Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
    В результате решения задачи в консоли должен получиться следующий результат:
    1896
    1975
    2054
    */
    public static void task8() {
        System.out.println("Задача 8");

        System.out.println("Вариант 1");

    int startYear = 1823;
    int endYear = 2123;
    int year = startYear;

    while (year < endYear) {
        year++;
        if (year % 79 == 0) {
            System.out.println(year);
        }
    }

        // Чем меньше итераций в цикле, тем быстрее работает код.

        System.out.println("Вариант 2");

    year = 0;
    while (year < endYear) {
        if (year >= startYear) {
            System.out.println(year);
        }
        year+=79;
    }

        System.out.println();
    }

}