package RailwaySortingHill;

import Wagon.RailwayСarriage;

import java.util.ArrayList;

public class Hill {

    private int maxLenght;
    private int maxAmount;
    private int maxWeight;
    private int maxSizeDangerCargo;

    public Hill(int maxLenght, int maxAmount, int maxWeight, int maxSizeDangerCargo) {
        this.maxLenght = maxLenght;
        this.maxAmount = maxAmount;
        this.maxWeight = maxWeight;
        this.maxSizeDangerCargo = maxSizeDangerCargo;
    }

    public int getMaxLenght() {
        return maxLenght;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getMaxSizeDangerCargo() {
        return maxSizeDangerCargo;
    }

    public Hill(){

    }

    public static ArrayList<ArrayList<RailwayСarriage>> hill = new ArrayList<>();

    {    //Можно так
        //for (int i = 0; i < 13; i++) {
        //    hill.add(new ArrayList<RailwayСarriage>());
       // }

        //для наглядности
        ArrayList<RailwayСarriage> HARKIV = new ArrayList<>();
        ArrayList<RailwayСarriage> KIEV = new ArrayList<>();
        ArrayList<RailwayСarriage> ODESSA = new ArrayList<>();
        ArrayList<RailwayСarriage> LVIV = new ArrayList<>();
        ArrayList<RailwayСarriage> VINITSYA = new ArrayList<>();
        ArrayList<RailwayСarriage> SUMY = new ArrayList<>();
        ArrayList<RailwayСarriage> MIKOLAIV = new ArrayList<>();
        ArrayList<RailwayСarriage> POLTAVA = new ArrayList<>();
        ArrayList<RailwayСarriage> RIVNE = new ArrayList<>();
        ArrayList<RailwayСarriage> KIROVOGRAD = new ArrayList<>();
        ArrayList<RailwayСarriage> UJGOROD = new ArrayList<>();
        ArrayList<RailwayСarriage> ZAPORIJJA = new ArrayList<>();
        ArrayList<RailwayСarriage> CHERNYGIV = new ArrayList<>();

        hill.add(HARKIV);
        hill.add(KIEV);
        hill.add(ODESSA);
        hill.add(LVIV);
        hill.add(VINITSYA);
        hill.add(SUMY);
        hill.add(MIKOLAIV);
        hill.add(POLTAVA);
        hill.add(RIVNE);
        hill.add(KIROVOGRAD);
        hill.add(UJGOROD);
        hill.add(ZAPORIJJA);
        hill.add(CHERNYGIV);
    }
}
