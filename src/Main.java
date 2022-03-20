public class Main {
    public static void main(String[] args) {

        int account = 200; // количество денег на счете клинта
        int payment = 1200; // сумма пополнения счета


        int percent = (payment > 1000) ? 1 : 0;// проверка необходимости начисления бонусов
        int bonus = payment * percent / 100;// расчет суммы бонуса
        int balance = account + payment + bonus;// расчет итогового счета с учетом бонусов
        // на экран.
        System.out.println(bonus);
        System.out.println(balance);
    }
}


