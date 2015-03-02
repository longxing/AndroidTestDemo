package com.example.udpclient;

import android.content.Context;

public class UdpClientForPhone {
  
	private UdpClientForPhone udpClientForPhone;
	private UdpClientForPhone(){}
	public UdpClientForPhone getInstance(Context context){
		if(udpClientForPhone== null){
			udpClientForPhone = new UdpClientForPhone();
		}
		return udpClientForPhone;
	}
	
}
