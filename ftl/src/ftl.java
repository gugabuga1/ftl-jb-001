import L013.SwitchExample;
import L019.StringExample;
import L020.TypeConversion;
import animals.Cat;
import animals.Dog;
import animals.Duck;
import animals.MoveType;

import java.util.Arrays;
import java.util.LinkedList;
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

        List<Dog> dogs = Dog.randomArray();
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i));

        }
        List<Dog> dogsHomelles = Arrays.asList(new Dog[]{
                Dog.ofHomeless(2),
                Dog.ofHomeless(3),
                Dog.ofHomeless(5),
        });
        System.out.println(dogsHomelles.size());
        for (Dog dogItem : dogsHomelles) {
            System.out.println(dogItem);
            System.out.println(dogItem.getName());
        }
        List<Dog> dogsLinkenList = new LinkedList<>();
        dogsLinkenList.add(Dog.ofHomeless(10));
        dogsLinkenList.add(Dog.ofHomeless(10));
        dogsLinkenList.add(Dog.ofHomeless(10));
        dogsLinkenList.add(Dog.ofHomeless(10));
        dogsLinkenList.add(Dog.ofHomeless(10));

        int IndexLinkedList = 0;
        while (IndexLinkedList < dogsLinkenList.size()) {
            System.out.println(dogsLinkenList.get(IndexLinkedList));
            IndexLinkedList++;

        }
        for (int i = 0; i < 5; i++) {
            // SwitchExample.run();
        }
        System.out.println(duck.getMoveType());
        System.out.println(dog.getMoveType().getValue());

        if (dog.getMoveType() == MoveType.WALK)
            System.out.println("Может ходить");




        TypeConversion.run();
    }

}








