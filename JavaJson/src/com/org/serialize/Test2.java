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
    	    //定义一个文件输入流对象，将文件写入到内存
	        FileInputStream fis = new FileInputStream("G:/temp.out");
	        ObjectInputStream oin = new ObjectInputStream(fis);
	        //获取被反序列化的对象
			TestSerial ts = (TestSerial)oin.readObject();
			//输出对象的相关信息
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
