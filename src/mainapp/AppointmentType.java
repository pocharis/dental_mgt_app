/*
 * 
 * Abstract class for the appointment types(Checkup and treatment)
 */ 

package mainapp;

import java.util.ArrayList;

/**
 *
 * @author Abdoul Onas
 */
//Implementign the Abstract Appoitment class
public abstract class AppointmentType{
    
    //Declaring the properties
    private String description;
    private int duration;
    
    //Constructor for the appointment class
    public AppointmentType(String desc, int duration){
        this.description = desc;
        this.duration = duration;
    }

    //Getter method for the description
    public String getDescription() {
        return description;
    }
    
    //setter method for the description
    public void setDescription(String desc){
        this.description = desc;
    }

    //Getter method for the duration
    public int getDuration() {
        return duration;
    }

    //Method to update the duration
    public void updateDuration(int duration) {
        if(duration >= 15){
            this.duration = duration;
        }else{
            this.duration = 15;
        }
        
    }

    //toString method to return the summarized properties of the class
    @Override
    public String toString() {
        return "Description: " + description + ", Duration: " + duration;
    }
    
    //Getter method for the cost 
    public abstract double getCost();
    
    //An initial list of appointments
   public static void fillAppointmentTypeList(ArrayList<AppointmentType> list){
        list.add(new CheckUp(30, true));
        list.add(new Treatment("Polishing", 20, 100.0));
        list.add(new CheckUp(60, false));
        list.add(new Treatment("Replacement", 50, 150.0));
    }

    
    
    
    
}
