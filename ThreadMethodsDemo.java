public class ThreadMethodsDemo extends Thread {
public void run() {
for(int i=0;i<10;i++) {//running state
System.out.println("thread methods demo");
try {
System.out.println("thread is going to sleep");
ThreadMethodsDemo.sleep(1000);
 
System.out.println("thread wake up");
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace(); //this is waiting state
}
}
}
public static void main(String[] args) throws
InterruptedException {
ThreadMethodsDemo de = new ThreadMethodsDemo();
 //This is new State
System.out.println("getstate1"+de.getState());
//Runnable state
de.start();
System.out.println("getstate2"+de.getState());
System.out.println("getstate3"+de.getState());
System.out.println("getstate4"+de.getState());
System.out.println("thread Name"+de.getName());
System.out.println("thread Priority"+de.getPriority());
System.out.println("getstate5"+de.getState());
}
}