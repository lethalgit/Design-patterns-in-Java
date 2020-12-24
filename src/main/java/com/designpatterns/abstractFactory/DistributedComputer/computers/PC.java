package com.designpatterns.abstractFactory.DistributedComputer.computers;

/**
 * created by saurabhgupta on 23/12/20
 */
public class PC extends Computer{
    private String cpu, ram, hdd;

    public PC(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHdd() {
        return this.hdd;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }
}
