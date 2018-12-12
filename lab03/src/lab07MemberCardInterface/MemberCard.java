package lab07MemberCardInterface;

public class MemberCard implements Pointable{
    private String name;
    private double totalPurchase;
    private int point;

    public MemberCard(String name) {
        this.name = name;
        this.totalPurchase = 0;
        this.point = 0;
    }

    @Override
    public int getPoint() {
        return point;
    }

    @Override
    public void addScore(double score) {
        totalPurchase += score;
        double calculateScore = (this.totalPurchase-(this.totalPurchase%250))/250;
        point = (int) calculateScore;
    }

    @Override
    public void usePoint(int point) {
        if (this.point >= point) {
            this.point -= point;
        }
    }

    @Override
    public String getInfo() {
        return "MemberCard{name='"+name+"', totalPurchase="+totalPurchase+", point="+point+"}";
    }
}

