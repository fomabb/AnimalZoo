package by.overone.lesson;

public class Giraffe extends Animals {

    @Override
    public void name() {
        super.name();
        name = "Ёё";
        System.out.println("познакомьтесь, наш жерафик " + name);
    }

    @Override
    public void age() {
        super.age();
        age = 5;
        System.out.println("ему исаолнилось уже " + age + " лет\n");
    }

    @Override
    public void feed() {
        super.feed();
        if (feeding == 1) {
            System.out.println("~~~" + name + " начинает издавать громкий звук и качать головой как маятник~~~\n");
        } else if (feeding == 2) {
            System.out.println("~~~" + name + " благодарит кормящего наклоняя голову к нему облизываая его языком~~~\n");
        } else if (feeding == 3) {
            System.out.println("~~~" + name + " наклоняет голову к корму, громко выдыхает через нос и просит жалобно другую еду~~~\n");
        } else {
            System.out.println("~~~Ну же, не бойся, покорми животное~~~\n");
        }
    }
}

