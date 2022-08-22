public class Pila {
    private NodoP cima;
    private int largo;

    public Pila() {
        this.cima = null;
        this.largo = 0;
    }    

    public boolean Vacia(){ return cima == null;}
    
    public int tamanio(){ return this.largo;}
    
    public void push(Alquiler_Vehiculos dato){
        NodoP newNode = new NodoP();
        newNode.setDato(dato);
        
        if (this.Vacia()){
            this.cima = newNode;
        }
        else{
            newNode.setSiguiente(this.cima);
            this.cima = newNode;
        }
        this.largo++;
    }
     
     public void listar(){
        NodoP aux = cima;
        while(aux != null){
            System.out.println("|\t" + aux.getDato()+ "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }
}
