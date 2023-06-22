package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
/**
 * Клас `TruckProducer` є виробником вантажівок. Він реалізує інтерфейс `MachineProducer`,
 * що визначає метод `get()`, який повертає список вантажівок.
 */
public class TruckProducer implements MachineProducer<Truck> {
    /**
     * Отримує список вантажівок.
     *
     * @return список вантажівок
     */
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("6sef0PQ6", "fR1VJ"));
        trucks.add(new Truck("4syu5", "QJsI"));
        trucks.add(new Truck("limit", "swell"));
        return trucks;
    }
}
