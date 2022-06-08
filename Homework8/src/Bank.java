import java.util.Scanner;
public class Bank {
    //Задание 2
    //Используя IntelliJ IDEA, создайте класс Bank. Представьте, что вы реализуете программу для банка,
    // которая помогает определить, погасил ли клиент кредит или нет. Допустим, ежемесячная сумма платежа должна
    // составлять 100 грн. Клиент должен выполнить 7 платежей, но может платить реже большими суммами. Т.е., может
    // двумя платежами по 300 и 400 грн. Закрыть весь долг.   ||Создайте метод, который будет в качестве аргумента
    // принимать сумму платежа, введенную экономистом банка. Метод выводит на экран информацию о состоянии кредита
    // (сумма задолженности, сумма переплаты, сообщение об отсутствии долга).
    static void Payment (int money) {
        int credit = 700;
        int duty = credit - money;
        int overpayment = money - credit;
        if (money > credit) {
            System.out.println("Переплата склала: " + overpayment);
        }
        else if(money == credit) {
            System.out.println("Кредит погашено!");
        }
        else {
            System.out.println("Заборгованість складає: " + duty);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        Payment(money);
    }
}
