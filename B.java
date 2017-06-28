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