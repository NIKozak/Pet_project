
import Direction.Direction;
import RailwaySortingHill.Hill;
import RailwaySortingHill.InfoHill;
import RailwaySortingHill.SortingHill;
import Wagon.RailwayCarriageEntrance;
import Wagon.RailwayСarriage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        System.out.println("HELLO RAILWAY SORTING HILL");
        RailwayCarriageEntrance railwayCarriageEntrance = new RailwayCarriageEntrance();
        try {
            railwayCarriageEntrance.gettingBase();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        SortingHill sortingHill = new SortingHill();
        sortingHill.sortGroup();
        InfoHill infoHill = new InfoHill();
        infoHill.infoHill();
    }
}