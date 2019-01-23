package Plants.Types;

import Plants.Evergreen;

public class Spruce extends SpawnOrDie implements Evergreen {

    public Spruce(String name, String type, double produce ) {
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
