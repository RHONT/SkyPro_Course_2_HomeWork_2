package HomeWork;

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

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    protected void wheelsWork(){
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

}
