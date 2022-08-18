public class Pila {
   
 
    private NodoP cima;
    private int largo;

    public Pila() {
        this.cima = null;
        this.largo = 0;
    }    

    public boolean Vacia(){ return cima == null;}
    
    public int tamanio(){ return this.largo;}
    
    public void push(String Letra){
        Node newNode = new Node();
        newNode.setLetra(Letra);
        
        if (this.Vacia()){
            this.cima = newNode;
        }
        else{
            newNode.setSiguiente(this.cima);
            this.cima = newNode;
        }
        this.largo++;
    }
    
     public String Cadena(String letra){
         
          if(letra == letra ){
           push("");
           push("");  
           push("");
           push("");
           push("");
              return letra;
          }else{
              return letra;
          }
      }
     
     public void listar(){    
        Node aux = cima;
        while(aux != null){
            System.out.print(aux.getLetra()+" ");
            aux = aux.getSiguiente();
        }
    }
}
