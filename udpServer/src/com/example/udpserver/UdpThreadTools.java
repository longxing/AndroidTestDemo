package com.example.udpserver;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class UdpThreadTools {
	/*** send udp data type **/
	public final static int SEND_UDP_DATAGRAM = 0;
	public final static int RESPONSE_UDP_DATAGRAM = 1;
	public final static int SEND_ONLINE_UDP_MSG = 2;
	public final static int SEND_OFFLINE_UDP_MSG = 3;
	public final static int SEND_HERATBEAT_DATAPACKET = 4;
	/** udp state set param **/
	public static int HEARTBEAT_DELAY_TIME = 3000;
	public static String SEND_MulticastSocket_IP = "230.0.0.1"; //这些IP地址的范围是224.0.0.0至239.255.255.255
    public static int BOX_LISTENING_PORT = 6790;
    public static int PHONE_LISTENING_PORT = 6789;
    
    
    
    /**
     * 发送组播
     * @param ipAddress
     * @param port
     * @param msg
     * @throws Exception
     */
	public static void sendMulticastSocket(String ipAddress,int port,String msg) throws Exception {
		InetAddress group = InetAddress.getByName(ipAddress);
		MulticastSocket ms = new MulticastSocket(port);
		ms.joinGroup(group);
		DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(),group, port);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 2; j++) {
				ms.send(dp);
			}
			Thread.sleep(1000);
		}
		ms.leaveGroup(group);
	}
	
	
	

}
