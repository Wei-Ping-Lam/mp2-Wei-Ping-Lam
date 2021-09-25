package AnimalExercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cat extends Animal {

    Cat() {
        super("Salmon");
        super.setAge(Integer.parseInt((new SimpleDateFormat("dd")).format(new Date())));
    }

    public String speak() {
        return "Meow";
    }
}
