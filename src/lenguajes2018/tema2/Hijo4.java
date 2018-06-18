
package lenguajes2018.tema2;

/**
 *
 */
public class Hijo4 extends Hijo3{

    Hijo4 v6;
    

    @Override
    public void init() {
        Sistema.print(-1000410001);
        super.init();
        v6 = new Hijo4();
        v6.superSeter(100, 200, 300, 400, 500);
        v6.v6 = null;
    }
    
    public void superSeter(int p1, int p2, int p3, int p4, int p5, int p6){
        Sistema.print(-1000420001);
        this.superSeter(p1, p2, p3, p4, p5);
       
    }

    @Override
    public int m4() {
        Sistema.print(-1000440001);
        int x = Sistema.read();
        Hijo4 t = v6;
        for(int i = 0; i < x; i = i+1){
            if(i > 3) continue; 
            t.v6 = new Hijo4();
            t = t.v6;
            t.init();
        }
        int t1 = m6();
        
        
         
        return t1+((v1+v2)/(v3+v4))*(v5);
    }
    
    public int m6(){
        Sistema.print(-1000460001);
        Hijo4 t = v6;
        int r = 0;
        while(t.v6 != null){
            r = t.m7(r) + r;
            t = t.v6;
        }
        return r;
    }

    
    
       
    

   
    
}
