package com.gara.hellodemo.socket;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @description: TODO BIO client
 * @author: GaraYing
 * @create: 2018-08-29 10:14
 **/

public class SocketClient {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost",8888);

            PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);

            writer.write("你好，再见~");

            writer.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
