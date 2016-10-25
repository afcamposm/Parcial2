/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firmainversiones;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Company {
    private HashMap<String, Client> clients;
    
    public Company(){
       this.clients = new HashMap<>();
    }
    
    public boolean addClient(Client client){
       if (!this.clients.containsKey(Client.getCc())){
           this.clients.put(client.getCc(), client);
           return true;
       }
       
        return false;
    }
    
    public double calAmountAllMarket(){
        double marketValue = 0;
        for (Client client : this.clients.values()){
            marketValue+=client.sumMarketvalue();
        }
        return marketValue;
    }
    
    public double calAllProfit(){
      Client maxProfit= null;
      for(Client client : this.clients.values())
          if(maxProfit == null)
              maxProfit = client;
          else{
              if(client.sumProfit() > maxProfit.sumProfit()){
                  maxProfit = client;
              }
          }
          return maxProfit;
    }
    //Clientes ordenados descentementemente por
    //Valor en el mercado
    
    public ArrayList calMarketAndProfitByAsset(){
      return null;
    }
    public ArrayList calMarketAndProfitByAge(){
      return null;
    }
    
    public Client calClientMaxProfit(){
       return null;
    }
    
    public ArrayList listClient(){
      return null;
    }
}
