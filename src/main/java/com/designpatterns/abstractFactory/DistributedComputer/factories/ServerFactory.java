package com.designpatterns.abstractFactory.DistributedComputer.factories;

import com.designpatterns.abstractFactory.DistributedComputer.computers.Computer;
import com.designpatterns.abstractFactory.DistributedComputer.computers.Server;

/**
 * created by saurabhgupta on 23/12/20
 */
public class ServerFactory implements ComputerAbstractFactory{
    private String ram, hdd, cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}