package by.overone.lesson;

import java.util.Scanner;

public abstract class Animals {
    Scanner scanner = new Scanner(System.in);

    String name;
    String feed;
    int feeding;
    int age;

    public void name() {
        this.name = name;
    }

    public void age() {
        this.age = age;
    }

    public void feed() {
        this.feed = feed;
        System.out.println("кормить животное по имени " + name);

        System.out.println("1. Мясом; \n2. Травой; \n3. Сухим кормом.");

        feeding = scanner.nextInt();

        if (feeding >= 4) {
            System.out.println("У нас только такой корм");
        }

        switch (feeding) {
            case 1:
                String meat = "мясом";
                return;

            case 2:
                String tr = "Травой";
                return;

            case 3:
                String sx = "Сухим кормом";
                return;

        }
        System.out.println();
    }
}
