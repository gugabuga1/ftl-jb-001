import L013.SwitchExample;
import L019.StringExample;
import L020.TypeConversion;
import L026.FileExample;
import L027.ThreadExample;
import L028.House;
import animals.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ftl {
    public static void main(String... args) throws IOException {

    }

    {
//        HelloWorld.run();
//        POJO.run();
//
//        cat catvar = new cat();
//        catvar.voice();
//
//
//        L004.cat catL004 = new L004.cat();
//        catL004.voice();
        Cat cat = new Cat("Barsik", new animal.AnimalWeight(3, animal.AnimalWeight.WeightType.KG));
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

        Dog homelessDog = Dog.ofHomeless(new animal.AnimalWeight(100, animal.AnimalWeight.WeightType.KG));
        homelessDog.voice();
        Duck duck = new Duck();
        duck.voice();


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
                Dog.ofHomeless(new animal.AnimalWeight(3, animal.AnimalWeight.WeightType.KG)),
                Dog.ofHomeless(new animal.AnimalWeight(3, animal.AnimalWeight.WeightType.KG)),
                Dog.ofHomeless(new animal.AnimalWeight(5, animal.AnimalWeight.WeightType.KG))
        });
        System.out.println(dogsHomelles.size());
        for (Dog dogItem : dogsHomelles) {
            System.out.println(dogItem);
            System.out.println(dogItem.getName());
        }
        List<Dog> dogsLinkenList = new LinkedList<>();
        dogsLinkenList.add(Dog.ofHomeless(new animal.AnimalWeight(10, animal.AnimalWeight.WeightType.KG)));
        dogsLinkenList.add(Dog.ofHomeless(new animal.AnimalWeight(10, animal.AnimalWeight.WeightType.KG)));
        dogsLinkenList.add(Dog.ofHomeless(new animal.AnimalWeight(10, animal.AnimalWeight.WeightType.KG)));
        dogsLinkenList.add(Dog.ofHomeless(new animal.AnimalWeight(10, animal.AnimalWeight.WeightType.KG)));
        dogsLinkenList.add(Dog.ofHomeless(new animal.AnimalWeight(10, animal.AnimalWeight.WeightType.KG)));

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

        if (dog.getMoveType() == MoveType.WALK){
            System.out.println("?????????? ????????????");
        }


        TypeConversion.run();
        StringExample.run();



        dog.setWeight(new animal.AnimalWeight(10, animal.AnimalWeight.WeightType.KG));
        try {
            dog.getWeight().setValue(-10);
        }catch (animal.WeightException ignore) {
        }
        FileExample.run();


        ThreadExample.run();
        


        House house = new House.Builder()
                .optHasFancyStatues(true)
                .build();
        System.out.println(house.toString());
        House houseFull = new House.Builder()
                .optHasFancyStatues(true)
                .optHasGarage(true)
                .optHasSwimmingPool(true)
                .optHasGarden(true)
                .build();
        System.out.println(houseFull.toString());


    }
}
















