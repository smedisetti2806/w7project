/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalstore;


public class Diabetes_Patients extends Medicines{
    
    private String Instructions;

    public Diabetes_Patients() {
    }

    public Diabetes_Patients(String Instructions, String name, int id,
            String dose, int noOfTablets, Patient patient, double price_Per_Tablets) {
        
        super(name, id, dose, noOfTablets, patient, price_Per_Tablets);
        this.Instructions = Instructions;
    
    }

    public String getInstructions() {
        return Instructions;
    }

    public void setInstructions(String Instructions) {
        this.Instructions = Instructions;
    }

    @Override
    public String toString() {
        return "Diabetes_Patients{" + "Instructions=" + Instructions + '}';
    }

    @Override
    public void Avialability() {
        
        
    }

    
    
    
    
    
}
