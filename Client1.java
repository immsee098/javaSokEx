//package jpabook.start;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    private Socket socket;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;


    public Client1(String ip, int port) {
        Scanner sc = new Scanner(System.in);

        String CameraId;
        String stopFlag = "no";

        try {
            // 서버에 요청 보내기
            System.out.println("::Connecting::");
            socket = new Socket(ip, port);

            System.out.println("::start::");
            System.out.println(socket.getInetAddress().getHostAddress() + "에 연결됨");

            DataSend dsend1 = new DataSend();

            while(stopFlag != "yes") {
                //카메라 id 세팅
                CameraId = sc.next();
                dsend1.setUrl("Model=Kex&User=scmo&CameraId="+CameraId+"&RequestId=D");

                oos = new ObjectOutputStream(socket.getOutputStream());
                oos.writeObject(dsend1);
                oos.flush();

                ois = new ObjectInputStream(socket.getInputStream());

                // 응답 출력
                System.out.println(ois.read());

                stopFlag = sc.next();
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            // 소켓 닫기 (연결 끊기)
            try {
                if(socket != null) { socket.close(); }
                if(oos != null) { oos.close(); }
                if(ois != null) { ois.close(); }
//                if(br != null) { br.close(); }
//                if(pw != null) { pw.close(); }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
