package sample;

public class ThaiSystem{
    private double sl;

    public ThaiSystem(){
        this.sl = 0;
    }
    public void setFromMetricSystem(double kg){
        this.sl = kg*1000 /3.75;
    }
    public void setFromEnglishSystem(double lb){
        this.sl = (lb*16/35.2739619)*1000/3.75;
    }

    public void setFromTl(double tl){
        this.sl = tl*4*4;
    }
    public double toBaht(){
        return sl/4;
    }
    public double toTl(){
        return sl/4/4;
    }
    public double toChung(){
        return sl/4/4/20;
    }
    public double toHarb(){
        return sl/4/4/20/50;
    }

    public double getSl() {
        return sl;
    }
}
