package task9.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    String nameBuyer;
    int numberInLine;
    List<Pet> petList;

    public Order(String nameBuyer, int numberInLine) {
        this.petList = new ArrayList<>();
        this.nameBuyer = nameBuyer;
        this.numberInLine = numberInLine;
    }

    public String getNameBuyer() {
        return nameBuyer;
    }

    public void addPet(Pet... pets) {
        petList.addAll(Arrays.asList(pets));
    }

    public void removePet(Pet pet) {
        petList.remove(pet);
    }

    public int getSum() {
        int sum = 0;
        for (int i = 0; i < petList.size(); i++) {
            sum = Integer.parseInt(sum + petList.get(i).getNickName());
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Order{" +
                "nameBuyer='" + nameBuyer + '\'' +
                ", numberInLine=" + numberInLine +
                ", petList=" + petList +
                '}';
    }
}
