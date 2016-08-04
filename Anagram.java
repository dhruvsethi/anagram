import java.util.Arrays;

public class Anagram {

	public static String sortedWord(String word){
		
		char[] ar = word.toCharArray();
		Arrays.sort(ar);
		String sortedword = String.valueOf(ar);
		return sortedword;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="zxcvb";
		System.out.println(sortedWord(word));
	}

}
