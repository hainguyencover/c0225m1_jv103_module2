package b4;

public class TennisGame {

    public static final int SCORE_LOVE = 0;
    public static final int SCORE_FIFTEEN = 1;
    public static final int SCORE_THIRTY = 2;
    public static final int SCORE_FORTY = 3;

    public static String getScore(String player1Name, String player2Name, int score1, int score2) {

        if (score1 == score2) {
            return getEqualScore(score1);
        }
        if (score1 >= 4 || score2 >= 4) {
            return getAdvantageOrWinScore(score1, score2);
        }
        return getNormalScore(score1, score2);
    }



    private static String getScoreName(int score) {
        return switch (score) {
            case SCORE_LOVE -> "Love";
            case SCORE_FIFTEEN -> "Fifteen";
            case SCORE_THIRTY ->  "Thirty";
            case SCORE_FORTY ->  "Forty";
            default -> "Deuce";
        };
    }

    private static String getEqualScore(int player1Score) {
        return switch (player1Score) {
            case SCORE_LOVE -> "Love-All";
            case SCORE_FIFTEEN -> "Fifteen-All";
            case SCORE_THIRTY -> "Thirty-All";
            case SCORE_FORTY -> "Forty-All";
            default -> "Deuce";
        };
    }

    private static String getAdvantageOrWinScore(int player1Score, int player2Score) {
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) return "Advantage player1";
        else if (minusResult == -1) return "Advantage player2";
        else if (minusResult >= 2) return "Win for player1";
        else return "Win for player2";
    }

    private static String getNormalScore(int score1, int score2) {
        return getScoreName(score1) + "-" + getScoreName(score2);
    }
}
