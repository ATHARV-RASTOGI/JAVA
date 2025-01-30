package ASSI3;

public class q4 {
	public static void main(String args[]) {
		String sentence = "Learning Java is both fun and rewarding";
		String[] words= sentence.split(" ");
		System.out.println("no of word:"+ words.length);
		String modified=sentence.replace("fun","challenging");
		System.out.println("Modified Sentence: " + modified);
		String uppercaseSentence = sentence.toUpperCase();
		System.out.println("Uppercase Sentence: " + uppercaseSentence);
	}
}
