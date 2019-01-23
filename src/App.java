import Farm.Farm;
import Plants.Types.Almond;
import Plants.Types.Juniper;
import Plants.Types.Spruce;

public class App {
    public static void main(String[] args) {
        Farm farm = new Farm("Mars1", "North Mars", 0);
        farm.addPlants(new Spruce("Spruce", "Spruce", 26));
        farm.addPlants(new Almond("Almond1", "Almond", 50));
        farm.addPlants(new Juniper("Juniper1", "Juniper", 14));

    }



}
