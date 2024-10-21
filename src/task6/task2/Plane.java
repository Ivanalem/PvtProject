package task6.task2;

public class Plane extends Aircraft {

    public Plane(int capacity, int weight) {
        super(capacity, weight);
        System.out.println("Самолет имеет: грузоподъемность " + weight + " вместимость " + capacity);
    }
}
