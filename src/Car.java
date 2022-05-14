import java.util.List;

public class Car {
    private Producent producent;
    private boolean isAutomaticGear;
    private String segment;
    private Dimension dimension;
    private List<Country> countriesOfSale;

    public Car(Producent producent, boolean isAutomaticGear, String segment, Dimension dimension, List<Country> countriesOfSale) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.segment = segment;
        this.dimension = dimension;
        this.countriesOfSale = countriesOfSale;
    }

    public Producent getProducent() {
        return producent;
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
        producent.printAllData();
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
