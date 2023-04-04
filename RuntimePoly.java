package JavaSeries.Programs;

public class RuntimePoly {
    int n;

    RuntimePoly(){
        int gg = this.n;
    }
    public static void main(String[] args) {
        RuntimePoly bb = new RuntimePoly();
    }
}

abstract class Bird{
    abstract void meth();

    int v;

    public static void main(String[] args) {

    }
}

class Crow extends Bird{
    void meth(){

    }
}

class CrowChild extends Crow implements Hoooo{


    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}

interface Hoooo{
    abstract void m1();
    void m2();
    void m3();


}