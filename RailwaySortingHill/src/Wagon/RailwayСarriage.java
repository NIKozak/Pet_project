package Wagon;

import Direction.Direction;
import Types.SpecTypes;
import Types.WagonsTypes;

public class RailwayСarriage {

    private String number;
    private Direction direction;
    private WagonsTypes wagonsTypes;
    private int loadedWeight;
    private SpecTypes specificationTypes;

    public RailwayСarriage(String number, Direction direction, WagonsTypes wagonsTypes, int loadedWeight, SpecTypes specificationTypes) {
        this.number = number;
        this.direction = direction;
        this.wagonsTypes = wagonsTypes;
        this.loadedWeight = loadedWeight;
        this.specificationTypes = specificationTypes;
    }

    public String getNumber() {
        return number;
    }

    public Direction getDirection() {
        return direction;
    }

    public WagonsTypes getWagonsTypes() {
        return wagonsTypes;
    }

    public SpecTypes getSpecificationTypes() {
        return specificationTypes;
    }

    public int getLoadedWeight() {
        return loadedWeight;
    }


    public void getInfoDirection(){
            System.out.print(getNumber() + " ");
            System.out.print(getDirection().getNumberDirections() + " ");
            System.out.print(getDirection().getNameDirections() + " ");
            System.out.print(getDirection().getMaxWeightDirection() + " ");
            System.out.print(getDirection().getMaxLenghtDirection() + " ");
            System.out.print(getDirection().getMaxAmountDirection() + " ");
            System.out.print(getWagonsTypes().getNumberWagons() + " ");
            System.out.print(getWagonsTypes().getNameWagons() + " ");
            System.out.print(getWagonsTypes().getLenghtWagons() + " ");
            //System.out.print(getWagonsTypes().getWeightWagons() + "-");
            System.out.print("["+getLoadedWeight() + "] ");
            //System.out.print(getWagonsTypes().getMaxСarryingWeight() + " ");
            System.out.print(getSpecificationTypes() + " \n");

    }
}
