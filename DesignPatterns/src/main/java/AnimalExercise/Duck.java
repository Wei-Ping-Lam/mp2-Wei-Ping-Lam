package AnimalExercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Duck extends Animal {

    Duck(String backpack) {
        super(backpack);
        super.setAge(Integer.parseInt((new SimpleDateFormat("dd")).format(new Date())));
    }

    public String speak() {
        return "Quack";
    }
}
