package Ch8Classes;

public class MattSchneidemanPhone{
    private int percentCharged;
    private String time;
    private boolean hasService;
    private String password;
    private String number;
    private String name;
    private int brightness;
    private int volume;
    private boolean connectedToWIFI;

    //constructor
    public MattSchneidemanPhone(String time, boolean hasService, String password, String number, String name, boolean connectedToWIFI) {
        this.time = time;
        this.hasService = hasService;
        this.password = password;
        this.number = number;
        this.name = name;
        this.connectedToWIFI = connectedToWIFI;
    }

    //getters

    public int getPercentCharged() {
        return percentCharged;
    }

    public String getTime() {
        return time;
    }

    public boolean isHasService() {
        return hasService;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getBrightness() {
        return brightness;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isConnectedToWIFI() {
        return connectedToWIFI;
    }

    //setters

    public void setPercentCharged(int percentCharged) {
        this.percentCharged = percentCharged;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setHasService(boolean hasService) {
        this.hasService = hasService;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setConnectedToWIFI(boolean connectedToWIFI) {
        this.connectedToWIFI = connectedToWIFI;
    }
    public String toString(){
        return "This is " + name + "'s phone. Their number is " + number + ". The phone is " + "% charged."
                + "The time on the phone is" + time + ". The volume is set to " + volume + ".";
    }
}
