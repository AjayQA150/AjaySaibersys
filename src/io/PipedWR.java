package io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedWR {
public static void main(String[] args) throws Exception {
	final PipedOutputStream pout=new PipedOutputStream();
	final PipedInputStream pin =new PipedInputStream();
	pout.connect(pin);//connecting the streams
	//creating one thread which writes the data
	
	Thread t1=new Thread(){
		public void run(){
			for(int i=65;i<=90;i++)
				try{
					pout.write(i);
					Thread.sleep(1000);
				}catch(Exception e){}
			}
	};
	//creating another thread t2 which reads the data
	Thread t2=new Thread(){
		
	try{
		for(int i=65;i<=90;i++)
			System.out.println(pin.read());
		}catch(Exception e){}
}
};



