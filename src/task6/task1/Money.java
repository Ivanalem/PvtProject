package task6.task1;

import java.util.Scanner;

public class Money {
    private int rub;
    private int penn;

    public static int enterNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static boolean numValid(int rub, int penn) {
        if (rub < 0 || penn < 0 || penn >= 100) {
            System.out.println("Введено некорректное число");
            return true;
        } else {
            return false;
        }
    }

    public void setRub(int rub) {
        this.rub = rub;
    }

    public void setPenn(int penn) {
        this.penn = penn;
    }

    public int getRub() {
        return this.rub;
    }

    public int getPenn() {
        return this.penn;
    }

    public String isRub(int rub) {
        String str1 = "";
        if (rub % 2 == 0 || rub % 2 <= 6) {
            str1 = " рублей";
        } else {
            str1 = " рубля";
        }
        return str1;
    }

    public String isPenn(int penn) {
        String str1 = " копейки";
        if (penn % 2 == 0 || penn % 2 <= 6) {
            str1 = " копеек";
        }
        return str1;
    }

    public void sum(int rub, int penn) {
        this.rub += rub;
        this.penn += penn;
    }

    public void subtract(int rub, int penn) {
        this.rub -= rub;
        this.penn -= penn;
    }

    public void isCompare(int rub, int penn) {
        if(getRub() <= rub && getPenn() <= penn || getPenn() >= penn){
            System.out.println("Введенное число больше текущего");
        } else {
            System.out.println("Введенное число меньше текущего");

        }
    }

    @Override
    public String toString() {
        return "Текущая сумма составляет: " + getRub() +
                "," + getPenn() + isRub(getRub()) + ", а именно: " + getRub() + isRub(getRub()) + " " + getPenn()
                + isPenn(getPenn()) + ".";
    }
}
