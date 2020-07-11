import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
public class CsvRead {
	public static void main(String[] args)   
	{  
	String line = "";  
	String splitBy = ",";  
	int priceindex=0;
	try   
	{  
	//parsing a CSV file into BufferedReader class constructor  
	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\Downloads\\Sacramentorealestatetransactions.csv"));  
	
	line=br.readLine();
	String[] realestate = line.split(splitBy);
	for(int i=0;i<realestate.length;i++)
	{
		if(realestate[i].equals("price"))
		{
			System.out.println("price");
			priceindex=i;			
		}
	}
	
	while ((line = br.readLine()) != null)   //returns a Boolean value  
	{  
	 realestate = line.split(splitBy); // use comma as separator 
	
		
	
	
	System.out.println(realestate[priceindex]);
	
	
	} 
	
	}   
	catch (IOException e)   
	{  
	e.printStackTrace();  
	}  
	
	}  
	
}
