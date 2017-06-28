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
