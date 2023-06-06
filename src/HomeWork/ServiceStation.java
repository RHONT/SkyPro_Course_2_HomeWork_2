package HomeWork;

import java.util.Objects;

// нужен контроль над выполнением
public class ServiceStation {
    public void check(WheelTransport wheelTransport) {

        if (wheelTransport != null) {

            String categoryForWork= wheelTransport.getCategory();

            if (categoryForWork.equals("A")) {
                diagnostic((Bicycle) wheelTransport);

            } else if (categoryForWork.equals("B")) {
                diagnostic((Car) wheelTransport);

            } else if (categoryForWork.equals("C")); {
                diagnostic((Truck) wheelTransport);
            }
        }
    }

    private void wheelsWork(MachineGod machineGod){
        for (int i = 0; i < machineGod.getWheelsCount(); i++) {
            machineGod.updateTyre();
        }
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {System.out.println("Проверяем прицеп");}

    private void diagnostic(Bicycle bicycle){
        wheelsWork(bicycle);
    }

    private void diagnostic(Car car){
        wheelsWork(car);
        checkEngine();
    }

    private void diagnostic(Truck truck){
        wheelsWork(truck);
        checkEngine();
        checkTrailer();
    }

}
