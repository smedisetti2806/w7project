/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalstore;


public class Factory_Store {
 
    private String Stock;
    private String Stock_Info;

    public Factory_Store(String Stock, String Stock_Info) {
        this.Stock = Stock;
        this.Stock_Info = Stock_Info;
    }

    public Factory_Store() {
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String Stock) {
        this.Stock = Stock;
    }

    public String getStock_Info() {
        return Stock_Info;
    }

    public void setStock_Info(String Stock_Info) {
        this.Stock_Info = Stock_Info;
    }
    
    
    
    
}
