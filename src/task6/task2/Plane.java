package task6.task2;

public class Plane extends Aircraft {
    private int capacity;
    private int weight;

    public Plane(int capacity, int weight) {
        super(capacity, weight);
        System.out.println("Самолет имеет: грузоподъемность " + weight + " вместимость " + capacity);
    }
}
