package dosomething2;

import java.util.*;

public class dosomehting {

	public static void main(String[] args) {

		String s = "abb";
		String t = "ba";

		System.out.println(sortByStrings(s, t));

		int n = 10;

		System.out.println(countWays(n));

	}

	public static StringBuilder sortByStrings(String s, String t) {

		StringBuilder newString = new StringBuilder();
		Map<Character, Integer> freq = new HashMap<Character, Integer>();

		for (int x = 0; x < s.length(); x++) {
			char key = s.charAt(x);
			if (freq.containsKey(key)) {
				freq.put(key, freq.get(key) + 1);

			} else {
				freq.put(key, 1);
			}
		}

		for (int x = 0; x < t.length(); x++) {

			if (freq.containsKey(t.charAt(x))) {

				if (freq.get(t.charAt(x)) > 1) {

					int len = freq.get(t.charAt(x));

					for (int y = 0; y < len; y++) {

						newString.append(t.charAt(x));

					}
				} else {
					newString.append(t.charAt(x));
				}

			}

			else
				continue;

		}
		return newString;
	}

	public static int countWays(int n) {

		if (n == 0) {
			return 0;
		}

		else if (n == 1) {
			return 1;
		}

		int[] numWays = new int[n + 1];
		numWays[0] = 1;
		numWays[1] = 1;
		numWays[2] = 2;

		for (int i = 3; i < numWays.length; i++) {
			numWays[i] = numWays[i - 1] + numWays[i - 2] + numWays[i - 3];

		}
		return numWays[numWays.length - 1];

	}
}
