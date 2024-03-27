public class Main {
    public static void main(String[] args) {
        // Exercise 1
for (int i = 1; i < 11; i++) {
    System.out.println(i);
}
        // Exercise 2
for (int i = 10; i > 0; i--) {
    System.out.println(i);
}
        // Exercise 3
for (int i = 0; i < 18; i = i + 2) {
    System.out.println(i);
}
        // Exercise 4
for (int i = 10; i > -11; i--) {
    System.out.println(i);
}
        // Exercise 5
for (int i = 1904; i <= 2096; i = i + 4) {
    System.out.println(i);
}
        // Exercise 6
for (int i = 7; i < 99; i = i + 7) {
    System.out.println(i);
}
        // Exercise 7
for (int i = 1; i <= 512; i = i * 2) {
    System.out.println(i);
}
        // Exercise 8
        var salary = 29000;
for (int i = 1; i <=12; i++) {
    System.out.println("Месяц " + i + " сумма накоплений равна " + i * salary + " рублей.");
}
        // Exercise 9
        var salary1 = 29000;
        int salaryAdjusted = 0;
        for (int i = 1; i <=12; i++) {
            salaryAdjusted = salaryAdjusted + salaryAdjusted/100;
            salaryAdjusted = salaryAdjusted + salary1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + salaryAdjusted + " рублей.");
        }
        // Exercise 10
        for (int i = 0; i <= 20; i = i + 2) {
            System.out.println(i);
        }
    }
}