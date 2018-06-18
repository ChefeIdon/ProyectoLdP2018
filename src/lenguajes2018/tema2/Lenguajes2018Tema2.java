
package lenguajes2018.tema2;

import java.io.IOException;


public class Lenguajes2018Tema2 {

  
      
    public static void main(String[] args) throws IOException {
        Sistema.print(-1000910001);
        
        Padre v1 = new Padre();
        computar(v1);
        
       
    }
    
    public static void computar(Padre p){
        Sistema.print(-1000920001);
        p.init();
        
        int x = Sistema.read();
        p.v1 = x;
        
        int r = p.m3();
        Sistema.print(r);
        
    }
    
}
