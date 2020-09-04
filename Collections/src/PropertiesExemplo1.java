
import java.util.*;  
import java.io.*;  

public class PropertiesExemplo1 {  
	public static void main(String[] args)throws Exception{  
		FileReader reader=new FileReader("Config.properties");  

		Properties p=new Properties();  
		p.load(reader);  

		System.out.println(p.getProperty("aplicativo"));  
		System.out.println(p.getProperty("versao"));  
//		System.out.println(p);  
		
	}  
}  