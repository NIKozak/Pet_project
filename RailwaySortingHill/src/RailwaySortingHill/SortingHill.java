package RailwaySortingHill;

import Types.SpecTypes;

import Wagon.RailwayCarriageEntrance;

import java.util.Scanner;
public class SortingHill {
    private Scanner scanner = new Scanner(System.in);
    private RailwayCarriageEntrance railwayCarriageEntrance = new RailwayCarriageEntrance();
    private InfoHill infoHill = new InfoHill();
    private static final Hill hill = new Hill(762,60, 5030,15);
    private boolean opportunity = false;
    private boolean opportunityReserv = false;
    private boolean specTypesSorting = true;
    private int sumWeight;
    private double sumLenght;
    private int sumAmount;
    private int sumWeightDirection;
    private double sumLenghtDirection;
    private int sumAmountDirection;
    private int sumWeightReserv;
    private double sumLeinghtReserv;
    private int sumAmountRezerv;
    private int sumPlanWeight;
    private double sumPlanLenght;
    private int sumPlanAmount;
    private boolean level1 = false;
    private boolean level2 = false;
    private boolean level3 = false;
    private boolean level4 = false;
    private int numberDirection;
    public SortingHill() {
    }
    public void clearValues(){
        sumWeight = 0;
        sumLenght = 0;
        sumAmount = 0;
        sumWeightDirection = 0;
        sumLenghtDirection = 0;
        sumAmountDirection = 0;
        sumWeightReserv = 0;
        sumLeinghtReserv = 0;
        sumAmountRezerv = 0;
        specTypesSorting = true;
        level1 = false;
        level2 = false;
        level3 = false;
        level4 = false;
    }
    public void dangerLevel() {

        if(level1 == true && level2 == true && level3 == true && level4 == true){
            specTypesSorting = true;
        }else {
            specTypesSorting = false;
        }
    }
    public void conditionsSortig(int i, String condition) {

        if(condition.equals("standart")) {
            numberDirection = railwayCarriageEntrance.Entrance.get(i).get(0).getDirection().getNumberDirections();
        }
        if(condition.equals("reserv")) {
            numberDirection = railwayCarriageEntrance.Reserve.get(i).get(0).getDirection().getNumberDirections();
        }
    }
    public void fuelGas(int i, SpecTypes types, String condition){
        conditionsSortig(i, condition);
        if(Hill.hill.get(numberDirection).isEmpty()) {
            specTypesSorting = true;
            return;
        }else if(!Hill.hill.get(numberDirection).isEmpty()) {
            if(!Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size() - 1).getSpecificationTypes().equals(types)
                    && !Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size() - 1).getSpecificationTypes().equals(SpecTypes.PEOPLE)
                    && !Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size() - 1).getSpecificationTypes().equals(SpecTypes.EXPLOSIVES)
            ){level1 = true;} else {level1 = false;}

            if(Hill.hill.get(numberDirection).size() > 2) {
                if(!Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size()-2).getSpecificationTypes().equals(types)
                        && !Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size()-2).getSpecificationTypes().equals(SpecTypes.EXPLOSIVES)
                ){level2 = true;} else {level2 = false;}
            }else {level2 = true;}

            if(Hill.hill.get(numberDirection).size() > 3) {
                if(!Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size()-3).getSpecificationTypes().equals(SpecTypes.EXPLOSIVES)
                ){level3 = true;} else {level3 = false;}
            }else {level3 = true;}

            if(Hill.hill.get(numberDirection).size() > 4) {
                if(!Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size()-4).getSpecificationTypes().equals(SpecTypes.EXPLOSIVES)
                ){level4 = true;} else {level4 = false;}
            }else {level4 = true;}

        }
        dangerLevel();
    }
    public void explosives(int i, String condition){
        conditionsSortig(i, condition);
        if(!Hill.hill.get(numberDirection).isEmpty() && Hill.hill.get(numberDirection).size() < 15) {
            if(!Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size() - 1).getSpecificationTypes().equals(SpecTypes.GAS)
                    && !Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size() - 1).getSpecificationTypes().equals(SpecTypes.PEOPLE)
                    && !Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size() - 1).getSpecificationTypes().equals(SpecTypes.FUEL)
            ){level1 = true;} else {level1 = false;}

            if(Hill.hill.get(numberDirection).size() > 2) {
                if(!Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size()-2).getSpecificationTypes().equals(SpecTypes.GAS)
                        && !Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size()-2).getSpecificationTypes().equals(SpecTypes.FUEL)
                        && !Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size()-2).getSpecificationTypes().equals(SpecTypes.PEOPLE)
                ){level2 = true;} else {level2 = false;}
            }else {level2 = false;}

            if(Hill.hill.get(numberDirection).size() > 3) {
                if(!Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size()-3).getSpecificationTypes().equals(SpecTypes.GAS)
                        && !Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size()-3).getSpecificationTypes().equals(SpecTypes.FUEL)
                        && !Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size()-3).getSpecificationTypes().equals(SpecTypes.PEOPLE)
                ){level3 = true;} else {level3 = false;}
            }else {level3 = false;}

            if(Hill.hill.get(numberDirection).size() > 4) {
                if(!Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size()-4).getSpecificationTypes().equals(SpecTypes.GAS)
                        && !Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size()-4).getSpecificationTypes().equals(SpecTypes.FUEL)
                        && !Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size()-4).getSpecificationTypes().equals(SpecTypes.PEOPLE)
                ){level4 = true;} else {level4 = false;}
            }else {level4 = false;}
        }
        dangerLevel();
    }
    public void people(int i, String condition){
        conditionsSortig(i, condition);
        if(Hill.hill.get(numberDirection).isEmpty()){
            specTypesSorting = true;
            return;
        }else if(!Hill.hill.get(numberDirection).isEmpty()) {
            if(!Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size() - 1).getSpecificationTypes().equals(SpecTypes.FUEL)
                    && !Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size() - 1).getSpecificationTypes().equals(SpecTypes.GAS)
                    && !Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size() - 1).getSpecificationTypes().equals(SpecTypes.EXPLOSIVES)
            ){level1 = true;} else {level1 = false;}

            if(Hill.hill.get(numberDirection).size() > 2){
                if(!Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size()-2).getSpecificationTypes().equals(SpecTypes.EXPLOSIVES)
                ){level2 = true;} else {level2 = false;}
            }else {level2 = true;}

            if(Hill.hill.get(numberDirection).size() > 3){
                if(!Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size()-3).getSpecificationTypes().equals(SpecTypes.EXPLOSIVES)
                ){level3 = true;} else {level3 = false;}
            }else {level3 = true;}

            if(Hill.hill.get(numberDirection).size() > 4){
                if(!Hill.hill.get(numberDirection).get(Hill.hill.get(numberDirection).size()-4).getSpecificationTypes().equals(SpecTypes.EXPLOSIVES)
                ){level4 = true;} else {level4 = false;}
            }else {level4 = true;}
            dangerLevel();
        }
    }

    public void auditSpecTypes(int i, String condition) {
        SpecTypes types = null;
        if(condition.equals("standart")) {
            types = railwayCarriageEntrance.Entrance.get(i).get(0).getSpecificationTypes();
        }
        if(condition.equals("reserv")) {
            types = railwayCarriageEntrance.Reserve.get(i).get(0).getSpecificationTypes();
        }
        switch (types) {
            case GAS:
                SpecTypes specTypesFuel = SpecTypes.FUEL;
                fuelGas(i, specTypesFuel, condition);
                break;
            case FUEL:
                SpecTypes specTypesGas = SpecTypes.GAS;
                fuelGas(i, specTypesGas, condition);
                break;
            case EXPLOSIVES:
                explosives(i, condition);
                break;
            case PEOPLE:
                people(i, condition);
                break;
            default:
                break;
        }
    }
