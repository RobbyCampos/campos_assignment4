package campos_problem2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry; 

public class DuplicateCounter {


	private static Map<String, Integer> words = new HashMap<String, Integer>();
	private static Set<Entry<String, Integer>> wordCounter = words.entrySet(); 
	
	public void count(String dataFile)
	{
		try {
			Scanner file = new Scanner(new File(dataFile));
			while(file.hasNext())
			{
				String word = file.next();
				Integer count = words.get(word);
				if(count != null)
					count++;
				else
					count = 1;
				words.put(word, count);
			}
			file.close();
		} catch (FileNotFoundException e) {
			 System.out.println (e.toString());
		     System.out.println("Sorry, could not make file problem1.txt");
		}
		
	}
	
	
	public void write(String outputFile)
	{	
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));	
			Iterator it = wordCounter.iterator();
			while(it.hasNext())
			{
				writer.write((String.valueOf(it.next())));
				writer.newLine();
			}
			writer.close();
			}
		catch(IOException e){
			 System.out.println (e.toString());
		     System.out.println("Sorry, could not make file unique_word_counts.txt");
			}
	}
}
