
package lenguajes2018.tema2;


public class Padre {
    int v1, v2, v3;


    public void init(){
        Sistema.print(-1000110001);
        v1 = 1;
        v2 = 2;
        v3 = 3;
    }
    
    public void superSeter(int p1, int p2, int p3){
        Sistema.print(-1000120001);
        v1 = p1;
        v2 = p2;
        v3 = p3;
    }
    
    public int m3(){
        Sistema.print(-1000130001);
        init();
        return m4();
    }
    
    public int m4(){
        Sistema.print(-1000140001);
        Hijo2 x = new Hijo2();
        int w = x.m3();
        return w+v1+v2+v3;
    }
    
    public int m5(){
        Sistema.print(-1000150001);
        int x = Sistema.read();
        int r = 0;
        for(int i = 0; i < x; i=i+1){
            r = r + v3*i;
        }
        
        return r;
    }
    


    
    
    
    
    
    
}

