package animals;

import javax.naming.Name;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Dog extends animal{
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    public Dog() {
        this.canFly = false;
    }
   public static List<Dog> randomArray(){
        List<Dog> dogs = new ArrayList<>();

        dogs.add(Dog.of("Sharick", 3));
        dogs.add(Dog.of("Bubble", 1));
        dogs.add(Dog.of("Tuzik", 5));

        return dogs;

   }



    /**
     * Идем до позиции палки,чтобы дойти до палки, нужно определить разницу между текущей позицией и позицией палки
     * @param stickPosition позиция палки
     */
    public void gotostick(Integer stickPosition){
        Integer delta = stickPosition - this.currentPosition;
        this.runForward(delta);

    }
    public void whereTheDog(){
        System.out.println(this.currentPosition);
    }
    public static Dog of(String name, Integer weight) {
        return new Dog(name, weight);

    }
    public static Dog ofHomeless(Integer weight) {
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }
    @Override
    public void voice(){
        System.out.println("wow");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", currentPosition=" + currentPosition +
                '}';
    }
}