//___________________________________________________________________________________________________________________________________
//__________________________________________Старт_сортировки_________________________________________________________________________
//___________________________________________________________________________________________________________________________________
    public void sortGroup() {
        while (!railwayCarriageEntrance.Entrance.isEmpty() || !railwayCarriageEntrance.Reserve.isEmpty()) {
            System.out.println("");
            clearValues();
            railwayCarriageEntrance.getInfoRazbor();
            System.out.println("");
            railwayCarriageEntrance.getInfoRezerv();
            infoHill.infoHill();

            if (!railwayCarriageEntrance.Entrance.isEmpty()) {

//_______________ИСХОДНЫЕ ВЕСА
                for (int i = 0; i < railwayCarriageEntrance.Entrance.get(0).size(); i++) {
                    sumWeight = sumWeight + railwayCarriageEntrance.Entrance.get(0).get(i).getLoadedWeight();
                    sumLenght = sumLenght + railwayCarriageEntrance.Entrance.get(0).get(i).getWagonsTypes().getLenghtWagons();
                    sumAmount = railwayCarriageEntrance.Entrance.get(0).size();
                }
                for (int i = 0; i < Hill.hill.get(railwayCarriageEntrance.Entrance.get(0).get(0).getDirection().getNumberDirections()).size(); i++) {
                    sumWeightDirection = sumWeightDirection + Hill.hill.get(railwayCarriageEntrance.Entrance.get(0).get(0).getDirection().getNumberDirections()).get(i).getLoadedWeight();
                    sumLenghtDirection = sumLenghtDirection + Hill.hill.get(railwayCarriageEntrance.Entrance.get(0).get(0).getDirection().getNumberDirections()).get(i).getWagonsTypes().getLenghtWagons();
                    sumAmountDirection = Hill.hill.get(railwayCarriageEntrance.Entrance.get(0).get(0).getDirection().getNumberDirections()).size();
                }
                if(!railwayCarriageEntrance.Reserve.isEmpty()) {
                    for (int i = 0; i < railwayCarriageEntrance.Reserve.size(); i++) {
                        for (int j = 0; j < railwayCarriageEntrance.Reserve.get(i).size(); j++) {
                            sumWeightReserv = sumWeightReserv + railwayCarriageEntrance.Reserve.get(i).get(j).getLoadedWeight();
                            sumLeinghtReserv = sumLeinghtReserv + railwayCarriageEntrance.Reserve.get(i).get(j).getWagonsTypes().getLenghtWagons();
                        }
                        sumAmountRezerv = sumAmountRezerv + railwayCarriageEntrance.Reserve.get(i).size();
                    }
                    //System.out.println("RESERV " + sumWeightReserv + " " + sumLeinghtReserv + " " + sumAmountRezerv);
                }
                auditSpecTypes(0, "standart");

//______________СОСТАВ

                if (specTypesSorting == true
                &&(sumWeightDirection + sumWeight) <= RailwayCarriageEntrance.Entrance.get(0).get(0).getDirection().getMaxWeightDirection()
                && (sumLenghtDirection + sumLenght) <= RailwayCarriageEntrance.Entrance.get(0).get(0).getDirection().getMaxLenghtDirection()
                && (sumAmountDirection + sumAmount) <= RailwayCarriageEntrance.Entrance.get(0).get(0).getDirection().getMaxAmountDirection()
                ) {

                    System.out.println("Sorting is plan");

                    for (int j = 0; j < railwayCarriageEntrance.Entrance.get(0).size(); j++) {
                        Hill.hill.get(railwayCarriageEntrance.Entrance.get(0).get(0).getDirection().getNumberDirections()).add(railwayCarriageEntrance.Entrance.get(0).get(j));
                    }

                    railwayCarriageEntrance.Entrance.remove(0);

                } else {
//_______________________________________________________________________________________________________________________________________
                //ПЛАНИРОВАНИЕ на возможность нахождения впереди вагонов для формирования состава
//_______________________________________________________________________________________________________________________________________

                    System.out.println("The direction is almost full " + railwayCarriageEntrance.Entrance.get(0).get(0).getDirection().getNameDirections());

                    for (int i = 0; i < railwayCarriageEntrance.Entrance.size(); i++) {
                        for (int j = 0; j < railwayCarriageEntrance.Entrance.get(i).size(); j++) {
                            sumPlanWeight = sumPlanWeight + railwayCarriageEntrance.Entrance.get(i).get(j).getLoadedWeight();
                            sumPlanLenght = sumPlanLenght + railwayCarriageEntrance.Entrance.get(i).get(j).getWagonsTypes().getLenghtWagons();
                            sumPlanAmount = sumPlanAmount + railwayCarriageEntrance.Entrance.get(i).size();
                        }
                        if (sumPlanWeight <= railwayCarriageEntrance.Entrance.get(0).get(0).getDirection().getMaxWeightDirection() - sumWeightDirection
                        && sumPlanLenght <= railwayCarriageEntrance.Entrance.get(0).get(0).getDirection().getMaxLenghtDirection() - sumLenghtDirection
                        && sumPlanAmount <= railwayCarriageEntrance.Entrance.get(0).get(0).getDirection().getMaxAmountDirection() - sumAmountDirection
                        ) {
                            System.out.println("There are still wagons for completion");
                            opportunity = true;
                        }
                        sumPlanWeight = 0;
                        sumPlanLenght = 0;
                        sumPlanAmount = 0;
                    }
//_______________________________________________________________________________________________________________________________________
                //РЕЗЕРВ если по Планированию возможно формировать состав, резерв заполняется
//_______________________________________________________________________________________________________________________________________

                    System.out.println(sumAmountRezerv);
                    if (opportunity == true
                    && (sumWeightReserv + sumWeight) <= hill.getMaxWeight()
                    && (sumLeinghtReserv + sumLenght) <= hill.getMaxLenght()
                    && (sumAmountRezerv + sumAmount) <= hill.getMaxAmount()
                    ) {
                            railwayCarriageEntrance.Reserve.add(railwayCarriageEntrance.Entrance.get(0));
                            railwayCarriageEntrance.Entrance.remove(0);

                    } else {
                        if(opportunityReserv == false) {
                            System.out.println("There is no plan-reserv are directions filled need to send directions Enter Y");
                            if (scanner.nextLine().equals("Y")) {
                                Hill.hill.get(railwayCarriageEntrance.Entrance.get(0).get(0).getDirection().getNumberDirections()).clear();
                            }
                        }
                    }

                }
                opportunity = false;
            }
            opportunityReserv = false;
            clearValues();

//_______________________________________________________________________________________________________________________________________
            //Перепроверка РЕЗЕРВА на возможность формировки состава из резерва
// _______________________________________________________________________________________________________________________________________

            if(!railwayCarriageEntrance.Reserve.isEmpty()) {

                for (int i = 0; i < railwayCarriageEntrance.Reserve.size(); i++) {

                    for (int j = 0; j < railwayCarriageEntrance.Reserve.get(i).size(); j++) {
                        sumWeight = sumWeight + railwayCarriageEntrance.Reserve.get(i).get(j).getLoadedWeight();
                        sumLenght = sumLenght + railwayCarriageEntrance.Reserve.get(i).get(j).getWagonsTypes().getLenghtWagons();
                        sumAmount = railwayCarriageEntrance.Reserve.get(i).size();
                    }

                    for (int j = 0; j < Hill.hill.get(railwayCarriageEntrance.Reserve.get(i).get(0).getDirection().getNumberDirections()).size(); j++) {
                        sumWeightReserv = sumWeightReserv + Hill.hill.get(railwayCarriageEntrance.Reserve.get(i).get(0).getDirection().getNumberDirections()).get(j).getLoadedWeight();
                        sumLeinghtReserv = sumLeinghtReserv + Hill.hill.get(railwayCarriageEntrance.Reserve.get(i).get(0).getDirection().getNumberDirections()).get(j).getWagonsTypes().getLenghtWagons();
                    }
                    sumAmountRezerv = Hill.hill.get(railwayCarriageEntrance.Reserve.get(i).get(0).getDirection().getNumberDirections()).size();

                    auditSpecTypes(i, "reserv");

                        if (specTypesSorting == true
                        && (sumWeightReserv + sumWeight) <= RailwayCarriageEntrance.Reserve.get(i).get(0).getDirection().getMaxWeightDirection()
                        && (sumLeinghtReserv + sumLenght) <= RailwayCarriageEntrance.Reserve.get(i).get(0).getDirection().getMaxLenghtDirection()
                        && (sumAmountRezerv + sumAmount) <= RailwayCarriageEntrance.Reserve.get(i).get(0).getDirection().getMaxAmountDirection()
                        ) {
                            System.out.println("Replenishment from the reserve");
                            opportunityReserv = true;
                            for (int j = 0; j < railwayCarriageEntrance.Reserve.get(i).size(); j++) {
                            Hill.hill.get(railwayCarriageEntrance.Reserve.get(i).get(0).getDirection().getNumberDirections()).add(railwayCarriageEntrance.Reserve.get(i).get(j));
                        }
                            RailwayCarriageEntrance.Reserve.remove(i);
                        }
                        sumWeight = 0;
                        sumLenght = 0;
                        sumAmount = 0;
                }
            }
        }
    }
}
