package HomeWork.Interfaces;

public interface SelfCheckTransport {
    void check();
    default void updateTyre(int AmountWheels){
        for (int i = 0; i < AmountWheels; i++) {
            System.out.println("Меняем покрышку");
        }

    }

}
