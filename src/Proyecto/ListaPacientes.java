/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class ListaPacientes {
    
    NPaciente primero;
    NPaciente ultimo;
    Scanner teclado = new Scanner(System.in);

    public ListaPacientes() {
        primero = null;
        ultimo = null;
    }

    public void InsertarPaciente(Paciente dato) {

        NPaciente nodoNuevo = new NPaciente();

        nodoNuevo.setElPaciente(dato);

        if (primero == null) {

            primero = nodoNuevo;
            primero.siguiente = null;
            ultimo = primero;

        } else {
            ultimo.siguiente = nodoNuevo;
            nodoNuevo.siguiente = null;
            ultimo = nodoNuevo;

        }

    }

    public void AsignarMedicamento(Medicamento dato, String nombre) {

        NPaciente actual = primero;

        while (actual != null) {

            if (actual.getElPaciente().getNombre().equals(nombre)) {

                actual.getElPaciente().getLaLista().InsertarMedicamento(dato);
                dato.setUsuarios(dato.getUsuarios() + 1);
            }

            actual = actual.getSiguiente();

        }

    }

    public void Verlista() {

        NPaciente actual = new NPaciente();
        actual = primero;

        while (actual != null) {
            System.out.println(actual.ElPaciente.getNombre()+":");
            actual.getElPaciente().LaLista.Verlista();
            actual = actual.siguiente;
        }

    }

    public void ListaVacia() {

        NPaciente actual = new NPaciente();
        actual = primero;

        while (actual != null) {
            if (actual.ElPaciente.LaLista.primero == null) {
                
                System.out.println(actual.ElPaciente.getNombre());
                
            }
            actual = actual.siguiente;
        }

    }
}
