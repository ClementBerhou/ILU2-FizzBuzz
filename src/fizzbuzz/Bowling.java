package fizzbuzz;

public class Bowling {
	private int[] tableau = new int[21];
	private int lancer = 0;
	
	
	void roll(int nbQuilles) {
		tableau[lancer] = nbQuilles;
	}
	
	int score() {
		int totalScore = 0;
		int indice = 0;
		for (int frame = 0; frame < 10; frame++) {
            if (isStrike(indice)) {
                totalScore += 10 + strikeBonus(indice);
                indice++;
            } else if (isSpare(indice)) {
                totalScore += 10 + spareBonus(indice);
                indice += 2;
            } else {
                totalScore += SommeQuilles(indice);
                indice += 2;
            }
        }

        return totalScore;
	}
	
    private boolean isStrike(int rollIndex) {
        return tableau[rollIndex] == 10;
    }

    private boolean isSpare(int rollIndex) {
        return tableau[rollIndex] + tableau[rollIndex + 1] == 10;
    }

    private int strikeBonus(int rollIndex) {
        return tableau[rollIndex + 1] + tableau[rollIndex + 2];
    }

    private int spareBonus(int rollIndex) {
        return tableau[rollIndex + 2];
    }

    private int SommeQuilles(int rollIndex) {
        return tableau[rollIndex] + tableau[rollIndex + 1];
    }
	
	
}
