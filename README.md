# HW-L5
public class FirstTask {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printCol();
        compareNumbers();
        System.out.println(expressionCheck(10, 6));
        checkPositiveNegative(-5);
        System.out.println(checkNegative(-3) + "\n");
        printWordNTimes("Строка", 2);
        System.out.println(checkLeapYear(1204));
    }

    /*
    1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова:
    Orange, Banana, Apple.
    */
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /*
    2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и
    инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать
    эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение
    “Сумма положительная”, в противном случае - “Сумма отрицательная”
    */
    public static void checkSumSign() {
        int a = 2;
        int b = -5;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /*
    3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте
    ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести
    сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно),
    то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”
     */
    public static void printCol() {
        int value = -50;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value < 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    /*
    4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
     и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
      то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”
     */
    public static void compareNumbers() {
        int a = 10;
        int b = 60;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    /*
    5.Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    public static boolean expressionCheck(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    /*
    6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать
    в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным
    числом.
     */
    public static void checkPositiveNegative(int a) {
        System.out.println(a >= 0 ? "Положительное" : "Отрицательное");
    }

    /*
    7. Напишите метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    Замечание: ноль считаем положительным числом.
     */
    public static boolean checkNegative(int a) {

        return a < 0;
    }

    /*
    8. Напишите метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз.
     */
    public static void printWordNTimes(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + str);
        }
    }

    /*
    9. Напишите метод, который определяет, является ли год високосным, и возвращает
    boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
    кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}
