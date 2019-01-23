package Plants.Types;

import Plants.Evergreen;

public class Juniper extends SpawnOrDie implements Evergreen {

    public Juniper(String name, String type, double produce ) {
        super.name = name;
        super.type = type;
        super.produce = produce;
    }

    @Override
    public void fifthWeek() {

    }

    @Override
    public void maximumProduce() {

    }
}
