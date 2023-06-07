package HomeWork;

public class Bicycle extends MachineGod {

    public Bicycle(String modelName) {
        super(modelName);
        setWheelsCount(2);
    }

    @Override
    public void check() {
        wheelsWork();
    }
}
