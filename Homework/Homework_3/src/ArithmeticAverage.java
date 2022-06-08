import java.util.Scanner;
public class ArithmeticAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Задание 2
        //Используя IntelliJ IDEA, создайте класс ArithmeticAverage.
        // Вычислите среднее арифметическое трех целочисленных значений и выведите его на экран.
        //С какой проблемой вы столкнулись? Какой тип переменных лучше
        // использовать для корректного отображения результата?

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();
        System.out.println((firstNumber + secondNumber + thirdNumber) / 3);
        // С проблемами не сталкивался. Я считаю, что лучше использовать тип данных double, так как при делении,
        // числа могут не поделиться нацело и будет не совсем корректный ответ, если использовать тип переменных
        // для целых чисел

    }
}
