public class Main {
    public static void main(String[] args){
        calculateScore("Kailash",100);
        calculateScore(1000);
        calculateScore();

    }

    public static void calculateScore(String playerName, int score){

        System.out.println("Player " + playerName + " scored " + score + " points ");
    }

    public static void calculateScore(int score){

        System.out.println("Player scored " + score + " points ");
    }

    public static int calculateScore(){

        System.out.println("No player name, no player score");
        return 0;
    }
    
}