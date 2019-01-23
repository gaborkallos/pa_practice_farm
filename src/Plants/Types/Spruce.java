package Plants.Types;

import Plants.Evergreen;

public class Spruce extends SpawnOrDie implements Evergreen {

    private final int SPRUCE_CHANCE_TO_SPAWN = 5;
    private final int SPRUCE_CHANCE_TO_ROT = 4;

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
