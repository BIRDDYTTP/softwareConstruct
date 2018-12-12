package lab08MemberCardInterfaceVer2;

public class InternetCafeMemberCard implements Pointable{
    private String name;
    private int hour;
    private int point;

    public InternetCafeMemberCard(String name) {
        this.name = name;
        this.point = 0;
        this.hour = 0;
    }

    @Override
    public void addScore(double score) {
        hour += score;
        this.point =  (this.hour-(this.hour % 2))/2;
    }

    @Override
    public void usePoint(int point) {
        if (point <= this.point){
            this.point -= point;
        }
    }

    @Override
    public int getPoint() {
        return point;
    }

    @Override
    public String getInfo() {
        return "InternetCafeMemberCard{name='"+name+"', totalHour="+hour+", point="+point+"}";

    }
}
