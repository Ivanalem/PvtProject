package task6.task2;

public class Helicopter extends Aircraft {
    public Helicopter(int capacity, int weight) {
        super(capacity, weight);
        System.out.println("Вертолет имеет: грузоподъемность " + weight + " вместимость " + capacity);
    }
}
