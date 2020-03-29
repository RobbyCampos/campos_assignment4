package campos_problem1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
 

public class DuplicateRemover {
	
	private static String fileName = "src/problem1.txt";
	private static LinkedHashSet<String> uniqueWords = new LinkedHashSet<String>(5000000);
	
	public void remove(String dataFile)
	{
		try {
			BufferedReader reader = new BufferedReader(new FileReader(dataFile));
			
			String line;
			
			while((line = reader.readLine()) != null) {
				uniqueWords.add(line);
				}
			
			reader.close();
			}
		catch(IOException e){
			 System.out.println (e.toString());
		     System.out.println("Sorry, could not find file problem1.txt");
			}
		
	}
	
	public void write(String outputFile)
	{
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));	
			for(String unique : uniqueWords) 
			{
				writer.write(unique);
				writer.newLine();
			}
			writer.close();
			}
		catch(IOException e){
			 System.out.println (e.toString());
		     System.out.println("Sorry, could not make file unique_words.txt");
			}

	}
	
}
	