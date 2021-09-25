package AnimalExercise;

public class AnimalFactory {

    public static Animal create(AnimalType type){
        Animal animal = null;
        switch (type) {
            case Duck:
                animal = new Duck("Rice");
                break;

            case Dog:
                animal = new Dog("Bone");
                break;

            case Cow:
                animal = new Cow("Grass");
                break;

            case Cat:
                animal = new Cat("Salmon");
                break;

            default:
                break;
        }
        return animal;
    }
}
