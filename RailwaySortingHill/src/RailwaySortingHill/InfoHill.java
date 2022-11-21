package RailwaySortingHill;

public class InfoHill {

    private int infoWeight;
    private double infoLenght;
    private int infoAmount;

    private int numberDirection;
    private Hill HILL = new Hill();

    public void сonclusionInfo() {
        System.out.println("Total weight : " + infoWeight + " Total lenght :" + (int)infoLenght + " Total amount :" + infoAmount);
        infoWeight = 0;
        infoLenght = 0;
        infoAmount = 0;
    }

    public void sumInfo(int i, int number) {
        if(!HILL.hill.get(number).isEmpty()){
            HILL.hill.get(number).get(i).getInfoDirection();
            infoWeight = infoWeight + HILL.hill.get(number).get(i).getLoadedWeight();
            infoLenght = infoLenght + HILL.hill.get(number).get(i).getWagonsTypes().getLenghtWagons();
            infoAmount = HILL.hill.get(number).size();
        }
    }

    public void infoHill() {
        System.out.println("\nHARKIV_____________________________________________________");
        for (int i = 0; i < HILL.hill.get(0).size(); i++) {
            numberDirection = 0;
            sumInfo(i, numberDirection);
        }
        сonclusionInfo();

        System.out.println("\nKIEV_______________________________________________________");
        for (int i = 0; i < HILL.hill.get(1).size(); i++) {
            numberDirection = 1;
            sumInfo(i, numberDirection);
        }
        сonclusionInfo();

        System.out.println("\nODESA______________________________________________________");
        for (int i = 0; i < HILL.hill.get(2).size(); i++) {
            numberDirection = 2;
            sumInfo(i, numberDirection);
        }
        сonclusionInfo();

        System.out.println("\nLVIV_______________________________________________________");
        for (int i = 0; i < HILL.hill.get(3).size(); i++) {
            numberDirection = 3;
            sumInfo(i, numberDirection);
        }
        сonclusionInfo();

        System.out.println("\nVINITSYA___________________________________________________");
        for (int i = 0; i < HILL.hill.get(4).size(); i++) {
            numberDirection = 4;
            sumInfo(i, numberDirection);
        }
        сonclusionInfo();

        System.out.println("\nSUMY_______________________________________________________");
        for (int i = 0; i < HILL.hill.get(5).size(); i++) {
            numberDirection = 5;
            sumInfo(i, numberDirection);
        }
        сonclusionInfo();

        System.out.println("\nMIKOLAIV___________________________________________________");
        for (int i = 0; i < HILL.hill.get(6).size(); i++) {
            numberDirection = 6;
            sumInfo(i, numberDirection);
        }
        сonclusionInfo();
        System.out.println("");

     //   System.out.println("\nPOLTAVA____________________________________________________");
     //
     //   System.out.println("\nRIVNE______________________________________________________");
      //
     //   System.out.println("\nKIROVOGRAD_________________________________________________");
     //
    //    System.out.println("\nUJGOROD____________________________________________________");
     //
     //   System.out.println("\nZAPORIJJA__________________________________________________");
     //
     //   System.out.println("\nCHERNYGIV__________________________________________________");
     //
    }

}
