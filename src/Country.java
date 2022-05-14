public class Country {
    private String countryName;
    private char countrySign;

    public Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }

    public String getCountryName() {
        return countryName;
    }

    public char getCountrySign() {
        return countrySign;
    }

    public void printAllData(){
        System.out.println("Country: " + countryName + " " + countrySign);
    }
}
