package com.designpatterns.abstractFactory.DistributedComputer.factories;

import com.designpatterns.abstractFactory.DistributedComputer.computers.Computer;

/**
 * created by saurabhgupta on 24/12/20
 */
public class ComputerFactory {

    final private ComputerAbstractFactory computerAbstractFactory;
    public ComputerFactory(ComputerAbstractFactory computerAbstractFactory) {
        this.computerAbstractFactory = computerAbstractFactory;
    }

    public Computer getComputer() {
        return computerAbstractFactory.createComputer();
    }
}
