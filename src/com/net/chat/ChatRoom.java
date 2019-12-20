package com.net.chat;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class ChatRoom {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入聊天服务当前启动端口号:");
		int serverPort=scanner.nextInt();
		System.out.println("请输入聊天服务发送信息对象的目标端口号:");
		int targetPort=scanner.nextInt();
		System.out.println("聊天系统初始化完成并启动!!!!!");
		try {
			DatagramSocket udp_socket=new DatagramSocket(serverPort);
			new Thread(new ChatReceiver(udp_socket),"接收服务").start();
			new Thread(new ChatSend(udp_socket,targetPort),"发送服务").start();
		}catch(SocketException e) {
			e.printStackTrace();
		}
	}
}