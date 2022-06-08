import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Conversion {
    //Задание 3
    //Используя IntelliJ IDEA, создайте класс Conversion. Напишите программу, которая будет выполнять
    // конвертирование валют. Пользователь вводит: сумму денег в определенной валюте, курс для конвертации в
    // другую валюту. Организуйте вывод результата операции конвертирования валюты на экран.

    static double dollar (double money_You_have, double exchange_Rate, String first_Name_of_rates, String second_Name_of_rates ) {
        double money_After_change = money_You_have * exchange_Rate;
        return money_After_change;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название валюты которую хотите конвертировать: ");
        String first_Name_of_rates = sc.next();
        System.out.println("Введите сумму денег в валюте, которую хотите конвертировать: ");
        double sum = sc.nextDouble();
        System.out.println("Введите название валюты В которую хотите конвертировать: ");
        String second_Name_of_rates = sc.next();
        System.out.println("Введите курс для конвертации: ");
        double change = sc.nextDouble();
        System.out.println("в итоге Вы получите: " + dollar(sum, change, first_Name_of_rates, second_Name_of_rates));


    }
}
