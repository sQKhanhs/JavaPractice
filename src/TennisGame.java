public class TennisGame {

    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore = 0;
        boolean isScoreEqual = player1Score == player2Score;
        if (isScoreEqual) {
            switch (player1Score) {
                case LOVE:
                    score = "Love-All";
                    break;
                case FIFTEEN:
                    score = "Fifteen-All";
                    break;
                case THIRTY:
                    score = "Thirty-All";
                    break;
                case FORTY:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else {
            boolean isAdvantageScore = player1Score >= 4 || player2Score >= 4;
            if (isAdvantageScore) {
                int minusResult = player1Score - player2Score;
                boolean isPlayer1Advantage = minusResult == 1;
                if (isPlayer1Advantage) score = "Advantage player1";
                else {
                    boolean isPlayer2Advantage = minusResult == -1;
                    if (isPlayer2Advantage) score = "Advantage player2";
                    else {
                        boolean isPlayer1Win = minusResult >= 2;
                        if (isPlayer1Win) score = "Win for player1";
                        else score = "Win for player2";
                    }
                }
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) tempScore = player1Score;
                    else {
                        score += "-";
                        tempScore = player2Score;
                    }
                    switch (tempScore) {
                        case LOVE:
                            score += "Love";
                            break;
                        case FIFTEEN:
                            score += "Fifteen";
                            break;
                        case THIRTY:
                            score += "Thirty";
                            break;
                        case FORTY:
                            score += "Forty";
                            break;
                    }
                }
            }
        }
        return score;
    }
}
