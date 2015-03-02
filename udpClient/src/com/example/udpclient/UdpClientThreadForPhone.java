package com.example.udpclient;

public class UdpClientThreadForPhone extends Thread {

	private int UdpDataType = -1;

	
	
	public int getUdpDataType() {
		return UdpDataType;
	}

	public void setUdpDataType(int udpDataType) {
		UdpDataType = udpDataType;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		switch(UdpDataType){
		case UdpThreadTools.SEND_ONLINE_UDP_MSG:
		case UdpThreadTools.SEND_OFFLINE_UDP_MSG:
		case UdpThreadTools.SEND_UDP_DATAGRAM:
		
		}
	}

}
