package campos_problem2;

public class Application {

	private static String inFile = "src/problem1.txt";
	private static String outFile = "src/unique_word_counts.txt";

	public static void main(String args[]) {
		
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		duplicateCounter.count(inFile);
		duplicateCounter.write(outFile);
		
	}
	
}
