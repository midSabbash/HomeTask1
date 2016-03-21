package org.sourceit;

import java.util.Random;

public class HomeTask1 {

    public static void main(String[] args) {
        System.out.println("exercise 1");
        System.out.println("Number is even " + isEven(4));
        System.out.println("exercise 2");
        System.out.println("" + findHypotenuse(3, 4));
        System.out.println("exercise 3");
        System.out.println(+perimeter(34, 10, 12));
        System.out.println("exercise 4");
        System.out.println("Random " + generateNumberFromRange(1, 10));
        System.out.println("exercise 5");
        System.out.println("Sum " + calculateSum(23));
        System.out.println("exercise 6");
        System.out.println(" Fibonacci " + fibonacci(5));
        System.out.println("exercise 7");
        System.out.println("Happy ticket " + isHappy(567576));
        System.out.println("exercise 8");
        System.out.println("Area of triangle " + area(3,4));
    }


    /**
     * Проверить, является ли число четным.
     *
     * @param number
     * @return является ли число четным.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Метод возвращает значение гипотенузы.
     * Числа должны быть больше 0. Если какое-либо значение
     * меньше 0, возращать 0.
     *
     * @param a должно быть больше 0.
     * @param b должно быть больше 0.
     * @return значение гипотенузы.
     */
    public static double findHypotenuse(double a, double b) {
        double c = 0;
        if(a <= 0 || b <= 0) {
            return 0;
        } else {
            c = Math.sqrt(a * a + b * b);
            System.out.print("Hypotenuse = ");
        }
        return c;
    }


    /**
     * Метод находит периметр треугольника.
     *
     * @param a
     * @param b
     * @param c
     * @return периметр треугольника.
     */
    public static double perimeter(double a, double b, double c) {
        double p = 0;
        if(a <= 0 || b <= 0 || c <= 0)
            return 0;
        else {
            p = a + b + c;
            System.out.print("perimeter = ");
        }
        return p;
    }

    /**
     * Метод находит площадь треугольника.
     * Значения должны быть больше 0.
     *
     * @param a
     * @param b
     * @return площадь треугольника.
     */
    public static double area(double a, double b) {
        double c = Math.sqrt(a * a + b * b);
        if(a <= 0 || b <= 0)
            return 0;
        else {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }

    /**
     * Генерирует случайное число в заданных пределах.
     *
     * @param min минимальное значение.
     * @param max саксимальное значение.
     * @return сгенерированное число.
     */
    public static int generateNumberFromRange(int min, int max) {
        Random a = new Random();
        int b = min + (int) (a.nextDouble() * (max - min + 1));
        return b;
    }

    /**
     * Считает сумму цифр числа.
     * Число может быть любое,
     * как и положительное так и отрицательное.
     *
     * @param number
     * @return сумма цифр.
     */
    public static long calculateSum(long number) {
        long sum = 0;
        while (number != 0) {
            sum = sum + (number % 10);
            number /= 10;
        }
        if (sum < 0) {
            return sum * -1;
        }
        return sum;

    }

    /**
     * Посчитайте элемент последовательности Фибоначчи.
     * Первый и второй члены последовательности равны единицам,
     * а каждый следующий сумме двух предыдущих.
     *
     * @param till до какого элемента считать.
     * @return элемент последовательности.
     */
    public static int fibonacci(int till) {
        int a = 1;int b = 1;int c = 0;
        if(till < 0){
            return 1;
        }for (int i = 0; i <= till - 2; i++) {
                c = a + b;
                System.out.print(c + ",");
                a = b;
                b = c;
            }
        return c;
    }

    /**
     * "Счастливым" считается билетик у которого
     * сумма первых трёх цифр номера равна сумме последних
     * трёх цифр, как, например, в билетах с номерами 003102 или 567576.
     *
     * @param ticket должен быть от 1 до 999999
     * @return является ли билет счастливым.
     */
    public static boolean isHappy(long ticket) {
        long num1 = ticket / 100000;
        long num2 = (ticket / 10000) % 10;
        long num3 = (ticket / 1000) % 10;
        long num4 = (ticket / 100) % 10;
        long num5 = (ticket / 10) % 10;
        long num6 = ticket % 10;
        return num1 + num2 + num3 == num4 + num5 + num6;
    }
}
