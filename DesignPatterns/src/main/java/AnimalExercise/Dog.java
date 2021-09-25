package AnimalExercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dog extends Animal {

    Dog() {
        super("Bone");
        super.setAge(Integer.parseInt((new SimpleDateFormat("dd")).format(new Date())));
    }

    public String speak() {
        return "Woof";
    }
}
