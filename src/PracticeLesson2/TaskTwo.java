package PracticeLesson2;

import java.sql.SQLOutput;

public class TaskTwo {
    public static void main(String[] args) {
        //Найти сумму и произведение двух чисел
        byte a = 15, b = 20;
        byte sum = (byte) (a+b);
        byte compos = (byte) (a*b);
        System.out.println("Сумма чисел: "+sum + " Произведение двух чисел: " + compos);

        //Вычислить 20+(-3)*5/8

        byte comp = 20 + (-3)* 5/8;
        System.out.println("Вычислено: "+comp);

        //вывести последнюю цифру числа 31

        byte num = 31%10;
        System.out.println("Последняя цифра числа: "+num); //(остаток от деления)
        String number = "31"; //Возможно ли так?
        System.out.println("Последняя цифра числа: "+ number.charAt(1));


        //Вывести 3-юю цифру 5-значного числа 54324
        int count = (54324/100)%10;
        System.out.println("третяя цифра числа 54324: "+count);

        // Найти сумму цифр ab+cd числа abcd

        int abcd = 1345;
        int sumNumber = 0;
        for(int j=0; abcd !=0 ; j++){
            sumNumber += abcd%10;
            abcd /=10;
        }
        System.out.println("Сумма чисел ab+cd = "+sumNumber);


        //Найти площадь и периметр круга, r=7.5

        int s = (int)Math.round(Math.PI * Math.pow(7.5,2));
        int perim = (int)Math.round(Math.PI * 7.5);

        System.out.println("Площадь круга: " + s + " Периметр круга: " + perim);

        //Найти среднее арифметическое пяти чисел
        int coun = 0;
        int deliver = 0;
        int [] mass  ={34,51,64,45,76};
        for(int i = 0; i<mass.length;i++){
            coun += mass[i];
            deliver = coun/mass.length;

        }
        System.out.println("Сумма чисел в массиве: "+deliver);



    }
}
