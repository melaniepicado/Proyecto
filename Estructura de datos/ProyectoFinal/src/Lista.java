/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MIKE-PC
 */
public class Lista {
    
    private NodoC cabeza;
    private NodoC ultimo;
    
    public void inserta(Cliente p){
        if(cabeza==null){
            cabeza = new NodoC(p);
            ultimo = cabeza;
        }else if(p.getCedula()<cabeza.getDato().getCedula()){ 
            NodoC aux = new NodoC(p);
            aux.setNext(cabeza);
            cabeza=aux;
        }else if(ultimo.getDato().getCedula() <= p.getCedula()){
            ultimo.setNext(new NodoC(p));
            ultimo = ultimo.getNext();
        }else{
           NodoC aux = cabeza;
           while (aux.getNext().getDato().getCedula() < p.getCedula()){
               aux=aux.getNext();
           }
           NodoC temp = new NodoC(p);
           temp.setNext(aux.getNext());
           temp.setBack(aux);
           aux.setNext(temp);
           temp.getNext().setBack(temp); //nuevo
        }
        ultimo.setNext(cabeza);
        cabeza.setBack(ultimo); 
    }    
    @Override
    public String toString(){
        NodoC aux = cabeza;
        String s="Lista: ";
        if (aux != null){
            s+=aux+", ";
            aux=aux.getNext();
            while(aux != cabeza){
                s+=aux+", ";
                aux=aux.getNext();
            }
        } else{
            s+="vacia";
        }
        return s;
    }
    
}
