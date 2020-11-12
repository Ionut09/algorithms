package com.lseg.composition;

public class Case extends Component{

    private int powerSupply;

    private String color;

    public Case(String manufacturer, String model, int powerSupply, String color) {
        super(manufacturer, model);
        this.powerSupply = powerSupply;
        this.color = color;
    }

    public void pressButton(){
        System.out.println("Button pressed");
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
