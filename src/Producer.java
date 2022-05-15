public class Producer {
    private String name;

    private String model;

    public Producer(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public void printAllData(){
        System.out.println("Producer: " + name + " " + model);
    }
}
