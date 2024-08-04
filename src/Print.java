import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /* 1. Создайте метод printThreeWords(), который
    при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple. */
    public static void main(String[] args) {
        printThreeWords();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /* 2. Создайте метод checkSumSign(), в теле которого объявите
    две int переменные a и b, и инициализируйте их любыми значениями,
    которыми захотите. Далее метод должен просуммировать эти переменные,
    и если их сумма больше или равна 0, то вывести в консоль сообщение
    “Сумма положительная”, в противном случае - “Сумма отрицательная”; */
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 3;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    /* 3. Создайте метод printColor() в теле которого задайте int переменную value
    и инициализируйте ее любым значением. Если value меньше 0 (0 включительно),
    то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0
    (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100
    (100 исключительно) - “Зеленый”;*/

        public static void main (String[]args){
            printColor();
        }
        public static void printColor () {
            int value = 0;
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value > 0 && value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }

    /* 4. Создайте метод compareNumbers(), в теле которого объявите
    две int переменные a и b, и инициализируйте их любыми значениями,
    которыми захотите. Если a больше или равно b, то необходимо вывести
    в консоль сообщение “a >= b”, в противном случае “a < b”;4 задание */

        public static void main (String[]args){
            compareNumbers();
        }
        public static void compareNumbers () {
            int a = 10;
            int b = 5;
            if (a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }
        }

    /* 5. Напишите метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    в противном случае – false.*/

        public static boolean rangeIn ( int sum){
            return (sum >= 10 && sum <= 20);
        }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sum = a + b;
            System.out.println(rangeIn(sum));
        }
    }

    /* 6. Напишите метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    /* 7. Напишите метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
Замечание: ноль считаем положительным числом. */
    public static boolean positive(int a) {
        return (a < 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(positive(a));
    }

    /* 8. Напишите метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз; */
    public static String stringCount(String str, int count) {
        return str.repeat(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b = scanner.nextInt();
        System.out.println(stringCount(a, b));
    }

    /* 9. Напишите метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый
    400-й – високосный.  */
    public static boolean year() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 400 == 0) {
            return true;
        } else if (a % 100 == 0) {
            return false;
        } else if (a % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(year());
    }

    /* 10. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить
    0 на 1, 1 на 0; */
    public static void main(String[] args) {
        int[] massiv = {1, 0, 0, 1, 0, 1, 0, 0};

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == 0) {
                massiv[i] = 1;
            } else {
                massiv[i] = 0;
            }
        }

        for (int i : massiv) {
            System.out.print(i + " ");
        }
    }

    /* 11. Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100; */
    public static void main(String[] args) {
        int[] massiv = new int[100];
        int a = 0;

        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = a;
            a++;
        }
        System.out.println(Arrays.toString(massiv));
    }

    /* 12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    и числа меньшие 6 умножить на 2; */
    public static void main(String[] args) {
        int[] massiv = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < 6) {
                massiv[i] = massiv[i] * 2;
            }
        }
        for (int i : massiv) {
            System.out.print(i + " ");
        }
    }

    /* 13 задание13. Создать квадратный двумерный целочисленный массив
    (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его
    диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких
    элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n]; */
    public static void main(String[] args) {
        int a = 10;
        int[][] array = new int[a][a];

        for (int i = 0; i < a; i++) {
            array[i][i] = 1;
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /* 14. Написать метод, принимающий на вход два аргумента:
    len и initialValue, и возвращающий одномерный массив типа int длиной len,
    каждая ячейка которого равна initialValue. */
    public static int[] dimensionalArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void main(String[] args) {
        int len = 13;
        int initialValue = 7;
        int[] resultArray = dimensionalArray(len, initialValue);

        for (int i : resultArray) {
            System.out.print(i + " ");
        }
    }
}