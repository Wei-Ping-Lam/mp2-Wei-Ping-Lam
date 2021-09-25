package AnimalExercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalFactory {

    public static Animal create(AnimalType type){
        Animal animal = null;
        switch (type) {
            case Duck:
                animal = new Duck("Rice");
                animal.setAge(Integer.parseInt((new SimpleDateFormat("dd")).format(new Date())));
                break;

            case Dog:
                animal = new Dog("Bone");
                animal.setAge(Integer.parseInt((new SimpleDateFormat("dd")).format(new Date())));
                break;

            case Cow:
                animal = new Cow("Grass");
                animal.setAge(Integer.parseInt((new SimpleDateFormat("dd")).format(new Date())));
                break;

            case Cat:
                animal = new Cat("Salmon");
                animal.setAge(Integer.parseInt((new SimpleDateFormat("dd")).format(new Date())));
                break;

            default:
                break;
        }
        return animal;
    }
}
