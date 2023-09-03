public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 1100;

        int bonus;
        if (payment >= 1000) {
            bonus = payment / 100 ;
        } else {
            bonus = 0;
        }

        System.out.println(balance + payment + bonus);
    }
}