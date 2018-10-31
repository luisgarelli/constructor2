
package constructor2;

public class humano {
 String nombre ;
  int dorsal ;
  String posicion;
  int edad;
 
 
  
  public humano(){
      System.out.println("Constructor sin parametros");
 }
   public humano(String nombre , int edad){
       this.nombre= nombre;
       this.edad = edad ;
  }
  public humano(String nombre , int dorsal , String posicion){
      System.out.println("hola equipo");
      
      
       this.nombre = nombre;
       this.dorsal = dorsal;
       this.posicion = posicion;
       
  }
  
  public static void main (String []args){
     System.out.println("datos del equipo");
      humano arquero = new humano();
     
      humano defensor = new humano("marcos" ,5 ,"defensor" );
      
            System.out.println("DATOS DEL CAPITAN");

      System.out.println("Nombre de pila : "+defensor.nombre); 
      System.out.println("Dorsal : "+defensor.dorsal);
      System.out.println("Posicion : "+defensor.posicion);
      humano medio = new humano ("Paul",6,"mediocampista");
       System.out.println("LA ESTRELLA DEL EQUIPO");
      System.out.println("Nombre de pila : "+medio.nombre); 
      System.out.println("Dorsal : "+medio.dorsal);
      System.out.println("Posicion : "+medio.posicion);
      humano extremo = new humano("Alexis",7,"delatero");
      System.out.println("EL NIÑO MARAVILLA");
      System.out.println("Nombre de pila : "+extremo.nombre); 
      System.out.println("Dorsal : "+extremo.dorsal);
      System.out.println("Posicion : "+extremo.posicion);
       humano dt = new humano("jose",55);
      System.out.println("DIRECTOR TECNICO");
      System.out.println("Nombre de pila : "+dt.nombre); 
      System.out.println("Edad : "+dt.edad);
      
      
  } 
  
    
}
