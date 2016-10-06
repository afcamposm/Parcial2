/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;

/**
 *
 * @author Estudiante
 */
import java.util.*;

public class Empresa {
    private String nombre;
    private TreeMap<String, Sucursal> suc;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.suc = new TreeMap<>();
    }
    
    public ArrayList<Sucursal> listarEmpleados(){
        ArrayList<Sucursal> sucursal =
                new ArrayList<>();
        for(Sucursal s: this.suc.values()){
            for(Empleado e: s.getEmp().values())
                empleados.add(e);
        return empleados;
    }
    
    public boolean agregarSucursal(Sucursal s){
        if(this.suc.containsKey(s)) return false;
        else {
           this.suc.put(s.getCiudad(), s);
           return true;
        }
    }
    
    

    
    
    

}
