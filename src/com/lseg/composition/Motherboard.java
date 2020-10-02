package com.lseg.composition;

public class Motherboard extends Component {

    private int ramSlots;

    private int diskSlots;

    private String videoCardType;

    public Motherboard(String manufacturer, String model, int ramSlots, int diskSlots, String videoCardType) {
        super(manufacturer, model);
        this.ramSlots = ramSlots;
        this.diskSlots = diskSlots;
        this.videoCardType = videoCardType;
    }

    public void loadProgram(String name) {
        System.out.println("Loading program " + name + "...");
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getDiskSlots() {
        return diskSlots;
    }

    public void setDiskSlots(int diskSlots) {
        this.diskSlots = diskSlots;
    }

    public String getVideoCardType() {
        return videoCardType;
    }

    public void setVideoCardType(String videoCardType) {
        this.videoCardType = videoCardType;
    }
}
