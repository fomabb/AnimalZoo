package by.overone.lesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int feed;

        Zoo zoo = new Zoo();
        Wolf wolf = new Wolf();
        Giraffe giraffe = new Giraffe();
        Raccoon raccoon = new Raccoon();

        System.out.println("ДОБРО ПОЖАЛОВАТЬ В НАШ ЗООПАРК!;)");
        System.out.println("________________________________________________________");
        zoo.zoo();
        System.out.println();

        giraffe.name();
        giraffe.age();
        wolf.name();
        wolf.age();
        raccoon.name();
        raccoon.age();

        System.out.println("Сегодня  можно покормить питомцев зоопарка\n");

        while (true) {
            System.out.println("1. Волк; \n2. Жераф; \n3. Енот; \n4. Носорог; \n5. Зубр;");
            System.out.println("0. Окончить сеанс посещения зоопарка");

            feed = scanner.nextInt();

            if (feed >= 6) {
                System.out.println("Будь внимательнее, такой команды нет ¯\\_(ツ)_/¯\n");
                continue;
            }

            switch (feed) {
                case 1:
                    wolf.feed();
                    continue;

                case 2:
                    giraffe.feed();
                    continue;

                case 3:
                    raccoon.feed();
                    continue;

                case 0:
                    System.out.println("Спасибо, что посетили нас, приходите еще;) Удачи Вам!!!");
                    System.out.println("________________________________________________________");

            }
            break;
        }
    }
}

