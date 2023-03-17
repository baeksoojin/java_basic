package jumptojava.chapter4;

public class Question4 {

    public int[] scores;

    public void setScores(int[] scores){
        this.scores = scores;
    }

    public double getAvg(){

        int sum=0;
        for(int score : scores){
            sum += score;
        }

        return sum/scores.length;
    }
}
