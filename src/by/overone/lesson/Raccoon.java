package by.overone.lesson;

public class Raccoon extends Animals {

    @Override
    public void name() {
        super.name();
        name = "Кунка";
        System.out.println("наш самый молодой и смелый парень по имени " + name + " он любит очень детей");
    }

    @Override
    public void age() {
        super.age();
        age = 1;
        System.out.println("ему всего-лишь " + age + " годик\n");
    }

    @Override
    public void feed() {
        super.feed();
        if (feeding == 1) {
            System.out.println("~~~" + name + " берет в лапки косочек мясо, уносит в норку и возвращается назад, и громко пищит~~~\n");
        } else if (feeding == 2) {
            System.out.println("~~~" + name + " начинает бегать по клетке и кричит~~~\n");
        } else if (feeding == 3) {
            System.out.println("~~~" + name + " начинает кушать и кружиться с кусочками хрустящего корма~~~\n");
        } else {
            System.out.println("~~~Ну же, не бойся, покорми животное~~~\n");
        }
    }
}
