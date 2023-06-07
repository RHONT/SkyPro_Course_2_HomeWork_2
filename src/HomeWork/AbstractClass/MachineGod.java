package HomeWork.AbstractClass;

import HomeWork.Interfaces.SelfCheckTransport;

public abstract class MachineGod  implements SelfCheckTransport {
    private final String modelName;
    protected int wheelsCount;

    public MachineGod(String modelName) {
        this.modelName = modelName;
    }
    public MachineGod(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount=wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

}
