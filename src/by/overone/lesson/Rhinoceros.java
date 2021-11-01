package by.overone.lesson;

public class Rhinoceros extends Animals {

    @Override
    public void name() {
        super.name();
        name = "Рокстади";
        System.out.println("вот и наш суровый носорог рог-рог " + name + " у него огромный рог");
    }

    @Override
    public void age() {
        super.age();
        age = 9;
        System.out.println("Ему уже " + age + "-ый год\n");
    }

    @Override
    public void feed() {
        super.feed();
        if (feeding == 1) {
            System.out.println("~~~" + name + " начинает рогом откидывать куски мяса, рыть землю и сапеть носом~~~\n");
        } else if (feeding == 2) {
            System.out.println("~~~" + name + " издает не громкий звук и чавкая кушает травку~~~\n");
        } else if (feeding == 3) {
            System.out.println("~~~" + name + " видно, что ему нравится, он кушает корм и роет передней лапкой землю~~~\n");
        } else {
            System.out.println("~~~Ну же, не бойся, покорми животное~~~\n");
        }
    }
}
