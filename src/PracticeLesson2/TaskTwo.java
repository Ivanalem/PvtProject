package PracticeLesson2;

import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args) {
        //Найти сумму и произведение двух чисел
        int a = 15, b = 20;
        int sum =  a+b;
        int compos = a*b;
        System.out.println("Сумма чисел: "+sum + " Произведение двух чисел: " + compos);

        //Вычислить 20+(-3)*5/8

        double comp = 20 + (-3)* 5/8f;
        System.out.println("Вычислено: "+comp);

        //вывести последнюю цифру числа 31
        int num = 31%10;
        System.out.println("Последняя цифра числа: "+num); //(остаток от деления)
        int numberint = 31;
        String numStr = Integer.toString(numberint);
        System.out.println("Последняя цифра числа: "+ numStr.charAt(1));//вывод через строку


        //Вывести 3-юю цифру 5-значного числа 54324
        int count = (54324/100)%10;
        System.out.println("третяя цифра числа 54324: "+count);

        // Найти сумму цифр ab+cd числа abcd

        String abcd = "1345";
        int strAbcd = Integer.parseInt(abcd);
        int strAb = strAbcd/100;
        int strCd = strAbcd%100;
        int sumAbCd = strAb+strCd;
        System.out.println("Сумма чисел ab + cd: "+sumAbCd);



        //Найти площадь и периметр круга, r=7.5

        double s = Math.round(Math.PI * Math.pow(7.5,2));
        double perim = Math.round(Math.PI * 7.5);
        System.out.println("Площадь круга: " + s + " Периметр круга: " + perim);

        //Найти среднее арифметическое пяти чисел
        int [] mass  ={34,51,64,45,76};
        int sumMass = Arrays.stream(mass).sum();
        int deliver = sumMass/mass.length;
        System.out.println("Сумма чисел в массиве: "+deliver);



    }
}
