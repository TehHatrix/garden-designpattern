package Garden;

import Garden.AbstractFactory.*;

public class Garden {

    private Animal animal;
    private SeasonFactory seasonFactory;

    public Garden(SeasonFactory seasonFactory) {
        this.seasonFactory = seasonFactory;
    }
}
