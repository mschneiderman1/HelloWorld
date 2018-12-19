package Ch8Classes;

public class Address{
    private int houseNum;
    private String apt;
    private String street;
    private String city;
    private String state;
    private int zipCode;

    //consturctor
    public Address(int houseNum, String apt, String street, String city, String state, int zipCode) {
        this.houseNum = houseNum;
        this.apt = apt;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    //getters
    public int getHouseNum() {
        return houseNum;
    }

    public String getApt() {
        return apt;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }

    //setters
    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public void setApt(String apt) {
        this.apt = apt;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String toString(){
        return apt + " " + houseNum + " " + street + "\n" +
                city + ", " +  state + " " + zipCode;
    }
}
