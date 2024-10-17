package task6.task2;

public class Airline extends Aircraft {
    Aircraft[] numAircraft;

    public Airline(Aircraft[] numAircraft) {
        this.numAircraft = numAircraft;
    }

    public Aircraft[] getNumAirCraft() {

        return numAircraft;
    }

    public int getFullCapacity() {
        int sumCapacity = 0;
        for (Aircraft airline : numAircraft) {
            sumCapacity += airline.getCapacity();
        }
        return sumCapacity;
    }

    public int getFullWeight() {
        int sumWeight = 0;
        for (Aircraft airline : numAircraft) {
            sumWeight += airline.getWeight();
        }
        return sumWeight;
    }

    public void chooseAircraft(int enterParam, int enterParam2) {
        for (Aircraft airline : numAircraft) {
            if (airline.getWeight() > enterParam && airline.getWeight() < enterParam2) {
                System.out.println("Подходящий самолет со следующими характеристиками: " + airline);
            }
        }
    }

    @Override
    public String toString() {
        return "Airline{" +
                " общая грузоподъемность: " + getFullWeight() +
                ", общая вместимость: " + getFullCapacity() + '}';
    }
}