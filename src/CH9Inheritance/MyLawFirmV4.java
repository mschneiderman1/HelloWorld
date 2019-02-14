//This program is a client program to instantiate a bunch
// of employees for a law firm. This version uses an array of objects
//of type Employees. Each object is created at the instantiation of the
// employee array. The array is then passed to a method to print
// each employee's information
package CH9Inheritance;

public class MyLawFirmV4 {
    public static void main(String[] args){
        EmployeeV3[] myEmployees = {new LegalSecretaryV3("Tom"),
                new MarketerV3("Jonny"),
                new LawyerV3("Henry")};

        printInfo(myEmployees);
    }

    public static void printInfo(EmployeeV3[] myEmployees){
           //Data type  //iterator  //container
        for (EmployeeV3 staff: myEmployees){
            System.out.println("Salary: " + staff.getSalary());
            System.out.println("V. Days: " + staff.getVacationDays());
            System.out.println("V. Form: " + staff.getVacationForm());
            System.out.println();
        }

       /* for(int i =0; i < myEmployees.length; i++) {
            System.out.println("Salary: " + myEmployees[i].getSalary());
            System.out.println("V. Days: " + myEmployees[i].getVacationDays());
            System.out.println("V. Form: " + myEmployees[i].getVacationForm());
            System.out.println();
        }*/

    }
}