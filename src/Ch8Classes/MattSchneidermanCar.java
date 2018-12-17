package Ch8Classes;

public class MattSchneidermanCar {
    private boolean isOn;
    private int numSeats;
    private boolean inMotion;
    private String color;
    private double price;
    private boolean isBraking;
    private String brand;
    private String musicPlaying;
    private int volume;
    private int tankSize;
    private int MPG;

    //constructor
    public MattSchneidermanCar(int numSeats, String color, double price, String brand) {
        this.numSeats = numSeats;
        this.color = color;
        this.price = price;
        this.brand = brand;
    }

    //getters
    public boolean isOn() {
        return isOn;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public boolean isInMotion() {
        return inMotion;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBraking() {
        return isBraking;
    }

    public String getBrand() {
        return brand;
    }

    public String getMusicPlaying() {
        return musicPlaying;
    }

    public int getVolume() {
        return volume;
    }

    public int getGas() {
        return tankSize;
    }
    public int getMPG(){
        return MPG;
    }

    //setters

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setInMotion(boolean inMotion) {
        this.inMotion = inMotion;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBraking(boolean braking) {
        isBraking = braking;
    }

    public void setMusicPlaying(String musicPlaying) {
        this.musicPlaying = musicPlaying;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setGas(int newSize) {
        this.tankSize = newSize;
    }

    public String toString() {
        return "This is a " + color + " " + brand + "car. It can hold " + tankSize +
                "gallons and gets " + MPG + "miles per gallon. The price of the car is $"
                + price + ".";
    }
}
