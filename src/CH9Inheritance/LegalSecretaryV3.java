package CH9Inheritance;

public class LegalSecretaryV3 extends SecretaryV3{
    public LegalSecretaryV3(String input) {
        super(input);
    }

    public double getSalary() {

        return super.getSalary() + 5000;  //$45,000 a year
    }
}
