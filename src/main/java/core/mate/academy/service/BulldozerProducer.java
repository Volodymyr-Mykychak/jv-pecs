package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;
/**
 * Клас `BulldozerProducer` є виробником бульдозерів. Він реалізує інтерфейс `MachineProducer`,
 * що визначає метод `get()`, який повертає список бульдозерів.
 */
public class BulldozerProducer implements MachineProducer<Bulldozer> {
    /**
     * Отримує список бульдозерів.
     *
     * @return список бульдозерів
     */
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Catterpillar", 150000));
        bulldozers.add(new Bulldozer("Zettelmeyer", 170000));
        bulldozers.add(new Bulldozer("Chalenger", 120000));
        return bulldozers;
    }
}
