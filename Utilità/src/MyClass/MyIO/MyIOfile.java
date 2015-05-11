package MyClass.MyIO;

import java.io.*;
import java.util.Scanner;

public class MyIOfile {
	private MyIOfile(){
	}
	
	public static String leggiRiga(String path) throws Exception{
		String frase="";
		
		FileReader file=new FileReader(path);
		
		Scanner lettore=new Scanner(file);
		
		if(lettore.hasNextLine())
			frase=lettore.nextLine();
		
		lettore.close();
		
		return frase;
	}
}
