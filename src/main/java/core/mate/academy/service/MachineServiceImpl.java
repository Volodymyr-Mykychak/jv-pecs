package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Клас `MachineServiceImpl` є реалізацією інтерфейсу `MachineService`.
 * Він надає методи для роботи з машинами.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    /**
     * Отримує список машин певного типу.
     *
     * @param type тип машини
     * @return список машин певного типу
     */
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> machineProducer;
        if (Bulldozer.class.equals(type)) {
            machineProducer = new BulldozerProducer();
        } else if (Truck.class.equals(type)) {
            machineProducer = new TruckProducer();
        } else if (Excavator.class.equals(type)) {
            machineProducer = new ExcavatorProducer();
        } else {
            return new ArrayList<>();
        }
        List<? extends Machine> machines = machineProducer.get();
        return new ArrayList<>(machines);
    }
    /**
     * Заповнює список машин заданою машиною.
     *
     * @param machines список машин
     * @param value    машина, якою слід заповнити список
     */
    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }
    /**
     * Запускає роботу списку машин.
     *
     * @param machines список машин
     */

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
