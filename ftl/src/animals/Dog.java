package animals;

import java.util.ArrayList;
import java.util.List;

public class Dog extends animal{
    public Dog(String name, AnimalWeight weigh) {
        super(name, weight, MoveType.WALK);
    }

    public Dog() {
        super(MoveType.WALK);

    }
   public static List<Dog> randomArray(){
        List<Dog> dogs = new ArrayList<>();

        dogs.add(Dog.of("Sharick", new AnimalWeight(3, AnimalWeight.WeightType.KG)));
        dogs.add(Dog.of("Bubble", new AnimalWeight(1, AnimalWeight.WeightType.KG)));
        dogs.add(Dog.of("Tuzik", new AnimalWeight(5, AnimalWeight.WeightType.KG)));

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
    public static Dog of(String name, AnimalWeight weight) {
        return new Dog(name, weight);

    }
    public static Dog ofHomeless(AnimalWeight weight) {
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
