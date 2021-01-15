
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Frozen
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner scanner = new Scanner(System.in);
 
		System.out.print("Get the pattern: ");  
		String pattern = scanner.nextLine();  
 
		System.out.println(); 
 
		System.out.print("Get the sub pattern length: ");
 
		System.out.println(); 
		int subPatternLen = scanner.nextInt();  
		printDiffPattern(pattern, subPatternLen);
	}
 
	private static void printDiffPattern(String pattern, int inputLen) {
        if (inputLen >= pattern.length()) {
            return;
        }
 
        Map<String, Integer> patternVsCount = new HashMap<>();
        for (int i=0; i<=pattern.length()-inputLen; i++) {
            String currSubString = pattern.substring(i, i+inputLen);
            patternVsCount.put(currSubString, patternVsCount.getOrDefault(currSubString, 0) + 1);
        }
        for (String subString : patternVsCount.keySet()) {
            if (patternVsCount.get(subString) > 1) {
                System.out.println(subString + " : " + patternVsCount.get(subString));
            }
        }
    }
}
