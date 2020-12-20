/*
 *
 * Class to manage the checkup appointments, this inherits from the appointment type class
 */
package mainapp;

/**
 *
 * @author User
 */
//Implementing the Checkup class which inherits the AppointmentType class
public class CheckUp extends AppointmentType{
    
    //Declaring the properties of the class
    private boolean withPolish;
    private static  double costOfCheckUp = 30;
    private static  double costOfPolish = 20;

   //Constructor fot the class
    public CheckUp(int duration, boolean condition){
        super(Checker(condition), duration);
        this.withPolish = condition;
    }
    
    //Helper method for the constructor
    private static String Checker(boolean condition){
        if(condition) return "Check Up with Polish";
        else return "Checkup";
    }

    //toString method which returns the summarized properties of the class
    @Override
    public String toString() {
        return  "AppointmentType: CheckUp, " + super.toString() + ", WithPolish: " + withPolish ;
        
    }
    
    //Getter function for the cost
    @Override public double getCost(){
        if(isWithPolish()) return getCostOfCheckUp() + getCostOfPolish();
        else return getCostOfCheckUp();
    }

    //getter method for withpolish 
    public boolean isWithPolish() {
        return withPolish;
    }

    //getter method for the cost of checkup only
    public static double getCostOfCheckUp() {
        return costOfCheckUp;
    }

    //getter method for the cost of polish only
    public static double getCostOfPolish() {
        return costOfPolish;
    }

    //Setter for the cost of checkup
    public static void setCostOfCheckUp(double costOfCheckUp) {
        CheckUp.costOfCheckUp = costOfCheckUp;
    }

    //setter for the cost of polish
    public static void setCostOfPolish(double costOfPolish) {
        CheckUp.costOfPolish = costOfPolish;
    }
       
}
