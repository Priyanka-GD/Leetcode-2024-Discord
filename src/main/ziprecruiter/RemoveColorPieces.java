package main.ziprecruiter;

public class RemoveColorPieces {
    public boolean winnerOfGame(String colors) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 1; i < colors.length() - 1; i++) {
            if (colors.charAt(i - 1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i + 1)) {
                if (colors.charAt(i) == 'A') {
                    aliceScore++;
                } else {
                    bobScore++;
                }
            }
        }
        return aliceScore - bobScore >= 1;
    }
}
