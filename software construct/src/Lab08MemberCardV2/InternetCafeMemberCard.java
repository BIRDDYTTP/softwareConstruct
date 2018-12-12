package Lab08MemberCardV2;

public class InternetCafeMemberCard implements Pointable {
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
        if (score > 0){
            hour += score;
            this.point += (int) score/2;
        }
    }

    @Override
    public void usePoint(int point) {
        if (point <= this.point && point > -1){
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
