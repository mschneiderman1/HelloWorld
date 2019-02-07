package CH9Inheritance;

public class LegalSecretaryV2 extends EmployeeV2{
    public double getSalary() {

        return 45000.0; //$45,000 a year
    }

    public void takeDictation(String text){
        System.out.println("Taking dictation of text: "
            + text);
    }
}
