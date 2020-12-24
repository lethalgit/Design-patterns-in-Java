package com.designpatterns.abstractFactory.DistributedComputer.factories;

import com.designpatterns.abstractFactory.DistributedComputer.computers.Computer;

/**
 * created by saurabhgupta on 23/12/20
 */
public interface ComputerAbstractFactory {
    public Computer createComputer();
}
