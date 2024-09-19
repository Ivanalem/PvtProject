package task3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        task1();
        print();
        task2();
        print();
        task3();
        print();
        task4();
        print();
        task5();

    }

    private static void task1() { // Task1
        System.out.println("Задание № 1");
        System.out.println("Введите положительное трехзначное число: ");
        int scP = scanNum();
        int deliver1 = (scP / 100) * 100;
        int deliver2 = ((scP / 10) % 10) * 10;
        int deliver3 = scP % 10;
        System.out.println("Введенное число " + scP + " имеет вид: " + deliver1 + "+" + deliver2 + "+" + deliver3);
    }

    private static void task2() {//Степень четности
        System.out.println("Задание № 2");
        System.out.println("Введите положительное трехзначное число: ");
        int scP = scanNum();
        int deliver1 = (scP / 100);
        int deliver2 = (scP / 10) % 10;
        int deliver3 = scP % 10;
        //Проверка на четность
        int count = 0;
        if (deliver1 % 2 == 0) {
            count++;
        }
        if (deliver2 % 2 == 0) {
            count++;
        }
        if (deliver3 % 2 == 0) {
            count++;
        }
        System.out.println("Введено число: " + scP + ", степень его четности составляет: " + count);
    }


    private static void task3() {
        System.out.println("Задание № 3");
        System.out.println("Введите положительное трехзначное число: ");
        int scP = scanNum();
        int deliver1 = (scP / 100);
        int deliver3 = scP % 10;
        if (deliver1 == deliver3) {
            System.out.println("Введенное число " + scP + " является симметричным, т.к первая " + deliver1 +
                    " и последняя " + deliver3 + " цифра - равны");
        } else {
            System.out.println("Введенное число " + scP + " не является симметричным, т.к первая " + deliver1 +
                    " и последняя " + deliver3 + " цифра - не равны");
        }
    }


    private static void task4() {
        System.out.println("Задание № 4");
        System.out.println("Введите значение первого трехзначного числа: ");
        int firstSide = scanNum();
        System.out.println("Введите значение второго трехзначного числа: ");
        int secondSide = scanNum();
        System.out.println("Введите значение третьего трехзначного числа: ");
        int thirdSide = scanNum();
        if (firstSide < 100 || firstSide >= 1000 || secondSide < 100 || secondSide >= 1000 || thirdSide < 100 || thirdSide >= 1000) {
            System.out.println("Введено некорректное число, попробуйте снова!");
        } else {
            if ((firstSide + secondSide) > thirdSide || (firstSide + thirdSide) > secondSide || (secondSide + thirdSide) > firstSide) {
                System.out.println("Введенные числа могут являтся сторонами треугольника");
            } else {
                System.out.println("Введенные числа не могут являться сторонами треугольника");
            }
        }
    }

    private static void task5() {
        System.out.println("Задание № 5");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите порядковый номер месяца: ");
        int scP = sc.nextInt();
        String month = switch (scP) {
            case 1 -> "месяц Январь, сезон Зима";
            case 2 -> "месяц Февраль, сезон Зима";
            case 3 -> "месяц Март, сезон Весна";
            case 4 -> "месяц Апрель, сезон Весна";
            case 5 -> "месяц Май, сезон Весна";
            case 6 -> "месяц Июнь, сезон Лето";
            case 7 -> "месяц Июль, сезон Лето";
            case 8 -> "месяц Август, сезон Лето";
            case 9 -> "месяц Сентябрь, сезон Осень";
            case 10 -> "месяц Октябрь, сезон Осень";
            case 11 -> "месяц Ноябрь, сезон Осень";
            case 12 -> "месяц Декабрь, сезон Зима";
            default -> "месяца с таким значением не существует!";
        };
        System.out.println("Порядковый номер месяца: " + scP + " Расшифровка номера: " + month);
    }

    private static int scanNum() {
        Scanner sc = new Scanner(System.in);
        int scP = sc.nextInt();
        if (scP < 100 || scP >= 1000) {
            System.out.println("Введено некорректное число, попробуйте снова!");
        }
        return scP;
    }


    private static void print() {
        System.out.println("=========================================================");
        System.out.println("Задание выполнено, перехожу к выполнению следующей задачи!");
        System.out.println("=========================================================");
    }
}









