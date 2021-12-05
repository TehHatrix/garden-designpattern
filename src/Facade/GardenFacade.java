package Facade;

import Garden.AnimalsDecorator;

/**
 * A Facade class can often be transformed into a Singleton
 * since a single facade object is sufficient in most cases.
 */

public class GardenFacade {

    /**
     * Composition:
     * Components of the subsystem
     * that we are going to use
     * : Only those features that clients really care about
     */

    // I am sure why I cannot call Animal class here
    AnimalsDecorator animalsDecorator;

    /**
     * SeasonFactory seasonFactory;
     * Other components
     * Other components
     */


    /**
     * Other references will be
     * passed in the constructor
     */
    public GardenFacade(AnimalsDecorator animalsDecorator) {
        this.animalsDecorator = animalsDecorator;

    }
}
