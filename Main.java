public class Main {

    public static void main(String[] args) {

        //Calling the 1st and 2nd the method
        int ranking = calculateHighScorePosition(1500);
        displayHighScorePosition("Virat Kohli", ranking);

        ranking = calculateHighScorePosition(900);
        displayHighScorePosition("Babar Azam", ranking);

        ranking = calculateHighScorePosition(400);
        displayHighScorePosition("Rohit Sharma", ranking);

        ranking = calculateHighScorePosition(50);
        displayHighScorePosition("Ross Taylor", ranking);

    }

    //Creating the 1st method
    public static void displayHighScorePosition(String name, int ranking) {
        System.out.println(name + " managed to get into ranking " + ranking + " on the high score table.\n");
    }

    //Creating the 2nd method
    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
