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
public class ListaMedicamentos {
    
    NMedicamento primero;
    NMedicamento ultimo;
    Scanner teclado = new Scanner(System.in);

    public ListaMedicamentos() {
        primero = null;
        ultimo = null;
    }

    public void InsertarMedicamento(Medicamento dato) {

        NMedicamento nodoNuevo = new NMedicamento();

        nodoNuevo.setElMedicamento(dato);

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

    public Medicamento Buscar(String dato) {

        NMedicamento actual = new NMedicamento();
        actual = primero;
        while (actual != null) {

            if (actual.ElMedicamento.getNombre().equals(dato)) {

                return actual.ElMedicamento;
            }

            actual = actual.siguiente;

        }
        return null;
    }
    
    
    public void Verlista() {

        NMedicamento actual = new NMedicamento();
        actual = primero;

        while (actual != null) {
            System.out.println("\t"+actual.ElMedicamento.getNombre());
            actual = actual.siguiente;
        }

    }
    
    
    public void Eliminar(String dato) {

        NMedicamento actual = new NMedicamento();
        NMedicamento anterior = new NMedicamento();
        actual = primero;
        anterior = null;
        
        while (actual != null) {

            if (actual.ElMedicamento.getNombre().equals(dato) && actual.getElMedicamento().usuarios == 0) {
                
                if(actual == primero){
                   
                    primero = primero.siguiente;  
                    
                }else{
                   
                    anterior.siguiente = actual.siguiente;
                    
                }
            }
            
            anterior = actual;
            actual = actual.siguiente;

        }
    }
    
}
