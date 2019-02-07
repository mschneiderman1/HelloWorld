package CH9Inheritance;

public class SecretaryV2 {
    public int getHours(){

        return 40; // works 40 hours per week
    }

    public double getSalary(){

        return 40000.0; //$40,000 a year
    }

    public int getVacationDays(){

        return 10;  //2 weeks paid vacation
    }

    public String getVacationForm(){

        return "yellow"; //use the yellow form for leave
    }

    public void takeDictation(String text){
        System.out.println("Taking dictation of text: "
                + text);
    }
}
