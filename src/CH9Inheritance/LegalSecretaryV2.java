package CH9Inheritance;

public class LegalSecretaryV2 extends SecretaryV2{
    public double getSalary() {
        return super.getSalary() + 5000;  //$45,000 a year
    }
}
