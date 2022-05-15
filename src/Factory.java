import java.util.ArrayList;
import java.util.List;

public class Factory {
    private List<Car> cars;

    public Factory() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void printAllData() {
        for (Car car : cars) {
            car.printAllData();
            System.out.println(">>>>=========");
        }
    }

    public void printCountryNameFor(String producentName, boolean isAutomaticGear, int trankCapacity) {
        for (Car car : cars) {
            if (car.getProducer().getName().equals(producentName) && car.isAutomaticGear() == isAutomaticGear
                    && car.getDimension().getTrankCapacity() == trankCapacity) {
                car.printAllCountries();
            }
        }
    }

}
