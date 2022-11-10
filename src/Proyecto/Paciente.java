/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author sebas
 */
public class Paciente {
 
    String nombre;
    
    ListaMedicamentos LaLista = new ListaMedicamentos();

    public Paciente(String nombre) {
        this.nombre = nombre;
    }

    public Paciente() {
        this.nombre = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaMedicamentos getLaLista() {
        return LaLista;
    }

    public void setLaLista(ListaMedicamentos LaLista) {
        this.LaLista = LaLista;
    }
}
