package HW1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

class ServerConfiguration {

    private String serverIP;
    private int port;

    public ServerConfiguration() {

        // 설정 파일에서 읽기 시도
        readConfigurationFromFile("server_info.dat");
    }

    private void readConfigurationFromFile(String fileName) {
        File file = new File(fileName);

        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                // 파일에서 서버 정보 읽기
                this.serverIP = reader.readLine();
                this.port = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No server information");
            System.exit(1); //비정상종료
        }
    }

    public String getServerIP() {
        return serverIP;
    }

    public int getPort() {
        return port;
    }

}
// 외부 텍파에서 서버 정보를 읽어옴.


public class HW1_server {

    public static void main(String[] args){

        ServerConfiguration config = new ServerConfiguration();
        ServerSocket listener=null; 
        //서버 소켓은 문지기
        Socket socket=null;
        //실제 데이터 주고받는 소켓은 socket.


        try{
            listener=new ServerSocket(config.getPort());
            socket=listener.accept();
            System.out.println("connected");



        }




    }
    
}
