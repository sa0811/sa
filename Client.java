package com.ClientServer.client;

import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String msg = scn.nextLine();
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), ip, 3000);
        ds.send(dp);
        ds.close();
        scn.close();
        System.out.println("Message has been sent to Receiver class please check: " + msg);
    }
}
