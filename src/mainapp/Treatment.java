/*
 * 
 * Class to manage the appoitments
 */

package mainapp;

/**
 *
 * @author Abdoul Onas
 */

// Implementing the treatment class which is a subclass of the AppoitmentType abstract class
public class Treatment extends AppointmentType{
    
    //Declaring the properties of the class
    private double treatmentCost;
    private TreatmentType type;
    
    //Constructor for the class
    public Treatment(String desc, int duration, double cost){
        super(desc, duration);
        this.treatmentCost = cost;
        this.type = TreatmentType.GENERAL;
    }
    

    //Overload constructr for the class
    public Treatment(TreatmentType type, int duration, double cost){
         super(descFunc(type), duration);
         this.treatmentCost = cost;
         this.type = type;
        
    }
    
    //Helper class to return name of the treatment type
    private static String descFunc(TreatmentType type){
        return type.name();
    }
    
  
    //Setter  method for the type
    public void setType(TreatmentType type) {
        this.type = type;
    }

    //getter method for the class
    public TreatmentType getType() {
        return type;
    }

    //Getter method for the class
    @Override public double getCost() {
        return treatmentCost;
    }
    
    //Setter method for the class
    public void setCost(double cost) {
        this.treatmentCost = cost;
    }

    //toString method which contrains summary od objects properties
    @Override
    public String toString() {
        return  "AppointmentType: Treatment, " + super.toString() + ", treatmentCost=" + treatmentCost + ", type=" + type  ;

    }
    
    
    
    
    
    
    
    
    
    
}
