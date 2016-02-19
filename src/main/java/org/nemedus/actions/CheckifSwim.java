package org.nemedus.actions;

import org.nemedus.entities.Animal;

/**
 * org.nemedus.actions
 * author: antoniomeh
 * Date: 18/02/16
 */
public class CheckifSwim implements CheckTrait {
    public boolean test (Animal a) {
        return a.canSwim();
    }
}
