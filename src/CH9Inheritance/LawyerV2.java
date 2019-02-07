package CH9Inheritance;

public class LawyerV2 extends EmployeeV2 {
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
