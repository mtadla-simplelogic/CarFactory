import java.util.List;

public class Factory {
    private List<Car> cars;

    public void addCar(Car car) {
        cars.add(car);
    }

    public void printAllData() {
        for (Car car : cars) {
            car.printAllData();
        }
    }

    public void printCountryNameFor(String producentName, boolean isAutomaticGear, int trankCapacity) {
        for (Car car : cars) {
            if (car.getProducent().getName().equals(producentName) && car.isAutomaticGear() == isAutomaticGear
                    && car.getDimension().getTrankCapacity() == trankCapacity) {
                car.printAllCountries();
            }
        }
    }

}
