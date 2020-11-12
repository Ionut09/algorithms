package com.lseg.composition;

public class Monitor extends Component {

    private int size;

    private Resolution resolution;

    public Monitor(String manufacturer, String model, int size, Resolution resolution) {
        super(manufacturer, model);
        this.size = size;
        this.resolution = resolution;
    }

    public void showLogo(String logo){
        System.out.println(logo);
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
