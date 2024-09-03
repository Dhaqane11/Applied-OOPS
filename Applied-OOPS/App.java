import java.util.Scanner;

public class App {

public static class Var {
  
    String instanceVar = "This is an instance variable";
    String localVar = "This is a local variable";

    public String getInstanceVar() {
        return instanceVar;
    }

    public String getLocalVar() {
       
        return localVar;
    }
}
  
    public static void main(String[] args) {

        Var v = new Var();

        String instanceVar = v.getInstanceVar();
        System.out.println("The variable type is: " + instanceVar);

        String localVar = v.getLocalVar();
        System.out.println("The variable type is: " + localVar);
    }
}
