package com.org.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test2 {


	public static void main(String[] args) {
		
      try {
    	    //����һ���ļ����������󣬽��ļ�д�뵽�ڴ�
	        FileInputStream fis = new FileInputStream("G:/temp.out");
	        ObjectInputStream oin = new ObjectInputStream(fis);
	        //��ȡ�������л��Ķ���
			TestSerial ts = (TestSerial)oin.readObject();
			//�������������Ϣ
			System.out.println("version==="+ts.version);
			System.out.println("count==="+ts.count);
			System.out.println("name==="+ts.name);
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
