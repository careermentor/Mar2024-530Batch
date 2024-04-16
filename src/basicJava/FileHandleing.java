package basicJava;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileHandleing 
{
	
	public static void propdata() throws Exception
	{
		FileReader fr = new FileReader("./TestData/data.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("langaunag"));
		System.out.println(prop.get("automation"));
	
	}

	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");
		FileWriter fr = new FileWriter(f,true);
		
		fr.write("\nThis is third line of data");
		fr.flush(); //save
		fr.close();
		
	}
	
	public static void readdata() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Desktop\\abc.txt");
		
		//File f = new File("./TestData/abc.txt");
		//FileReader fr = new FileReader(f);
		
		FileReader fr = new FileReader("./TestData/abc.txt");
		
		int r = fr.read();  //116
		
		
		while(r!=-1)  //116!=-1, 104!=-1
		{
			System.out.print((char)r);
			r = fr.read();
		}
		
		
	}
	
	public static void main(String[] args) throws Exception
	{
		FileHandleing.propdata();
		FileHandleing.writedata();
	}
	
}
