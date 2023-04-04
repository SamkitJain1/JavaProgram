package JavaSeries.Programs;
class SynchronisationJava{
    public static void main(String[] args) {

        Table table1 = new Table();
        Table table2 = new Table();

        MyThread1 t1 = new MyThread1(table1, 1);
        MyThread2 t2 = new MyThread2(table2, 2);

        t1.start();
        t2.start();

    }
}

class MyThread1 extends Thread{
    Table tt;
    int i;

    MyThread1(Table table, int i){
        this.i = i;
        this.tt = table;
    }

    public void run(){
        tt.printTable(i);
    }
}

class MyThread2 extends Thread{
    Table tt;
    int i;

    MyThread2(Table table, int i){
        this.i = i;
        this.tt = table;
    }

    public void run(){
        tt.show();
    }
}

class Table{
    static int num1;
    synchronized void printTable(int num){
        for (int i=1; i<=10; i++){
            try{
                Thread.sleep(100);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            num1 = num*i;
            System.out.println(num + " x " + i + " = " + num1);
        }
    }

    synchronized void show(){
        for (int i=0; i<10; i++) {
            num1 += 1000;
            System.out.println(Thread.currentThread().getName() + "..." + num1);
            try {
                Thread.sleep(100);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}