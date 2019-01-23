package Plants.Types;

import Plants.AlmondSpecialSkill;
import Plants.Evergreen;

public class Almond extends SpawnOrDie implements AlmondSpecialSkill, Evergreen {

    private final int ALMOND_CHANCE_TO_SPAWN = 8;
    private final int ALMOND_CHANCE_TO_ROT = 13;

    public Almond(String name, String type, double produce ) {
        super.name = name;
        super.type = type;
        super.produce = produce;
    }

    @Override
    public void produceDouble() {

    }


    @Override
    public void fifthWeek() {

    }

    @Override
    public void maximumProduce() {

    }
}
