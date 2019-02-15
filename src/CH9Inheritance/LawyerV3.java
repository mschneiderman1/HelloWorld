package CH9Inheritance;

public class LawyerV3 extends EmployeeV3 {

    public LawyerV3(String name) {
        super(name);
    }
    //inherit methods from Employee class

    //Overrides methods from employee class
    public int getVacationDays(){

        return 15;  //3 weeks paid vacation
    }

    public String getVacationForm(){

        return "pink"; //use the pink form for leave
    }

    public void sue(){
        System.out.println("I'll see you in court");
    }
}
