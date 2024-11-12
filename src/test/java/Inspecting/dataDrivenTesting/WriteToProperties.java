package Inspecting.dataDrivenTesting;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.util.Properties;

public class WriteToProperties {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Data.properties");
		Properties  property =new Properties();
		property.load(fis);
		
		property.put("user2", "user");
		property.put("pwd2", "12345");
		
		FileOutputStream fos=new FileOutputStream("");
		property.put(fos,"Updated Successfully");
		
		

	}

}
