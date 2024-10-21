package task6.task2;

import java.util.Scanner;

public abstract class Aircraft {
    private int capacity;
    private int weight;

    public Aircraft(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    protected Aircraft() {
    }

    public static int enterParam() {
        System.out.println("Наша авиакомпания осуществляет грузоперевозки от 500 кг до 40000 кг");
        System.out.println("Чтобы подобрать нужный транспорт, введите грузоподъемность: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static boolean paramValid(int enterParam) {
        if (enterParam <= 0) {
            System.out.println("Введено некорректное число");
            return true;
        } else {
            return false;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
