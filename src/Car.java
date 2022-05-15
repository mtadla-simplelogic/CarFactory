import java.util.List;

public class Car {
    private Producer producer;
    private boolean isAutomaticGear;
    private String segment;
    private Dimension dimension;
    private List<Country> countriesOfSale;

    public Car(Producer producer, boolean isAutomaticGear, String segment, Dimension dimension, List<Country> countriesOfSale) {
        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.segment = segment;
        this.dimension = dimension;
        this.countriesOfSale = countriesOfSale;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public String getSegment() {
        return segment;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public List<Country> getCountriesOfSale() {
        return countriesOfSale;
    }

    public void printAllData(){
        producer.printAllData();
        System.out.println("automatic: " + isAutomaticGear);
        System.out.println("segment: " + segment);
        dimension.printAllData();
        printAllCountries();
    }

    public void printAllCountries(){
        for (Country country : countriesOfSale){
            country.printAllData();
        }
    }
}
