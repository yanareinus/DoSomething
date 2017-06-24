package dosomething;
import java.util.*;
public class dosomething {
	
	
	
	public static void main(String [] args){
		
		int [] b={1,2};
		int []a={2};
		int v=4;
	    System.out.println(sumOfTwo(a,b,v));
		
	String s="2-4a0r7-4k";
	int k=5;
	System.out.println(stringReformatting(s,k));
	
	String sentence="Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";
	int openingParenIndex=28;
	
	System.out.println(getClosingParen(sentence, openingParenIndex));
	
	
	
		
	}

	public static boolean sumOfTwo(int a[], int b[], int v) {

		boolean flag = false;
		for (int x = 0; x < a.length; x++) {
			int firstnum = a[x];
			for (int y = 0; y < b.length; y++) {
				int secondNum = b[y];
				if (firstnum + secondNum == v) {
					
					flag = true;
				}
			}
		}
		return flag;
	}

	public static StringBuilder stringReformatting(String s, int k) {
		int countdashes = 0;
		StringBuilder newString = new StringBuilder();

		int splitK = 0;
		int numChar;
		for (int x = 0; x < s.length(); x++) {

			if (s.charAt(x) == '-') {

				countdashes++;
			}

		}

		 numChar = s.length() - countdashes;

		if (numChar % k == 0) {

			for (int x = 0; x < s.length(); x++) {
				if (s.charAt(x) == '-'){
					continue;
					}

				if (splitK == k) {
					newString.append('-');
					newString.append(s.charAt(x));
					splitK = 1;
				}
				else {
					newString.append(s.charAt(x));
					splitK++;
				}
			}
		}
		else {
			for (int x = 0; x < s.length(); x++) {

				if (s.charAt(x) == '-')continue;
				
				else if (numChar % k == newString.length()) {
					newString.append('-');
					newString.append(s.charAt(x));
					splitK = 1;
				}

				else if (splitK == k) {

					newString.append('-');
					newString.append(s.charAt(x));
					splitK = 1;
				}
				else {

					newString.append(s.charAt(x));
					splitK++;
				}
			}
		}
		return newString;
	}
 public static int getClosingParen(String sentence, int openingParenIndex){
	 
	 int num = 0;
	Stack <Character>  paren= new Stack <Character>();
	
	for(int x=openingParenIndex;x<sentence.length();x++){
		
		if(sentence.charAt(x)=='('){
			
			paren.push(sentence.charAt(x));
			
		}
		else if(sentence.charAt(x)==')'&& paren.size()>1 ){
			
			paren.pop();	
		}

		else if(sentence.charAt(x)==')'&& paren.size()==1){
			 num=x;
			 break;	
		}	
	}
	return num; 	 
 }

}
