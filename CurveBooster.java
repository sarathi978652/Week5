import java.util.Arrays;
class CurveBooster{
    public static int [] curveScore(int scores[],int num){
        for(int i=0; i<scores.length; i++){
            scores[i]=scores[i]+ num;

        }
        System.out.println(Arrays.toString(scores));
        return scores;
    }  

    public static void main(String[]arg){
        int[]Score={70,85,60};
        curveScore(Score,10);
    }
}