package animals;

public class Dog extends animal{
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    public Dog() {
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

}
