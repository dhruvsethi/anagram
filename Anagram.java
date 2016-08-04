import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

	public static void main(String args[]) {
		try {
			Scanner sc = readWords();
			Map<String, List<String>> wordAnagramPairs = new HashMap<>();
			wordAnagramPairs = mapAnagrams(sc);
			for (String anagram : wordAnagramPairs.keySet()){
				if (wordAnagramPairs.get(anagram).size() > 1){
					System.out.println(wordAnagramPairs.get(anagram));
				}
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}

	private static Map<String, List<String>> mapAnagrams(Scanner sc) {
		String currWord, currSortedWord;
		Map<String, List<String>> result = new HashMap<>();
		//List<String> wordList = new ArrayList<>();
		while (sc.hasNext()) {
			currWord = sc.next();
			currSortedWord = sortedWord(currWord);
			if(null == result.get(currSortedWord)){

				result.put(currSortedWord, new ArrayList<String>());
				result.get(currSortedWord).add(currWord);
			}
			else{
				result.get(currSortedWord).add(currWord);
//				wordList.addAll(result.get(currSortedWord));
//				wordList.add(currWord);
			}
//			result.put(currSortedWord, wordList);
//			wordList.clear();
		}
		return result;
	}

	public static String sortedWord(String word) {
		char[] ar = word.toCharArray();
		Arrays.sort(ar);
		String sortedword = String.valueOf(ar);
		return sortedword;
	}

	private static Scanner readWords() throws FileNotFoundException {
		String path = "C:\\Users\\hsivasubramanian\\workspace\\anagram\\sowpods.txt";
		Scanner sc = new Scanner(new File(path));
		return sc;
	}

}
