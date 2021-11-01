package by.overone.lesson;

public class Bison extends Animals {

    @Override
    public void name() {
        super.name();
        name = "Зурдан";
        System.out.println("имя этого крепиша  " + name);
    }

    @Override
    public void age() {
        super.age();
        age = 16;
        System.out.println("он самый старый наш друг, ему " + age + " лет\n");
    }

    @Override
    public void feed() {
        super.feed();
        if (feeding == 1) {
            System.out.println("~~~" +name + " медлено разварачивается и уходит в сторону и очнь громко мычит~~~\n");
        } else if (feeding == 2) {
            System.out.println("~~~" +name + " начинает громко хрустеть травой и очеь радоваться~~~\n");
        } else if (feeding == 3) {
            System.out.println("~~~" +name + " выдыхает носом, роет копытом землю и мычит~~~\n");
        } else {
            System.out.println("~~~Ну же, не бойся, покорми животное~~~\n");
        }
    }
}
