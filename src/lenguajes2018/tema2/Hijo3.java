
package lenguajes2018.tema2;

public class Hijo3 extends Hijo2{

    int v5;
    

    @Override
    public void init() {
        Sistema.print(-1000310001);
        super.init();
        v5 = 5;
    }
    
    public void superSeter(int p1, int p2, int p3, int p4, int p5){
        Sistema.print(-1000320001);
        this.superSeter(p1, p2, p3, p4);
        v5 = p5;
    }

    @Override
    public int m4() {
        Sistema.print(-1000340001);
        int v = Sistema.read();
        int t2 = m7(v);
        int t1 = m5();
        Hijo4 x = new Hijo4();
        int w = x.m3();
        return w+t2+t1+(v1*v2)+(v3*v4*v5);
    }
    
    
    
    

    
       
    

   
    
}
