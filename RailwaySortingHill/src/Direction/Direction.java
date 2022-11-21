package Direction;

public class Direction {
    private String nameDirections;
    private int numberDirections;
    private int maxWeightDirection;
    private double maxLenghtDirection;
    private int maxAmountDirection;
    public Direction(String nameDirections, int numberDirections, int maxWeightDirection, double maxLenghtDirection, int maxAmountDirection) {
        this.nameDirections = nameDirections;
        this.numberDirections = numberDirections;
        this.maxWeightDirection = maxWeightDirection;
        this.maxLenghtDirection = maxLenghtDirection;
        this.maxAmountDirection = maxAmountDirection;
    }

    public String getNameDirections() {
        return nameDirections;
    }

    public int getNumberDirections() {
        return numberDirections;
    }

    public int getMaxWeightDirection() {
        return maxWeightDirection;
    }

    public double getMaxLenghtDirection() {
        return maxLenghtDirection;
    }

    public int getMaxAmountDirection() {
        return maxAmountDirection;
    }
}