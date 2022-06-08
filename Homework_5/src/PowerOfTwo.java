import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {

        //Задание 5
        //Известно, что у чисел, которые являются степенью двойки, только один бит имеет значение 1.
        // Используя IntelliJ IDEA, создайте класс PowerOfTwo. Напишите программу, которая будет выполнять проверку –
        // является ли указанное число степенью двойки или нет. Указанное число является степенью двойки

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a != 0 && (a & (a - 1)) == 0) {
            System.out.println("Указанное число является степенью двойки");
        }
         else {
            System.out.println("Указанное число не является степенью двойки");
        }
    }
}
