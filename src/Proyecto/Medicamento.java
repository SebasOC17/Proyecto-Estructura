/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author sebas
 */
public class Medicamento {
    
    String nombre;
    int usuarios;

    public Medicamento() {
        this.nombre="";
        this.usuarios = 0;
    }

    public Medicamento(String nombre) {
        this.nombre = nombre;
        this.usuarios = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(int usuarios) {
        this.usuarios = usuarios;
    }
}
