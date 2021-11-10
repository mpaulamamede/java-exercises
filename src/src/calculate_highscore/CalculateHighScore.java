package src.calculate_highscore;

public class CalculateHighScore {

    public static void main(String[] args) {

       int positionHighScore = calculateHighScorePosition(1000);
       displayHighScorePosition("Paula", positionHighScore);

       positionHighScore = calculateHighScorePosition(500);
       displayHighScorePosition("Maria", positionHighScore);

       positionHighScore = calculateHighScorePosition(100);
       displayHighScorePosition("Ana", positionHighScore);

       positionHighScore = calculateHighScorePosition(50);
       displayHighScorePosition("Luiza", positionHighScore);
    }

    public static void displayHighScorePosition(String playerName, int positionHighScore) {
        System.out.println(playerName + " managed to get into position "
                + positionHighScore + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if(playerScore > 1000) {
            return 1;
        } else if(playerScore > 500) {
            return 2;
        } else if(playerScore > 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
