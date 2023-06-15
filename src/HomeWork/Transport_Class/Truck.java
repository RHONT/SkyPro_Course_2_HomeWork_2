package HomeWork.Transport_Class;

import HomeWork.AbstractClass.MachineGod;

public class Truck extends MachineGod {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        updateTyre(getWheelsCount());
        checkEngine();
        checkTrailer();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    private void checkTrailer() {System.out.println("Проверяем прицеп");}
}
