package ComputerExercise;

public class Keyboard extends ComputerPeripheral{

    public Keyboard(Computer computer) {
        super(computer);
    }

    @Override
    public String run() {
        return super.run();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with keyboard";
    }
}
