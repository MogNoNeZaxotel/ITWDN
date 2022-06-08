import java.util.Scanner;
public class Translator {
    public static void main(String[] args) {

        //Задание 4
        //Используя IntelliJ IDEA, создайте класс Translator. Напишите программу русско-английский переводчик.
        // Программа знает 10 слов о погоде. Требуется, чтобы пользователь вводил слово на русском языке,
        // а программа давала ему перевод этого слова на английском языке. Если пользователь ввел слово, для которого
        // отсутствует перевод, то следует вывести сообщение, что такого слова нет.


        Scanner sc = new Scanner(System.in);
        String weather = sc.next();
        if (weather.equals("Дождь"))
            System.out.println("Rain");
        else if (weather.equals("Снег"))
            System.out.println("Snow");
        else if (weather.equals("Град"))
            System.out.println("Hail");
        else if (weather.equals("Душно"))
            System.out.println("Stuffy ");
        else if (weather.equals("Холодно"))
            System.out.println("Cold ");
        else if (weather.equals("Тепло"))
            System.out.println("Warm ");
        else if (weather.equals("Жарко"))
            System.out.println("Hot ");
        else if (weather.equals("Зябко"))
            System.out.println("Chilly");
        else if (weather.equals("Морозно"))
            System.out.println("Frosty ");
        else if (weather.equals("Солнечно"))
            System.out.println("Sunny ");
        else System.out.println("Такого слова нет!");



    }
}
