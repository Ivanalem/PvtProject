package task4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        task1();//Напишите программу, которая выводит на консоль таблицу умножения
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1() {
        System.out.println("Task1:");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
        System.out.println("Task1 завершен!");
    }

    private static void task2() {
        System.out.println("Task2: ");

        while (true) {
            System.out.println("Введите первое число: ");
            int a = scanNum();
            System.out.println("Введите второе число: ");
            int b = scanNum();
            int inc = a * b;
            System.out.println("Результат введенных чисел равен: " + inc);
            System.out.println("Для продолжения программы введите любое число, если нет,то введите 1");
            if (scanNum() == 1) {
                System.out.println("Программа 2 завершила работу");
                break;
            }
        }
    }

    private static void task3() {
        System.out.println("Task3: ");
        System.out.println("Введите первый член последовательности: ");
        int num1 = scanNum();
        System.out.println("Введите второй член последовательности: ");
        int num2 = scanNum();
        System.out.println("Введите целое положительное число последовательности: ");
        int numPos = scanNum();
        if (numPos > 0) {
            int sumNum = 0;
            int resNum = 0;
            for (int i = 1; i <= numPos; i++) {
                sumNum = num1 + num2;
                num1 = num2;
                num2 = sumNum;
                resNum += sumNum;


                System.out.println("Сумма первых чисел: " + num1 + " + " + num2 + " = " + (num2 + num1));
            }
            System.out.println("Сумма первых членов последовательности Фибоначи " + resNum);
        } else {
            System.out.println("Неккоректное число N");
        }

    }


    private static void task4() {
        System.out.println("Task4: ");
        while (true) {
            System.out.println("Введите число : ");
            int num = scanNum();
            if (num > 0) {
                System.out.println("Плюс");
            } else if (num < 0) {
                System.out.println("Минус");
            } else {
                System.out.println("Программа завершена, введено число 0");
                break;
            }
        }
    }

    private static void task5() {
        System.out.println("Task5: ");
        int luckTicket = 0;
        for (int i = 0; i < 999999; i++) {
            int firstNumber = i / 1000;
            int secondNumber = i % 1000;
            int firstDigit = firstNumber / 100;
            int secondDigit = (firstNumber / 10) % 10;
            int thirdDigit = firstNumber % 10;
            int fourthDigit = secondNumber / 100;
            int fivesDigit = (secondNumber / 10) % 10;
            int sixthDigit = secondNumber % 10;
            if ((firstDigit + secondDigit + thirdDigit) == (fourthDigit + fivesDigit + sixthDigit)) {
                luckTicket++;
            }
        }
        System.out.println("Количество счастливых билетов в одном рулоне: " + luckTicket);
    }


    private static int scanNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}





