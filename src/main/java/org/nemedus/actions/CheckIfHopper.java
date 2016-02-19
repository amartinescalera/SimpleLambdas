package org.nemedus.actions;

import org.nemedus.entities.Animal;

public class CheckIfHopper implements CheckTrait {
    public boolean test (Animal a) {
        return a.canHop();
    }
}
