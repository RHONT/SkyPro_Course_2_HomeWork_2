package HomeWork.Transport_Class;

import HomeWork.AbstractClass.MachineGod;

public class Car extends MachineGod {
    public Car(String modelName) {
        super(modelName);
        setWheelsCount(4);
    }

    @Override
    public void check() {
        updateTyre();
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    private void updateTyre(){
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }
}
