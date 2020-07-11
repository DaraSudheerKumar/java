import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ReadFileNamesInFirst {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		  // We need to provide file path as the parameter: 
		  // double backquote is to avoid compiler interpret words 
		  // like \test as \t (ie. as a escape sequence) 
		  File file = new File("E:\\1.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  ArrayList<String> a=new ArrayList<String>();
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		  {
			  a.add(st);
		    //System.out.print(st+" "); 
		  }
		// like \test as \t (ie. as a escape sequence) 
		  File file1 = new File("E:\\2.txt"); 
		  
		  BufferedReader br1 = new BufferedReader(new FileReader(file1)); 
		  ArrayList<String> a1=new ArrayList<String>();
		  ArrayList<String> result=new ArrayList<String>();
		  String st1; 
		  while ((st1 = br1.readLine()) != null) 
		  {
			  a1.add(st1);
		    //System.out.print(st1+" "); 
		  }
		  System.out.println(a);
		  System.out.println(a1);
		  
		  for(int i=0;i<a.size();i++)
		  {    result.add(a.get(i));
			  if(a1.contains(a.get(i)))
			  {
				  result.remove(a.get(i));
			  }
		      
			  
		  }
		  System.out.println(result);
		  } 

	}


