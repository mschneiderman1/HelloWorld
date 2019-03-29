//This program is a client program to instantiate a bunch
// of employees for a law firm. This version uses an array
//of type Employees to print each employee's information
package CH9Inheritance;

public class MyLawFirmV2 {
    public static void main(String[] args){
        EmployeeV2[] myEmployees = new EmployeeV2[3];

        EmployeeV2 tom = new LegalSecretaryV2();
        myEmployees[0] = tom;

        EmployeeV2 jonny = new MarketerV2();
        myEmployees[1] = jonny;

        EmployeeV2 henry = new LawyerV2();
        myEmployees[2] = henry;

        printInfo(myEmployees);
    }

    public static void printInfo(EmployeeV2[] myEmployees){
        for(int i =0; i < myEmployees.length; i++) {
            System.out.println("Salary: " + myEmployees[i].getSalary());
            System.out.println("V. Days: " + myEmployees[i].getVacationDays());
            System.out.println("V. Form: " + myEmployees[i].getVacationForm());
            System.out.println();
        }

    }
}