package CorrectingTest;

public class CheckingMatchine {
    private int targer;
    private int[] correct;
    public CheckingMatchine(int targer){
        this.targer = targer;
        this.correct = new int[checkLen(targer)];
    }

    public int guessing(int guess){
        int checkTarget = this.targer;
        int count = 0;
        while (checkTarget > 0){
            if (guess%10 == checkTarget%10){
                count++;
            }
            checkTarget =  checkTarget/10;
            guess = guess/10;
        }
        return  count;
    }

    public  void guess(int guess){
        int checkTarget = this.targer;
        int i = 0;
        while (checkTarget > 0){
            if (guess%10 == checkTarget%10){
                this.correct[i]++;
            }
            checkTarget =  checkTarget/10;
            guess = guess/10;
            i++;
        }
    }
    public int checkLen(int targer){
        int count = 0;
        while (targer > 0){
            count++;
            targer = (targer-(targer%10))/10;
        }
        return count;
    }

    @Override
    public String toString() {
        String ans = "";
        for (int i = correct.length-1, j = 1; i >= 0; i--,j++) {
            ans += j+": " +correct[i]+"\n";
        }
        return ans;
    }
}
