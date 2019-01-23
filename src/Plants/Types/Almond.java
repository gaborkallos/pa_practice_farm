package Plants.Types;

import Plants.AlmondSpecialSkill;
import Plants.Evergreen;

public class Almond extends SpawnOrDie implements AlmondSpecialSkill, Evergreen {

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
