public class Main {
    public static void main(String[] args) {
        int amount = 6_000;
        // стоимость билета
        int roublesPerMile = 20;
        // кол-во рублей для начисления 1 мили
        int bonus = amount / roublesPerMile;
        // расчет бонуса
        System.out.println(bonus);
        // вывод на экран
    }
}