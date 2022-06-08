public class LogicOperations {
    public static void main(String[] args) {

        // Задание 3
        // Используя IntelliJ IDEA, создайте класс LogicOperations. Имеется 3 переменные
        // типа int x = 5, y = 10, и z = 15;
        // Выполните и рассчитайте результат следующих операций для этих переменных:
        // x += y >> x++ * z;
        // z = ++x & y * 5;
        // y /= x + 5 | z;
        // z = x++ & y * 5;
        // x = y << x++ ^ z;

        int x = 5, y = 10, z = 15;
        x += y >> x ++ * z;
        System.out.println(x);
        z = ++x & y * 5;
        System.out.println(z);
        y /= x + 5 | z;
        System.out.println(y);
        z = x++ & y * 5;
        System.out.println(z);
        x = y << x++ & z;
        System.out.println(x);



    }
}
