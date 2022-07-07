import animals.Cat;
import animals.Dog;
import animals.Duck;

import java.util.Arrays;
import java.util.List;

public class ftl {
    public static void main(String... args) {
//        HelloWorld.run();
//        POJO.run();
//
//
//
//
//
//        cat catvar = new cat();
//        catvar.voice();
//
//
//        L004.cat catL004 = new L004.cat();
//        catL004.voice();
        Cat cat = new Cat("Barsik", 20);
        System.out.println(cat.jumpHeight());
        cat.voice();



        Dog dog = new Dog();
        dog.gotostick(14);
        dog.whereTheDog();
        dog.gotostick(20);
        dog.whereTheDog();
        dog.gotostick(5);
        dog.whereTheDog();
        dog.voice();

        Dog homelessDog = Dog.ofHomeless(100);
        homelessDog.voice();
        Duck duck = new Duck();
        duck.voice();

        duck.takeOff();
        duck.isTheBridFlying();
        duck.showSpeed();

        duck.landing();
        duck.isTheBridFlying();
        duck.showSpeed();

        List<Dog> dogsHomelles = Arrays.asList(new Dog[]{
                Dog.ofHomeless(2),
                Dog.ofHomeless(3),
                Dog.ofHomeless(5),
        });
        System.out.println(dogsHomelles.size());
        System.out.println(dogsHomelles.get(0));
        System.out.println(dogsHomelles.get(1));
        System.out.println(dogsHomelles.get(2));
        List<Dog> dogs = Dog.randomArray();
        System.out.println(dogs.get(0));
        System.out.println(dogs.get(1));
        System.out.println(dogs.get(2));











        }




    }


