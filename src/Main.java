public class Main {
    public static void main(String[] args){
        //Задача 1
        System.out.println("задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Итерация переменной " + i);
        }
        //задача 2
        System.out.println("задача 2");
        for (int l = 10; l > 0; l--) {
            System.out.println("Интерация переменной " + l);
        }
        //задача 2
        System.out.println("задача 3");
        for (int r = 2; r <= 17; r = r + 2) {
            System.out.println("Четное число " + r);
        }
        // задача 4
        System.out.println("задача 4");
        for (int t = 10; t >= -10; t--) {
            System.out.println(t);
        }
        // задача 5
        System.out.println("задача 5");
        for (int g = 1904; g <= 2096; g = g + 4) {
            System.out.println(g + " год явдяется высокосным");
        }
        // задача 6
        System.out.println("задача 6");
        for (int p = 7; p <= 98; p = p + 7) {
            System.out.println(p);
        }
        //задача 7
        System.out.println("задача 7");
        for (int e = 1; e <= 512; e = e * 2){
            System.out.println(e);
        }
        //задача 8
        System.out.println("задача 8");
        int sum = 0;
        int deposit = 29000;
        for (int month = 1; month <= 12; month++) {
            sum = sum + deposit;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
        }
        //задача 9
        System.out.println("задача 9");
        int money = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + money;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);
        // задача 10
        System.out.println("задача 10");
        for (int i=1; i<=10; i++) {
            System.out.println("2 x " + i + " = " + 2 * i);
        }
    }
}