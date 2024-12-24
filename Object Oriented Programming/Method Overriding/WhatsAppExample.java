package com.JSP.MethodOverriding;

class WhatsApp1 {
	void sent()
	{
		System.out.println("Single Tick");
	}
}
class WhatsApp2 extends WhatsApp1 {
	@Override 
	protected void sent()
	{
		super.sent();
		System.out.println("Double Tick");
	}
	void voiceNote()
	{
		System.out.println("Voice Message");
	}
}
class WhatsApp3 extends WhatsApp2{
	@Override
	public void sent()
	{
		super.sent();
		System.out.println("Double Blue Tick");
	}
	
	public void videoCall()
	{
		System.out.println("Normal Video Call");
	}
}
class WhatsApp4 extends WhatsApp3 {
	@Override 
	public void videoCall()
	{
		System.out.println("HD Video Call");
	}
}

public class WhatsAppExample {

	public static void main(String[] args) {
		
		WhatsApp4 w4 = new WhatsApp4();
		w4.sent();
		w4.voiceNote();
		w4.videoCall();

	}

}
