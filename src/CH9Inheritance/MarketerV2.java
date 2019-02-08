package CH9Inheritance;

public class MarketerV2 extends EmployeeV2 {

    public double getSalary(){
            // I want to add 10,000 to the base salary from the Employee class
        return super.getSalary() + 10000; //$50,000 a year
    }

    public void advertise(){
        System.out.println("I'll convince you to " +
                " hire our law firm");
    }

}
