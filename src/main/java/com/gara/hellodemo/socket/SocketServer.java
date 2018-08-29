package com.gara.hellodemo.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @description: BIO Server
 * @author: GaraYing
 * @create: 2018-08-29 10:01
 **/

public class SocketServer  {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(8888);//启动一个服务
            Socket socket = serverSocket.accept();//阻塞状态

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.println("服务端接收到请求数据:"+reader.readLine());
            while (reader.read()!=1){

            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null)
                serverSocket.close();
        }
    }
}
