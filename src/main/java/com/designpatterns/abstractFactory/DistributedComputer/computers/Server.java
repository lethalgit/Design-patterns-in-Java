package com.designpatterns.abstractFactory.DistributedComputer.computers;

/**
 * created by saurabhgupta on 23/12/20
 */
public class Server extends Computer{
    private String ram, hdd, cpu;

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
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
