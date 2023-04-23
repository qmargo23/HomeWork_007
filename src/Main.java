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

    public static void task1 () {
        System.out.println("Задача 1 (сумма годовых накоплений) ");
        /*  сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
         что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
         «Месяц …, сумма накоплений равна … рублей»
         */

        int accumulation = 0;// начальная сумма
        int contribution = 15_000;// объявляем доход
        int month = 0 ;

        while (accumulation < 2_459_000){

            accumulation = accumulation +contribution;
            month++ ;
            System.out.println( "Месяц  "+month+", сумма накоплений равна "+accumulation+ "  рублей");
        }
        month++;
//        accumulation = accumulation +contribution;// необходимо прибавить еще один месяц, чтобы вышло чуть больше 2_459_000

        System.out.println( "Месяц  "+month+", сумма накоплений равна "+accumulation+ "  рублей");
        System.out.println("_____________________________________");
    }

    public static void task2 () {
        System.out.println("Задача 2 ");
       /* Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
              Не забудьте выполнить переход на новую строку между двумя циклами.
              В результате программы вывод должен получиться следующий:
        1 2 3 4 5 6 7 8 9 10
        10 9 8 7 6 5 4 3 2 1
        */
        int i = 1;
        while (i < 11){
            System.out.print( i + " ");
            i++;
        }

        System.out.println();
        i--;
        for (;i > 0 ; i--){
            System.out.print( i + " ");
        }
        System.out.println();
        System.out.println("_____________________________________");
    }

    public static void task3 () {
        System.out.println("Задача 3");
        /* В стране Y население равно 12 миллионов человек. Рождаемость составляет 17
         человек на 1000, смертность — 8 человек. Рассчитайте, какая численность населения
         будет через 10 лет, если показатели рождаемости и смертности постоянны.
         В консоль выведите результат операции на каждый год в формате:
         «Год …, численность населения составляет …».
         */
        //В третьей задаче нужно внести корректировки в формулы расчета числа населения.
        int population = 12_000_000;// население
        int birthRate = 17;//рождаемость
        int mortality = 8;//сметрность
        int valueGrowth = 1_000;

        for (int i = 1; i <= 10 ; i++){
            population = population + (birthRate-mortality)*population/valueGrowth;
            System.out.println("Год "+i+", численность населения составляет "+population+".");
        }
        System.out.println("_____________________________________");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        /*Василий решил положить деньги на накопительный счет,
        где каждый месяц к сумме его вклада добавляется еще 7%.
        Первоначальная сумма вклада — 15 тысяч рублей.
        Вычислите и выведите в консоль, сколько месяцев Василию
        нужно будет копить, чтобы собрать сумму в 12 миллионов
        рублей при условии, что процент банка от накоплений не меняется,
        а всегда равен 7%.
        Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.*/

        int capital = 15_000;// первоначальная сумма вклада
        int percent = 7;//процент начисления


        for (int i = 1; capital < 12_000_000 ; i++){
            capital = capital+ capital*percent/100;//
            System.out.println("Месяц "+i+", сумма накоплений равна "+capital+".");
        }
        System.out.println("_____________________________________");
    }



    public static void task5() {
        System.out.println("Задача 5");
        /*Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
         а только каждый шестой. Должны быть видны
         накопления за 6, 12, 18, 24-й и следующие месяцы.
         */

        int capital = 15_000;// первоначальная сумма вклада
        int percent = 7;//процент начисления

        for (int i = 1; capital < 12_000_000 ; i++){
            capital = capital + capital*percent/100;//получаем итог для следующего месяцца

            if (i % 6 == 0){
                System.out.println("Месяц "+i+", сумма накоплений равна "+capital+".");
            }

        }
        System.out.println("_____________________________________");
    }


    public static void task6 () {
        System.out.println("Задача 6");
        /*Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать,
         какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
         Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.
         Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет*/

        int  capital = 15_000;// первоначальная сумма вклада
        int percent = 7;//процент начисления
        int year = 9;

        for (int i = 1; i <= year*12; i++){

            capital = capital + capital * percent / 100;
                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + ", сумма накоплений равна " + capital + ".");
                }

        }
        System.out.println("_____________________________________");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        /* В компании пятница — отчетный день.Нужно написать программу, которая считает
        дни месяца по датам, определяет, какой день пятница, и выводит сообщение с напоминанием,
        что нужно подготовить еженедельный отчет.Создайте переменную типа int, которая хранит
        в себе номер первой пятницы месяца (число от 1 до 7).Выведите на каждую пятницу месяца
        (включая полученную) сообщение следующего вида:
        «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
        В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений
        с напоминаниями по разным датам.*/

    int friday = 5; // пусть пт будет 5 число

        for (int i = friday;  i <= 31 ; i = i + 7)

            System.out.println("Сегодня пятница,"+i+"-е число. Необходимо подготовить отчет");

        System.out.println("_____________________________________");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        /*Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.
        Известно, что комета пролетает каждый 79-й год, начиная с нулевого. В консоль нужно вывести все годы
        за последние 200 лет, когда появлялась комета, а также следующий год ее появления
        (ближайшие 100 лет). Для вычисления периода можно создать две дополнительные переменные,
        которые содержат год за 200 лет до текущего (из созданной ранее переменной) в качестве старта
        и 100 лет после в качестве завершения периода расчета. В результате решения задачи в консоли
        должен получиться следующий результат:
        1896
        1975
        2054
        */

        int cometYear = 79;// год появления кометы
        int currentYear = 2023;// задаем текущий год
        int startingPoint = currentYear - 200;// определяем начало отсчета
        int endPoint = currentYear + 100;// определяем конец
        //System.out.println(endPoint);

        for (int i = startingPoint ; i <= endPoint ; i++){

            if ( i % cometYear == 0){
                System.out.println(i);// выдаем результат
            }

        }

        System.out.println("_____________________________________");
    }

}