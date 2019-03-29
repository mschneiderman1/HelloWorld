package TestMethods;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();
        String s = "j";
        a.add("s");
        a.add("j");
        a.add("g");
        a.add("j");
        a.add("werew");
        a.add("jj");
        a.add("j");
        a.add("j");
        a.add("j");
        a.add("j");
        System.out.println(a);
        test(a, s);
        System.out.println(a);

    }
    public static void test(ArrayList<String> a, String s){
        for (int i = 0; i < a.size(); i++){
            if(a.get(i).equals(s)){
                a.remove(i);
            }
        }
    }
}
