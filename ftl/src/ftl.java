import animals.Cat;
import animals.Dog;

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



        Dog dog = new Dog();
        dog.gotostick(14);
        dog.whereTheDog();
        dog.gotostick(20);
        dog.whereTheDog();
        dog.gotostick(5);
        dog.whereTheDog();

        Dog homelessDog = Dog.ofHomeless(100);








        }




    }


