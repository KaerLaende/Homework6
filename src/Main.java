public class Main {
    public static void main(String[] args) {
        //Циклы.Часть 1
        System.out.println("Задание 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println();

        //Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        for (int i = 2; i < 17; i=i+2) {
            System.out.println(i);
        }
        System.out.println();

        //Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println();

        //Задание 5
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i=i+4) {
            System.out.println(i+" год является високосным.");
        }
        System.out.println();

        //Задание 6
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i=i+7) {
            System.out.println(i);
        }
        System.out.println();

        //Задание 7
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i=i*2) {
            System.out.println(i);
        }
        System.out.println();

        //Задание 8
        System.out.println("Задание 8");
        int deposit =29000;
        int total =0;
        for (int i = 0; i <= 12; i++) {
            total=total+deposit;
            System.out.println("Месяц " +i+", сумма накоплений равна "+total+" рублей");
        }
        System.out.println();

        //Задание 9
        System.out.println("Задание 8");
        int deposit1 =29000;
        int totalUp =0;
        for (int i = 0; i <= 12; i++) {
            totalUp=totalUp+totalUp/100;
            totalUp=totalUp+deposit1;
            System.out.println("Месяц " +i+", сумма накоплений равна "+totalUp+" рублей");
        }
        System.out.println();

        //Задание 10
        System.out.println("Задание 10");
        int two =2;
        int result;
        for (int i = 1; i <= 10; i++) {
            result=i*two;
            System.out.println(two+"*"+i+"="+result);
        }
            System.out.println();


    }
}