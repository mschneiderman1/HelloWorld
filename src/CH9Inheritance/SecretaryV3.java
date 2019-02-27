package CH9Inheritance;

public class SecretaryV3 extends EmployeeV3{

    public SecretaryV3(String input, int experience) {

        super(input, experience);
    }

    public void takeDictation(String text){
        System.out.println("Taking dictation of text: "
                + text);
    }
}
