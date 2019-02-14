//A class to represent employees in general (20 page manual)
package CH9Inheritance;

public class EmployeeV3 {
    private static String name;

    public EmployeeV3(String input){
        this.name = input;
    }

    public String getName(){
        return name;
    }

    public int getHours(){

        return 40; // works 40 hours per week
    }

    public double getSalary(){

        return 50000.0; //$50,000 a year
    }

    public int getVacationDays(){

        return 10;  //2 weeks paid vacation
    }

    public String getVacationForm(){

        return "yellow"; //use the yellow form for leave
    }

}
