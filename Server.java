package com.ClientServer.server;

import java.net.*;

public class Server {

    public static void main(String[] args) throws Exception {
        System.out.println("Waiting for Sender to send the message...");
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, 1024);
        ds.receive(dp);
        String msg = new String(dp.getData(), 0, dp.getLength());
        System.out.println("Client: " + msg);
        ds.close();
        System.out.println("Message received!");
    }

}
