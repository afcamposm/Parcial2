/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author Estudiante
 */
public abstract class Pet {
    private String id;
    private String name;
    private String hairColor;
    
    public abstract String sound();
    

    public Pet(String id, String name, String hairColor) {
        this.id = id;
        this.name = name;
        this.hairColor = hairColor;
    }
    
    
    
}