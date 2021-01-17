import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

	public class TravelOperation 
	{
	 //Add record - the data will be saved in travellerInfo.txt 
	 public void addRecord(Travel Traveller) throws IOException
	  
	  {
		  File fileName = new File ("travellerInfo.txt");
		  FileWriter fw = new FileWriter(fileName);
		  PrintWriter pw = new PrintWriter(fw);  
		  
		  pw.println(Traveller.getDate());
		  pw.println(Traveller.getName());
		  pw.println(Traveller.getIC());
		  pw.println(Traveller.getPA());
		  pw.println(Traveller.getDOB());
		  pw.println(Traveller.getPOB());
		  pw.println(Traveller.getEA());
		  pw.println(Traveller.getOpinion());
		 
		  pw.close();
		  fw.close();
	  }
}
