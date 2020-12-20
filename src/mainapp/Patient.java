/*
 * 
 * Class to manage the patients
 */

package mainapp;

import java.util.ArrayList;

/**
 *
 * @author Abdoul Onas
 */

// Implementing the patient class
public class Patient{
    
    //Declaring hte properties of the class
    private final String patientName;
    private final int age;
    private double bill;
    

    //Class constructor for the Patient
    public Patient(String name, int age){
        this.patientName = name;
        this.age = age;
        this.bill = 0.0;
    }

    //Getter method for the patients name 
    public String getPatientName() {
        return patientName;
    }

    //Gette method for the patients age
    public int getAge() {
        return age;
    }

    //Getter method for the patients bill 
    public double getBill() {
        return bill;
    }
    
    //Method to add to the patients bill
    public void addToBill(double amount){
        this.bill += amount;
    }

    //To string method to return the properties of the class
    @Override
    public String toString() {
        return "Patient: " + patientName + ", age: " + age + ", bill: £" + bill ;
    }
    
    //Initiail list that contains patients 
    public static void fillPatientList(ArrayList<Patient> list){
        list.add(new Patient("Peter Cook", 13));
        list.add(new Patient("Andrew Curry", 22));
        list.add(new Patient("Amanda Chevez", 32));
    }
    
    
    //Testing the class
    public static void main(String[] args) {
        Patient p1 = new Patient("Abdul", 23);
        p1.addToBill(100);
        
        System.out.println(p1.toString());

        System.out.println(p1.getPatientName());        
        System.out.println(p1.getAge());
        System.out.println(p1.getBill());

    }
 
    
}
