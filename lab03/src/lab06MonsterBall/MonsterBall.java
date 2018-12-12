package lab06MonsterBall;

public class MonsterBall {
    private String[] type;
    private double[] price;
    private double[] sellFor;
    private double[] ballValue;

    public MonsterBall(){
        type = new String[4];
        price = new double[4];
        sellFor = new double[4];
        ballValue = new double[4];
        this.type[0] = "Poke Ball";
        this.type[1] = "Great Ball";
        this.type[2] = "Ultra Ball";
        this.type[3] = "Drive Ball";
        this.price[0] = 200;
        this.price[1] = 600;
        this.price[2] = 1200;
        this.price[3] = 1000;
        this.sellFor[0] = 100;
        this.sellFor[1] = 300;
        this.sellFor[2] = 600;
        this.sellFor[3] = 500;
        this.ballValue[0] = 1;
        this.ballValue[1] = 1.5;
        this.ballValue[2] = 2;
        this.ballValue[3] = 3.5;
    }

    public String print(){
        String output = "";
        for (int i = 0; i < 4; i++){
            output += "MonsterBall{type='"+type[i]+"'"+", price="+price[i]+", sellFor="+sellFor[i]+", ballValue="+ballValue[i]+"}" ;
            if (i != 3){
                output+="\n";
            }
        }
        return output;
    }
}
