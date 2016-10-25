package firmainversiones;


import firmainversiones.Asset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Client {
    private String cc;
    private String firstName;
    private String lastName;
    private int phone;
    private int age;
    private Asset[] assets;
    private int numAsset;

    public Client(String cc, String firstName, String lastName, int phone, int age) {
        this.cc = cc;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.assets = new Asset[10];
        this.numAsset=0;
    }
    
    public double sumProfit(){
       double profitValue=0;
       for (int i=0 ; i<this.numAsset ; i++){
           Asset asset = this.assets[i];
           profitValue+=asset.getProfit();
       }
       return profitValue;
    }
    public double sumMarketvalue(){
       double marketValue = 0;
       for(Asset asset : assets){
           marketValue+=asset.getMarketValue();
           
       }
        return marketValue;
    }
    public boolean addAsset(Asset asset){
       if(this.numAsset<10){
           this.assets[this.numAsset]=asset;
           this.numAsset++;
        }else{
           return false
       }
    }

    public String getCc() {
        return cc;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public Asset[] getAssets() {
        return assets;
    }

    public int getNumAsset() {
        return numAsset;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAssets(Asset[] assets) {
        this.assets = assets;
    }

    public void setNumAsset(int numAsset) {
        this.numAsset = numAsset;
    }
    
}
