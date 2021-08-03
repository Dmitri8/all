import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String...args) throws InterruptedException {
    int [] arr = {12, 23, 12,  1, 4, 45, 53, 31, 46, 87, 976, 54, 34, 45};

    for(int i = 2; i < arr.length; i+100){
        System.out.println(i - 100);
    }


    for(Integer i : arr) System.out.println(i);




    }
}
