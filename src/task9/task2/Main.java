package task9.task2;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Кот", "Барсик");
        Pet pet2 = new Pet("Cобака", "Артемон");
        Pet pet3 = new Pet("Попугай", "Кеша");
        Pet pet4 = new Pet("Шиншила", "Олег");
        Pet pet5 = new Pet("Хомяк", "Валера");

        Nursery nursery = new Nursery("МинскийПитомник1");
        Order order1 = new Order("Миша", 1);
        order1.addPet(pet1, pet2);

        Order order2 = new Order("Петя", 2);
        order2.addPet(pet3, pet4);

        Order order3 = new Order("Виталий", 3);
        order3.addPet(pet5);
        nursery.addOrder(order1, order2, order3);
        nursery.removeOrder("Миша");
        System.out.println(nursery);
    }
}
