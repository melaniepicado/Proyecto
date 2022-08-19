/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MIKE-PC
 */
public class NodoC {
    
    private Cliente dato;
    private NodoC next;
    private NodoC back;
    
    @Override
    public String toString(){
        return "Nodo{"+"dato="+dato+'}';
    }
    
    public NodoC(Cliente dato){
        this.dato=dato;
    }

    public Cliente getDato() {
        return dato;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    public NodoC getNext() {
        return next;
    }

    public void setNext(NodoC next) {
        this.next = next;
    }

    public NodoC getBack() {
        return back;
    }

    public void setBack(NodoC back) {
        this.back = back;
    }
    
}
