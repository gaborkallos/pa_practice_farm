package Plants.Types;

import Plants.AlmondSpecialSkill;

public class Almond extends SpawnOrDie implements AlmondSpecialSkill {

    public Almond(String name, String type, double produce ) {
        super.name = name;
        super.type = type;
        super.produce = produce;
    }

    @Override
    public void produceDouble() {

    }
}
