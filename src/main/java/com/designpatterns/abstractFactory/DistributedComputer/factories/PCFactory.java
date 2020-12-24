package com.designpatterns.abstractFactory.DistributedComputer.factories;

import com.designpatterns.abstractFactory.DistributedComputer.computers.Computer;
import com.designpatterns.abstractFactory.DistributedComputer.computers.PC;

/**
 * created by saurabhgupta on 23/12/20
 */
public class PCFactory implements ComputerAbstractFactory{
    private String ram, hdd, cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}
