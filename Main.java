package hang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
public static void reader(){

	String text="";
	try {
		String thisLine = "";
		BufferedReader br = new BufferedReader(new FileReader(path));
		while ((thisLine = br.readLine()) != null) {
		text=text + thisLine;
		}
		br.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
 	String[] textSplit = text.split(","); 

 		}

public static void writer(){

	
	try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
		

		bw.write(add);
		bw.newLine();
		bw.write("#,");
		bw.flush();
		bw.close();
} catch (Exception e) {
	e.printStackTrace();
}
	
	

}
public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
