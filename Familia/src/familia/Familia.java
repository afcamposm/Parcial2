/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familia;

/**
 *
 * @author Estudiante
 */
public class Familia {
    private String apellido;
    private Persona madre;
    private Persona padre;
    private Persona[] hijos;

    public Familia(String apellido) {
        this.apellido = apellido;
        this.hijos = new Persona[2];
    }

    public String getApellido() {
        return apellido;
    }

    public Persona getMadre() {
        return madre;
    }

    public Persona getPadre() {
        return padre;
    }

    public Persona[] getHijos() {
        return hijos;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMadre(Persona madre) {
        this.madre = madre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }

    public void setHijos(Persona[] hijos) {
        this.hijos = hijos;
    }
    
    

}
