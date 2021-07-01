package oop.animals;

public class fish {

    private boolean canSwim;
    private int length;
    private int finCount;
    private boolean isSaltWater;
    private String name;
    private boolean hasScales;

    public fish(boolean canSwim, int length, int finCount, boolean isSaltWater, String name, boolean hasScales) {
        this.canSwim = canSwim;
        this.length = length;
        this.finCount = finCount;
        this.isSaltWater = isSaltWater;
        this.name = name;
        this.hasScales = hasScales;
    }
    public Fish(String name){
        this.name = name;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFinCount() {
        return finCount;
    }

    public void setFinCount(int finCount) {
        this.finCount = finCount;
    }

    public boolean isSaltWater() {
        return isSaltWater;
    }

    public void setSaltWater(boolean saltWater) {
        isSaltWater = saltWater;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }
}
