package AnimalExercise;

public class AnimalFactory {

    public static Animal create(AnimalType type){
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("DUCK")) {
            return new Duck();
        } else if (type.equalsIgnoreCase("DOG")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("COW")) {
            return new Cow();
        } else if (type.equalsIgnoreCase("CAT")) {
            return new Cat();
        }
        return null;
    }
}
