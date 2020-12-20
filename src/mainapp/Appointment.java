/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapp;

import java.util.Comparator;

/**
 *
 * @author Abdoul Onas
 */

//Implemtneting the Appointment class
public class Appointment  implements Comparable<Appointment>{
    
    //Declasing the properties of the class
     private AppointmentType type;
     Patient patient;
     int time;
     
    //Method to fascilitate comparing the patients name
    @Override public int compareTo(Appointment other){
        return this.patient.getPatientName().compareTo(other.patient.getPatientName());
    }
    

    //Comparator  method for the appointment time
    public static class AppointmentTimeComparator implements Comparator<Appointment>{
        @Override public int compare(Appointment ap1, Appointment ap2){
            return ap1.time - ap2.time;
        }
    }
     
    //Constructor for the Appointment class
     public Appointment(int time, AppointmentType type, Patient patient){
         this.time = time;
         this.type = type;
         this.patient = patient;
     }

    
    //Getter for the appointment type
    public AppointmentType getAppointmentType() {
        return type;
    }

    //Getter for the patient object
    public Patient getPatient() {
        return patient;
    }

    //getter for the time
    public int getTime() {
        return time;
    }

    //getter for the time in a nice format
    public String getTimeAsString(){
        int totalMin = time + 8*60;
        int hours = totalMin /60;
        int mins = totalMin %60;
        return "" + hours + ":" + mins;
    }
     

    //toString method that represents the summarized properties of the class
    @Override
    public String toString() {
        return "Patient: " + patient.getPatientName()+ ", " + type   + ", Time: " + getTimeAsString();
    }
     
    
   //Testing the class
    public static void main(String[] args) {
        Patient p1 = new Patient("Abdul", 23);
        p1.addToBill(100);
        
        System.out.println(p1.toString());

       
        //New objects of checkup and treatment appointment types
        AppointmentType apt1 = new CheckUp(30, true);       
        AppointmentType apt2 = new Treatment("Treatment", 20, 100.0);
        
        Appointment ap1 = new Appointment(20, apt2, p1);
        System.out.println(apt1.toString());
        System.out.print(ap1.getAppointmentType() + "\n");

        
    }
}
