package task6.task2;

public class Quadcopter extends Aircraft {

    public Quadcopter(int capacity, int weight) {
        super(capacity, weight);
        System.out.println("Квадрокоптер имеет: грузоподъемность " + weight + " вместимость " + capacity);
    }

}
