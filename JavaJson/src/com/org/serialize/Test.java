package com.org.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		try {
			
			//����һ��������������ļ���ַ:I:/temp.out
			FileOutputStream fos = new FileOutputStream("G:\\temp.out");
		    ObjectOutputStream oos = new ObjectOutputStream(fos);
		    //����һ����Ҫ���л��Ķ���
			TestSerial ts = new TestSerial();
			//�����л��Ķ���д������
			System.out.println("��ʼ���������л�������");
			oos.writeObject(ts);
			oos.flush();
		    oos.close(); 
		    System.out.println("���л�����");
		    
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
//https://dzone.com/articles/5-different-ways-to-create-objects-in-java-with-ex