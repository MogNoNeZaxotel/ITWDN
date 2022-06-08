import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {

        //Задание 5
        //Используя IntelliJ IDEA, создайте класс Rectangle. Создайте две целочисленные переменные и задайте им
        // некоторые значения. Применяя технику вложенных циклов, нарисуйте прямоугольник из звездочек.
        // Используйте значения ранее созданных переменных для указания высоты и ширины прямоугольника.

//        Scanner sc = new Scanner(System.in);


        for (int i = 1; i < 10; i++) {

            for (int j = 0; j < 20; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
