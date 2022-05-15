import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producer audi = new Producer("audi", "a5");
        Producer bmw = new Producer("bmw", "5");
        Producer ford = new Producer("ford", "mustang");

        Country poland = new Country("Poland", 'P');
        Country england = new Country("England", 'E');
        Country france = new Country("France", 'F');
        Country germany = new Country("Germany", 'G');

        Dimension dimensionSmall = new Dimension(1,2,3);
        Dimension dimensionBig = new Dimension(3,4,5);

        List<Country> audiCountrySale = new ArrayList<>();
        List<Country> bmwCountrySale = new ArrayList<>();
        List<Country> fordCountrySale = new ArrayList<>();

        audiCountrySale.add(germany);
        audiCountrySale.add(france);

        bmwCountrySale.add(germany);
        bmwCountrySale.add(poland);

        fordCountrySale.add(england);
        fordCountrySale.add(france);

        Car audiA5 = new Car(audi, true, "premium", dimensionSmall, audiCountrySale);
        Car bmw5 = new Car(bmw, false, "premium", dimensionSmall, bmwCountrySale);
        Car fordMustang = new Car(ford, false, "premium", dimensionBig, fordCountrySale);

        Factory factory = new Factory();
        factory.addCar(audiA5);
        factory.addCar(bmw5);
        factory.addCar(fordMustang);

        factory.printCountryNameFor("bmw", false, 3);
        System.out.println("==========================");
        factory.printAllData();

    }
}