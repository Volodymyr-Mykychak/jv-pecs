package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;
/**
 * Інтерфейс `MachineProducer` є виробником машин. Він визначає метод `get()`,
 * який повертає список машин певного типу.
 *
 * @param <T> тип машин, які виробляє виробник
 */
public interface MachineProducer<T extends Machine> {
    /**
     * Отримує список машин певного типу.
     *
     * @return список машин певного типу
     */
    List<T> get();
}
