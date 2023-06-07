package HomeWork;

public class Car extends MachineGod{
    public Car(String modelName) {
        super(modelName);
        setWheelsCount(4);
    }

    @Override
    public void check() {
        wheelsWork();
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
