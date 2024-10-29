package task6.task1;

public class Money {
    private int rub;
    private int penn;


    public static boolean isNumValid(int rub, int penn) {
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

    public String printRub(int rub) {
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

    public int isCompare(int penn, int rub) {
        int rubForPenn = getRub() * 10 + getPenn();
        if(rubForPenn == rub * 10 + penn){
            System.out.println("Суммы равны");
            return 0;
        }
        if (rubForPenn < rub * 10 + penn) {
            System.out.println("Введенное число больше текущего");
            return 1;
        } else {
            System.out.println("Введенное число меньше текущего");
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Текущая сумма составляет: " + getRub() +
                "," + getPenn() + printRub(getRub()) + ", а именно: " + getRub() + printRub(getRub()) + " " + getPenn()
                + isPenn(getPenn()) + ".";
    }
}
