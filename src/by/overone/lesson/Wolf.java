package by.overone.lesson;

public class Wolf extends Animals {

    @Override
    public void name() {
        super.name();
        name = "Грыка";
        System.out.println("вот волченок по кличке " + name);
    }

    @Override
    public void age() {
        super.age();
        age = 3;
        System.out.println("ему исплнилось " + age + " годика\n");
    }

    @Override
    public void feed() {
        super.feed();
        if (feeding == 1) {
            System.out.println("~~~" + name + " начинает скулить, размахивать хвостиком и просит еще добавки завывая~~~\n");
        } else if (feeding == 2) {
            System.out.println("~~~" + name + " рычит и ходит туда обратно по клетке~~~\n");
        } else if (feeding == 3) {
            System.out.println("~~~" + name + " ест не хотя и лает~~~\n");
        } else {
            System.out.println("~~~Ну же, не бойся, покорми животное~~~\n");
        }
    }
}
