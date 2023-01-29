package ScalerReboot;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class mock1 implements Runnable{

 public void run(){
    System.out.println("Hello");
 }

}
public class mock {
 public static void main(String[] args) {
    System.out.println("Inside : " + Thread.currentThread().getName());

    System.out.println("Creating Executor Service...");
    ExecutorService executorService = Executors.newFixedThreadPool(2);

    System.out.println("Creating a Runnable...");
    Runnable runnable1 = new mock1();
    Runnable runnable2 = new mock1();
    Runnable runnable3 = new mock1();

    System.out.println("Submit the task specified by the runnable to the executor service.");
    executorService.submit(runnable1);

    executorService.submit(runnable2);

    executorService.submit(runnable3);
 }
}