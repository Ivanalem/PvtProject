package task6.task1;

public class Main extends Money {
    public static void main(String[] args) {
        Money money = new Money();
        System.out.println("Введите количество рублей: ");
        money.setRub(enterNum());
        System.out.println("Введите количество копеек: ");
        money.setPenn(enterNum());
        if (!Money.numValid(money.getRub(), money.getPenn())) {
            System.out.println(money);
            System.out.println("Введите количество рублей и копеек для сложения: ");
            money.sum(enterNum(), enterNum());
            System.out.println(money);
            System.out.println("Введите количество рублей и копеек для вычитания: ");
            money.subtract(enterNum(), enterNum());
            System.out.println(money);
            System.out.println("Введите количество рублей и копеек для сравнения: ");
            money.isCompare(enterNum(), enterNum());
        } else {
            System.out.println("программа не может продолжить работу");
        }
    }
}
