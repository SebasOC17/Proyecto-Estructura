/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author sebas
 */
public class NMedicamento {
    
    Medicamento ElMedicamento = new Medicamento();
    
    NMedicamento siguiente;

    public Medicamento getElMedicamento() {
        return ElMedicamento;
    }

    public void setElMedicamento(Medicamento ElMedicamento) {
        this.ElMedicamento = ElMedicamento;
    }

    public NMedicamento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NMedicamento siguiente) {
        this.siguiente = siguiente;
    }
}
