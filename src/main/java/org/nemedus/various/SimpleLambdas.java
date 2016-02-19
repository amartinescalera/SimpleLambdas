package org.nemedus.various;


import org.nemedus.entities.Animal;
import org.nemedus.actions.CheckIfHopper;
import org.nemedus.actions.CheckTrait;
import org.nemedus.actions.CheckifSwim;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SimpleLambdas {
    public static void main (String[] args) {
        System.out.println("hola que haces?");

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, new CheckIfHopper());
        print(animals, new CheckifSwim());

        print(animals, a -> a.canSwim());
        print(animals, a -> !a.canSwim());
        print(animals, a -> a.canHop());
        print(animals, a -> !a.canHop());

        printPredicate(animals, a -> a.canSwim());
        printPredicate(animals, a -> !a.canSwim());
        printPredicate(animals, a -> a.canHop());
        printPredicate(animals, a -> !a.canHop());


        List<String> names = new ArrayList<>();
        names.add("Antonio");
        names.add("Carmelo");
        names.add("Enrique");
        names.add("Maria");

        names.removeIf(a -> a.charAt(0) == 'E');

        for (String name: names) {
            System.out.println(name);
        }
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal: animals) {
            if (checker.test(animal)) {
                System.out.println(animal + "");
            }
        }
        System.out.println();
    }

    private static void printPredicate(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal: animals) {
            if (checker.test(animal)) {
                System.out.println(animal + "");
            }
        }
        System.out.println();
    }
}