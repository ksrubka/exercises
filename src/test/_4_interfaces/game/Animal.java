package test._4_interfaces.game;

import test._4_interfaces.game.eating.EatingStrategy;
import test._4_interfaces.game.moving.MovingStrategy;

import static test._4_interfaces.game.moving.Moving.*;

/**
 * Created by Beata Iłowiecka on 14.06.16.
 */
public class Animal {

    String name;
    EatingStrategy eat;
    MovingStrategy go;

    public Animal(String name, EatingStrategy eat, MovingStrategy go) {
        this.name = name;
        this.eat = eat;
        this.go = go;
    }

    String eat() {
        return eat.eat();
    }

    String eat(String meal) {
        return eat.eat(meal);
    }

    String go() {
        return go.go();
    }

    public String toString(){
        return "name: " + name + "\n" + go() + "\n" + eat() + "\n";
    }

    public static void main(String[] args) {

        Animal horse = AnimalFactory.create("horse", "grass", RUN);
        Animal dog = AnimalFactory.create("dog", "meat", RUN);
        Animal clownfish = AnimalFactory.create("Nemo", "algae", SWIM);
        Animal lion = AnimalFactory.create("lion", "zebra", RUN);

        System.out.println(horse);
        System.out.println(dog);
        System.out.println(clownfish);
        System.out.println(lion);

        System.out.println(dog.eat("bunny"));
        System.out.println(horse.eat("algae")); // :)
        System.out.println(dog.eat());
        System.out.println(dog.eat("deer"));
        System.out.println(dog.eat("mouse"));
        System.out.println(lion.eat("dog"));
    }
}
