package Ch8Classes;

public class MattSchneidermanInstagram {
    private String name;
    private String password;
    private String username;
    private String DOB;
    private String email;
    private String Bio;
    private int numFollowers;
    private int numposts;
    private int numFollowing;

    //consturctor
    public MattSchneidermanInstagram(String name, String password, String username, String DOB, String email) {
        this.name = name;
        this.password = password;
        this.username = username;
        this.DOB = DOB;
        this.email = email;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getBio() {
        return Bio;
    }

    public int getNumFollowers() {
        return numFollowers;
    }

    public int getPosts() {
        return numposts;
    }

    public int getNumFollowing() {
        return numFollowing;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public String toString(){
        return "This is " + name + "'s account. Their bio is " + Bio + " . They have "
                + numFollowers + "followers, are following" + numFollowing + "people and they have "
                + numposts + "posts.";
    }
}
