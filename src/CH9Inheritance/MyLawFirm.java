//This program is a client program to instantiate a bunch
// of employees for a law firm
package CH9Inheritance;

public class MyLawFirm {
    public static void main(String[] args){
        LegalSecretaryV2 tom = new LegalSecretaryV2();
        MarketerV2 johnny = new MarketerV2();
        LawyerV2 henry = new LawyerV2();
        printInfo(tom);
        printInfo(johnny);
        printInfo(henry);
    }

    public static void printInfo(EmployeeV2 employee){
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("V. Days: " + employee.getVacationDays());
        System.out.println("V. Form: " + employee.getVacationForm());

    }
}