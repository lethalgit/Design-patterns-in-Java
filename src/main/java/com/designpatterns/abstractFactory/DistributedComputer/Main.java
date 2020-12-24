package com.designpatterns.abstractFactory.DistributedComputer;

import com.designpatterns.abstractFactory.DistributedComputer.factories.ComputerFactory;
import com.designpatterns.abstractFactory.DistributedComputer.factories.PCFactory;

/**
 * created by saurabhgupta on 24/12/20
 */
public class Main {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory(new PCFactory("200", "100", "300"));
        System.out.println(computerFactory.getComputer().getRam() + " " + computerFactory.getComputer().getCpu() +
                " " + computerFactory.getComputer().getHdd());
    }
}
