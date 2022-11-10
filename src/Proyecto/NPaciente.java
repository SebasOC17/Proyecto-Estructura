/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author sebas
 */
public class NPaciente {
    
    Paciente ElPaciente = new Paciente();
    NPaciente siguiente;

    public Paciente getElPaciente() {
        return ElPaciente;
    }

    public void setElPaciente(Paciente ElPaciente) {
        this.ElPaciente = ElPaciente;
    }

    public NPaciente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NPaciente siguiente) {
        this.siguiente = siguiente;
    }
}
