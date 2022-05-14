public class Dimension {
    private int high;
    private int width;
    private int trankCapacity;

    public Dimension(int high, int width, int trankCapacity) {
        this.high = high;
        this.width = width;
        this.trankCapacity = trankCapacity;
    }

    public int getHigh() {
        return high;
    }

    public int getWidth() {
        return width;
    }

    public int getTrankCapacity() {
        return trankCapacity;
    }

    public void printAllData(){
        System.out.println("Dimension: " + high + " " + width + " " + trankCapacity);
    }
}
