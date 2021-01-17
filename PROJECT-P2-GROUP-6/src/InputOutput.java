import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class InputOutput{
	ArrayList<String>nfo=new ArrayList<String>();
	String Id; 
	String Fname;
	String Lname;
	String adds;
	String datepack;
	String filepath="record.txt";
	String id="";String fname="";String lname="";String choosepack="";

	private static Scanner x;
	
	public void addrec(String a,Object b,String c,String d,Object e,Object f) {
	
		try
		{
			FileWriter fw= new FileWriter(filepath,true);
			BufferedWriter bw= new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			
			pw.println(a+","+b+","+c+","+d+","+e+","+f);
			pw.flush();
			pw.close();
			
		}catch(Exception e1) {
			JOptionPane.showMessageDialog(null, "Try again later");
		}
	}
	public void remrec(String a) {
		String tempFile="temp.txt";
		File oldFile= new File(filepath);
		File newFile= new File(tempFile); 
		String id="";String fname="";String lname="";String adds="";String datepack="";String choosepack="";
		try {
			FileWriter fw= new FileWriter(tempFile,true);
			BufferedWriter bw= new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			x=new Scanner(new File(filepath));
			x.useDelimiter("[,\n]");
			
			while(x.hasNext()) {
				id=x.next();
				
				fname=x.next();
				lname=x.next();
				adds=x.next();
				datepack=x.next();
				choosepack=x.next();
				
				if(!id.equals(a)) {
					pw.println(id+","+fname+","+lname+","+adds+","+datepack+","+choosepack);				}
				
				
			}
			x.close();
			pw.flush();
			pw.close();
			bw.close();
			fw.close();
			oldFile.delete();
			File dump = new File(filepath);
			newFile.renameTo(dump);
			JOptionPane.showMessageDialog(null, a+" has been deleted");
		}catch(Exception e1) {
			JOptionPane.showMessageDialog(null, "Error");
		}
	}
	
	public ArrayList<String> print() {
		try {
		
		FileWriter fw= new FileWriter(filepath,true);
		BufferedWriter bw= new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(bw);
		
		x=new Scanner(new File(filepath));
		x.useDelimiter("[,\n]");
		
		for(int i=0;x.hasNext();i++) {
			fname=x.next();
			lname=x.next();
			adds=x.next();
			datepack=x.next();
			choosepack=x.next();
			nfo.add(i, id+","+fname+","+lname+","+adds+","+datepack+","+choosepack);
		}
		x.close();
		pw.flush();
		pw.close();
		bw.close();
		fw.close();
		}catch(Exception e1){
			JOptionPane.showMessageDialog(null, "Something went Wrong");
		}
		
		return nfo;
	}

}