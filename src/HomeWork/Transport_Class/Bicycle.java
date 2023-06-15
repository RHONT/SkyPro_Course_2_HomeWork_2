package HomeWork.Transport_Class;

import HomeWork.AbstractClass.MachineGod;

public class Bicycle extends MachineGod {

    public Bicycle(String modelName) {
        super(modelName);
        setWheelsCount(2);
    }

    @Override
    public void check() {
        updateTyre(getWheelsCount());
    }

}
