package HomeWork.Transport_Class;

import HomeWork.AbstractClass.MachineGod;

public class Car extends MachineGod {
    public Car(String modelName) {
        super(modelName);
        setWheelsCount(4);
    }

    @Override
    public void check() {
        updateTyre(getWheelsCount());
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
