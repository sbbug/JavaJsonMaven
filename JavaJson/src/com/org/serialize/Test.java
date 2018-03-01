package com.org.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		try {
			
			//创建一个对象输出流，文件地址:I:/temp.out
			FileOutputStream fos = new FileOutputStream("G:\\temp.out");
		    ObjectOutputStream oos = new ObjectOutputStream(fos);
		    //定义一个需要序列化的对象
			TestSerial ts = new TestSerial();
			//将序列化的对象写到磁盘
			System.out.println("开始将对象序列化到磁盘");
			oos.writeObject(ts);
			oos.flush();
		    oos.close(); 
		    System.out.println("序列化结束");
		    
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
//https://dzone.com/articles/5-different-ways-to-create-objects-in-java-with-ex