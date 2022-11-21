package Wagon;
import Direction.Direction;
import Types.SpecTypes;
import Types.WagonsTypes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class RailwayCarriageEntrance {
    private Enum DEFAULT;
    private static final Direction HARKIV = new Direction("HARKIV", 0, 5030, 762, 63);
    private static final Direction KIEV = new Direction("KIEV", 1, 4500, 762, 63);
    private static final Direction ODESSA = new Direction("ODESA", 2, 5030, 762, 63);
    private static final Direction LVIV = new Direction("LVIV", 3, 5030, 762, 63);
    private static final Direction VINITSYA = new Direction("VINITSYA", 4, 5030, 762, 63);
    private static final Direction SUMY = new Direction("SUMY", 5, 4500, 762, 63);
    private static final Direction MIKOLAIV = new Direction("MIKOLAIV", 6, 4500, 762, 63);
    private static final Direction POLTAVA = new Direction("POLTAVA", 7, 5030, 762, 63);
    private static final Direction RIVNE = new Direction("RIVNE", 8, 5030, 762, 63);
    private static final Direction KIROVOGRAD = new Direction("KIROVOGRAD", 9, 4500, 762, 63);
    private static final Direction UJGOROD = new Direction("UJGOROD", 10, 5030, 762, 63);
    private static final Direction ZAPORIJJA = new Direction("ZAPORIJJA", 11, 5030, 762, 63);
    private static final Direction CHERNYGIV = new Direction("CHERNYGIV", 12, 4500, 762, 63);
    private Direction default_direction;


    private static final WagonsTypes SEMI_WAGON = new WagonsTypes("6","SEMI_WAGON", 23, 12.700, 70);
    private static final WagonsTypes COVERED = new WagonsTypes("2","COVERED", 26, 15.724, 68);
    private static final WagonsTypes PLATFORM = new WagonsTypes("4","PLATFORM", 23, 13.300, 71);
    private static final WagonsTypes TANK = new WagonsTypes("7","TANK", 27, 12.020, 67);
    private static final WagonsTypes HOPPER = new WagonsTypes("8","HOPPER", 23, 14.720, 77);
    private static final WagonsTypes PASSENGER = new WagonsTypes("0", "PASSENGER", 48, 26.696, 60);
    private WagonsTypes default_types;
    public static ArrayList<ArrayList<RailwayСarriage>> Entrance = new ArrayList<>();
    public static ArrayList<ArrayList<RailwayСarriage>> Reserve = new ArrayList<>();
    public void gettingBase() throws Exception {

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/compound",
                "postgres", "postgres");

        Statement stmt = con.createStatement();
        Statement stmt2 = con.createStatement();
        ResultSet size = stmt2.executeQuery("SELECT COUNT(*) FROM railway_group");
        size.next();
        int count = size.getInt(1);

        for (int i = 1; i <= count; i++) {
            ArrayList<RailwayСarriage> listBase = new ArrayList<>();
            ResultSet rs = stmt.executeQuery("SELECT * FROM railway_carriage WHERE railway_group_carriage = " + i);
            while (rs.next()) {
                System.out.println(rs.getLong(1) + ":" + rs.getString(2)
                        + ":" + rs.getString(3) + ":" + rs.getString(4)
                        + ":" + rs.getLong(5) + ":" + rs.getString(6));

                readingDirection(rs.getString(3));
                readingType(rs.getString(4));
                readingSpec(rs.getString(6));
                listBase.add(new RailwayСarriage(rs.getString(2), default_direction, default_types, default_types.getWeightWagons() + (int) rs.getLong(5), (SpecTypes) DEFAULT));
            }
            Entrance.add(listBase);
        }
    }
    public void readingSpec(String spec) {
        switch (spec) {
            case "CARGO":
                DEFAULT = SpecTypes.CARGO;
                break;
            case "FUEL":
                DEFAULT = SpecTypes.FUEL;
                break;
            case "GAS":
                DEFAULT = SpecTypes.GAS;
                break;
            case "EXPLOSIVES":
                DEFAULT = SpecTypes.EXPLOSIVES;
                break;
            case "PEOPLE":
                DEFAULT = SpecTypes.PEOPLE;
                break;
        }
    }

    public void readingType(String type) {
        switch (type) {
            case "SEMI_WAGON":
                default_types = SEMI_WAGON;
                break;
            case "COVERED":
                default_types = COVERED;
                break;
            case "PLATFORM":
                default_types = PLATFORM;
                break;
            case "TANK":
                default_types = TANK;
                break;
            case "HOPPER":
                default_types = HOPPER;
                break;
            case "PASSENGER":
                default_types = PASSENGER;
                break;
            default:
                default_types = SEMI_WAGON;
                break;
        }
    }
    public void readingDirection(String direction) {
        switch (direction) {
            case "HARKIV":
                default_direction = HARKIV;
                break;
            case "KIEV":
                default_direction = KIEV;
                break;
            case "ODESSA":
                default_direction = ODESSA;
                break;
            case "LVIV":
                default_direction = LVIV;
                break;
            case "VINITSYA":
                default_direction = VINITSYA;
                break;
            case "SUMY":
                default_direction = SUMY;
                break;
            case "MIKOLAIV":
                default_direction = MIKOLAIV;
                break;
            case "POLTAVA":
                default_direction = POLTAVA;
                break;
            case "RIVNE":
                default_direction = RIVNE;
                break;
            case "KIROVOGRAD":
                default_direction = KIROVOGRAD;
                break;
            case "UJGOROD":
                default_direction = UJGOROD;
                break;
            case "ZAPORIJJA":
                default_direction = ZAPORIJJA;
                break;
            case "CHERNYGIV":
                default_direction = CHERNYGIV;
                break;
        }
    }
         public void getInfoRazbor() {
             System.out.println("ARRIVAL TRAIN");
             System.out.print("<([_VL8_]_,");
             for (int i = 0; i < Entrance.size(); i++) {
                 System.out.print("_{");
                 for (int j = 0; j < Entrance.get(i).size(); j++) {
                     System.out.print("[_" + Entrance.get(i).get(j).getDirection().getNameDirections() +"_"+Entrance.get(i).get(j).getNumber() + "_]");
                 }
                 System.out.print("}_,");
             }
         }
    public void getInfoRezerv() {
        if (!Reserve.isEmpty()) {
            System.out.println("\nRESERVE");
            for (int i = 0; i < Reserve.size(); i++) {
                System.out.print("_{");
                for (int j = 0; j < Reserve.get(i).size(); j++) {
                    System.out.print("[_" + Reserve.get(i).get(j).getDirection().getNameDirections() +"_"+ Reserve.get(i).get(j).getNumber() +"_"+ Reserve.get(i).get(j).getLoadedWeight()+"_]");
                }
                System.out.println("}_,");
            }
        }
    }
}
