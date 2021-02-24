package _08_clean_code_and_refactoring.bai_tap;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int scoreOfPlayer1, int scoreOfPlayer2) {
        String notification = "";
        int tempScore;
        boolean isEqual = (scoreOfPlayer1 == scoreOfPlayer2);
        if (isEqual) {
            switch (scoreOfPlayer1) {
                case 0:
                    notification = "Love-All";
                    break;
                case 1:
                    notification = "Fifteen-All";
                    break;
                case 2:
                    notification = "Thirty-All";
                    break;
                case 3:
                    notification = "Forty-All";
                    break;
                default:
                    notification = "Deuce";
            }
        } else if (scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4) {
            int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
            if (minusResult == 1) notification = "Advantage player1";
            else if (minusResult == -1) notification = "Advantage player2";
            else if (minusResult >= 2) notification = "Win for player1";
            else notification = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scoreOfPlayer1;
                else {
                    notification += "-";
                    tempScore = scoreOfPlayer2;
                }
                switch (tempScore) {
                    case 0:
                        notification += "Love";
                        break;
                    case 1:
                        notification += "Fifteen";
                        break;
                    case 2:
                        notification += "Thirty";
                        break;
                    case 3:
                        notification += "Forty";
                        break;
                }
            }
        }
        return notification;
    }
}
