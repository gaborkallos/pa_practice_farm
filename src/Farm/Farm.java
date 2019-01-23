package Farm;

import Plants.Plants;

import java.util.List;


public class Farm {
    private String name;
    private String location;
    private int week;
    private List<Plants> plants;
    private boolean spruceRotted;
    private boolean almondRotted;

    public Farm(String name, String location, int week) {
        this.name = name;
        this.location = location;
        this.week = week;
    }

    public void addPlants(Plants plant){
        plants.add(plant);
    }

    public void monthlyReport(){
        //TODO: implement it

    }
}
