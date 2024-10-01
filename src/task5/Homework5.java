package task5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5(randomArray(), 24);
    }

    private static void task1() {
        System.out.println("Задача №1: ");
        int massNum = scanNum();
        if (numValid(massNum)) {
            int[] mass = new int[massNum];
            int res = 0;
            int res2 = 0;
            int res3 = 0;
            int res4 = 0;
            System.out.println("Первая последовательность: ");
            for (int i = 0; i < mass.length; i++) {
                res2 += mass[i] + 2 * -1;
                res = (res2 + 1) * (-1);

                System.out.print(res + ", " + res2 + ", ");
            }
            System.out.println("\nВторая последовательность: ");
            for (int j = 0; j < mass.length; j++) {
                res3 += mass[j] + 1;
                res4 += mass[j];
                System.out.print(res3 + ", " + res4 + ", ");
            }
            System.out.println("Задача №1 завершена!");
        }

    }

    private static void task2() {
        System.out.println("Задача №2: ");
        int massNum = scanNum();
        Random random = new Random();
        int index = -1;
        if (numValid(massNum)) {
            int[] mass = new int[massNum];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = random.nextInt(10) + 1;
            }
            System.out.println("Исходный массив: " + Arrays.toString(mass));
            for (int j = 0; j < mass.length; j++) {
                index = j;
                int result = index % 2;
                if (result == 0) {
                    mass[j] = 0;
                }

            }
            System.out.println("Конечный результат: " + Arrays.toString(mass));
        }
        System.out.println("Задача №2 завершена!");
    }

    private static void task3() {
        System.out.println("Задача №3: ");
        int massNum = scanNum();
        Random random = new Random();
        if (massNum > 4 || massNum < 4) {
            System.out.println("Введено некорректное число!");
        } else {
            int[] mass = new int[massNum];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = random.nextInt(10, 99);
            }
            System.out.println("Исходный массив: " + Arrays.toString(mass));
            if (mass[0] < mass[1] && mass[1] < mass[2] && mass[2] < mass[3]) {
                System.out.println("Данный массив со строго возрастающей последовательностью");
            } else {
                System.out.println("Данный массив не имеет строго возрастающей последовательности ");
            }
            System.out.println("Задача №3 завершена!");
        }
    }

    private static void task4() {//доделать
        System.out.println("Задача №4: ");
        int massNum = scanNum();
        Random random = new Random();
        if (numValid(massNum)) {
            int[] mass = new int[massNum];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = random.nextInt(10, 99);
            }
            System.out.println("Исходный массив: " + Arrays.toString(mass));
            int indexEv = 0;
            int indexPr = 0;
            int[] evenMass = new int[(int) Math.ceil((double) (massNum - 1) / 2)];
            int[] oddMass = new int[(int) Math.floor((double) (massNum - 1) / 2)];
            for (int i = 0; i < mass.length; i++) {
                if (i == 0) {
                    continue;
                }
                if (i % 2 == 0) {
                    oddMass[indexPr] = mass[i];
                    indexPr++;
                } else {
                    evenMass[indexEv] = mass[i];
                    indexEv++;
                }
            }
            System.out.println("Массив значения из четных ячеек " + Arrays.toString(oddMass));
            System.out.println("Массив значений из нечетных ячеек " + Arrays.toString(evenMass));
            System.out.println("Задача №4 завершена!");
        }
    }

    private static void task5(int mass[], int x) {
        System.out.println("Задача №5: ");
        System.out.println("Исходный массив " + Arrays.toString(mass));
        System.out.println("Значение x = " + x);
        boolean isValue = false;
        for (int value : mass) {
            if (value == x) {
                isValue = true;
                break;
            }
        }
        if (isValue == true) {
            System.out.println("Значение x присутствует в массиве");
        } else {
            System.out.println("Значение x отсутствует в массиве");
        }
        System.out.println("Задача №5 завершена!");
    }


    private static int scanNum() {
        System.out.println("\nВведите длину массива: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int[] randomArray() {
        Random random = new Random();
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(10, 99);
        }
        return mass;
    }

    private static boolean numValid(int num) {
        if (num <= 0) {
            System.out.println("Вы ввели отрицательное число!");
            return false;
        } else if (num > 0) {
            return true;
        }
        return true || false;
    }
}
