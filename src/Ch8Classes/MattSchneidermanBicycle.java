package Ch8Classes;

public class MattSchneidermanBicycle {
    private double price;
    private boolean isPurchased;
    private String condition;
    private double psi;
    private int wheels;
    private int numGears;
    private int ageRange;
    private String color;
    private double RPM;
    private boolean isBraking;
    private boolean isInMotion;

    //constructor

    public MattSchneidermanBicycle(double price, boolean isPurchased, String condition, int ageRange, String color) {
        this.price = price;
        this.isPurchased = isPurchased;
        this.condition = condition;
        this.ageRange = ageRange;
        this.color = color;
    }

    //getters
    public double getPrice() {
        return price;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    public String getCondition() {
        return condition;
    }

    public double getPsi() {
        return psi;
    }

    public int getWheels() {
        return wheels;
    }

    public int getNumGears() {
        return numGears;
    }

    public int getAgeRange() {
        return ageRange;
    }

    public String getColor() {
        return color;
    }

    public double getRPM() {
        return RPM;
    }

    public boolean isBraking() {
        return isBraking;
    }

    public boolean isInMotion() {
        return isInMotion;
    }
    //setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setPurchased(boolean purchased) {
        isPurchased = purchased;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setPsi(double psi) {
        this.psi = psi;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "This is a " + color + " bicycle. That is in " + condition +
                " condition. The age range for this bike is above " + ageRange +
                ". The price for this bike is $" + price + ".";
    }
}
