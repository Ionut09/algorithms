package com.lseg.composition;

public class PC {

    private Case aCase;

    private Monitor monitor;

    private Motherboard motherboard;

    public PC(Case aCase, Monitor monitor, Motherboard motherboard) {
        this.aCase = aCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void start(){
        aCase.pressButton();
        monitor.showLogo("LG logo");
        motherboard.loadProgram("Windows 10");
        monitor.showLogo("Windows logo");
    }

    public Case getaCase() {
        return aCase;
    }

    public void setaCase(Case aCase) {
        this.aCase = aCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
}
