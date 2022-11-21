package Types;

public class WagonsTypes {
    private String numberWagons;
    private String nameWagons;
    private int weightWagons;
    private double lenghtWagons;
    private int maxСarryingWeight;

    public WagonsTypes(String numberWagons, String nameWagons, int weightWagons, double lenghtWagons, int maxСarryingWeight) {
        this.numberWagons = numberWagons;
        this.nameWagons = nameWagons;
        this.weightWagons = weightWagons;
        this.lenghtWagons = lenghtWagons;
        this.maxСarryingWeight = maxСarryingWeight;
    }

    public String getNumberWagons() {
        return numberWagons;
    }

    public String getNameWagons() {
        return nameWagons;
    }

    public int getWeightWagons() {
        return weightWagons;
    }

    public double getLenghtWagons() {
        return lenghtWagons;
    }

    public int getMaxСarryingWeight() {
        return maxСarryingWeight;
    }
}
