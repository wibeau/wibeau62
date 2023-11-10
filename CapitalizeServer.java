package EX;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CapitalizeServer {

    public static void main(String[] args)throws Exception{
        ServerSocket listener=new ServerSocket(7777);
        System.out.println("The capitalization server is funning....");
        ExecutorService pool = Executors.newFixedThreadPool(20);
        // 스레드 풀을 생성하는 부분. 스레드 풀은 스레드를 효율적으로 관리하고 재사용하는데 도움을 줌
        // 최대 20개의 스레드 생성 가능
        while (true){


            Socket sock=listener.accept();
            pool.execute(new Capitalizer(sock));
        }
    }
    
}

class Capitalizer implements Runnable
// implements runnable 은 인터페이스를 구현하는 클래스를 나타낸다.
// 해당 클래스가 스레드로 실행될 수 있또록 스레드가 실행할 코드를 제공하는 인터페이스를 구현한다는 것.
{

private Socket socket;
Capitalizer(Socket socket){


this.socket=socket;

}
public void run(){


try{} catch (Exception e){}finally{}






}





}