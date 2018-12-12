package sample;

public class HangManCode {

    private String word;
    private int life;
    private String result;
    private String keeper;

    public HangManCode(String word){
        this.word = word;
        this.life = 6;
        this.result = "";
        this.keeper = "";
        for (int i = 0; i < this.word.length(); i++){
            this.result += '-';
        }
    }

    public boolean check(char charector) throws Exception{
        if(this.keeper.contains("" + charector)){
            throw new Exception("Duplicate charactor");
        }
        String temp = "";
        boolean isContain = false;
        this.keeper += charector + " ";
        for (int i = 0; i < this.word.length(); i++){
            if (this.word.charAt(i) == charector){
                temp += charector;
                isContain = true;
            } else {
                temp += this.result.charAt(i);
            }
        }
        if (!isContain) this.life--;
        this.result = temp;
        return isContain;
    }

    public String getResult() {
        return result;
    }

    public int getLife() {
        return life;
    }


    public String getKeeper() {
        return keeper;
    }

}