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
        System.out.println(name + " managed to get into ranking " + ranking + " on the high score table.");
    }

    //Creating the 2nd method
    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;

        //instead of using return we can use an integer and return only once
        int position = 4;             // assuming position 4 will be returned

        if(score >= 1000){
            position = 1;
        }else if(score >= 500){       // unlike the previous code we do not need to specify the condition if score is < 1000.
            position = 2;
        }else if(score >= 100){       // unlike the previous code we do not need to specify the condition if score is < 500.
            position = 3;
        }
        return position ;
    }
}
