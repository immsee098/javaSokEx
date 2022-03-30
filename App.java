//package jpabook.start;


import java.util.Scanner;

public class App{
    public static void main( String[] args ) {
        String ip;
        int port;

        Scanner sc = new Scanner(System.in);
        System.out.println("ip를 입력하세요");
        ip = sc.next();
        port = sc.nextInt();
        System.out.println("Start>>");
        new Client1(ip, port);
    }
}