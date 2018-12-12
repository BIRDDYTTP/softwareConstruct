public class MemberCard implements Measurable {
    private int point;
    private double totalCost;

    public int getPoint() {
        return point;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void addCost(double cost){
        if (cost < 0 ) return;
        this.point+= cost/50;
        this.totalCost += totalCost;
    }

    @Override
    public double getMeasure() {
        return 0;
    }
}
