package campos_problem1;

public class Application {
	
	private static String inFile = "src/problem1.txt";
	private static String outFile = "src/unique_words.txt";

	public static void main(String args[]) {
		
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		duplicateRemover.remove(inFile);
		duplicateRemover.write(outFile);
		
	}
	
}
