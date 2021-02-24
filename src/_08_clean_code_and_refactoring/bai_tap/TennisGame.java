package _08_clean_code_and_refactoring.bai_tap;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int scoreOfPlayer1, int scoreOfPlayer2) {
        StringBuilder notification = new StringBuilder();
        int tempScore;
        int numberOfPlayers = 2;
        boolean isEqual = (scoreOfPlayer1 == scoreOfPlayer2);
        boolean checkScore = scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4;
        if (isEqual) {
            switch (scoreOfPlayer1) {
                case 0:
                    notification = new StringBuilder("Love-All");
                    break;
                case 1:
                    notification = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    notification = new StringBuilder("Thirty-All");
                    break;
                case 3:
                    notification = new StringBuilder("Forty-All");
                    break;
                default:
                    notification = new StringBuilder("Deuce");
            }
        } else if (checkScore) {
            int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
            if (minusResult == 1) notification = new StringBuilder("Advantage player1");
            else if (minusResult == -1) notification = new StringBuilder("Advantage player2");
            else if (minusResult > 1) notification = new StringBuilder("Win for player1");
            else notification = new StringBuilder("Win for player2");
        } else {
            for (int i = 1; i <= numberOfPlayers; i++) {
                if (i == 1) tempScore = scoreOfPlayer1;
                else {
                    notification.append("-");
                    tempScore = scoreOfPlayer2;
                }
                switch (tempScore) {
                    case 0:
                        notification.append("Love");
                        break;
                    case 1:
                        notification.append("Fifteen");
                        break;
                    case 2:
                        notification.append("Thirty");
                        break;
                    case 3:
                        notification.append("Forty");
                        break;
                }
            }
        }
        return notification.toString();
    }
}
