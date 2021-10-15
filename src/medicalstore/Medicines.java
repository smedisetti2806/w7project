/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalstore;


public class Medicines implements Observer,State{
    
    private String name;
    
    private int id;
    
    private String dose;
    
    private int noOfTablets;
    
    private Patient patient;

    private double price_Per_Tablets;
    public Medicines() {
    }

    public Medicines(String name, int id, String dose, int noOfTablets,
            Patient patient, double price_Per_Tablets) {
        
        this.name = name;
        this.id = id;
        this.dose = dose;
        this.noOfTablets = noOfTablets;
        this.patient = patient;
        this.price_Per_Tablets = price_Per_Tablets ;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public int getNoOfTablets() {
        return noOfTablets;
    }

    public void setNoOfTablets(int noOfTablets) {
        this.noOfTablets = noOfTablets;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public double getPrice_Per_Tablets() {
        return price_Per_Tablets;
    }

    public void setPrice_Per_Tablets(double price_Per_Tablets) {
        this.price_Per_Tablets = price_Per_Tablets;
    }

    
    
    
    
    @Override
    public double calculateBill() {
    
        return noOfTablets * price_Per_Tablets;
   
    }

    @Override
    public String toString() {
        return "Medicines{" + "name=" + name + ", id=" + id + ", dose=" 
                + dose + ", noOfTablets=" + noOfTablets + 
                ", patient=" + patient + ", price_Per_Tablets=" + price_Per_Tablets + '}';
    }

    @Override
    public void Avialability() {
    
        
    }
    
    
    

    
    
    
}
