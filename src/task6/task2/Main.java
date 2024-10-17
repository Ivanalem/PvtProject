package task6.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(90, 40000);
        Quadcopter quadcopter = new Quadcopter(15, 500);
        Helicopter helicopter = new Helicopter(50, 20000);
        Aircraft[] numAircraft = {plane, helicopter, quadcopter};
        Airline airline = new Airline(numAircraft);
        airline.getFullCapacity();
        airline.getFullWeight();
        System.out.println(airline);
        int enterNum = Aircraft.enterParam();
        if (Aircraft.paramValid(enterNum)) {
            System.out.println("Введено некорректное число");
        } else {
            airline.chooseAircraft(enterNum, Aircraft.enterParam());
        }
    }
}
