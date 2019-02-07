package CH9Inheritance;

public class MarketerV2 extends EmployeeV2 {

    public double getSalary(){

        return 50000.0; //$50,000 a year
    }

    public void advertise(){
        System.out.println("I'll convince you to " +
                " hire our law firm");
    }

}
