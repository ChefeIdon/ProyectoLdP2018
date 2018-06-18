
package lenguajes2018.tema2;


public class Hijo2 extends Padre{

    int v4;
    


    @Override
    public void init() {
        Sistema.print(-1000210001);
        super.init();
        v4 = 4;
    }
    
    public void superSeter(int p1, int p2, int p3, int p4){
        Sistema.print(-1000220001);
        this.superSeter(p1, p2, p3);
        v4 = p4;
    }

    @Override
    public int m4() {
        Sistema.print(-1000240001);
        int t1 = m7(8);
        int t2 = m6();
        Hijo3 x = new Hijo3();
        int w = x.m3();
        return w+ t1 + t2+ (v1+v2)*(v3+v4);
    }
    
    public int m6(){
        Sistema.print(-1000260001);
        return 10;
    }
    
    public int m7(int p){
        Sistema.print(-1000270001);
        v2 = p;
        return p*v4;
    }
    
    
    

    
       
    

   
    
}
