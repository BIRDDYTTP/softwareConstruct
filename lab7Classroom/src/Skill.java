public class Skill {
    private String skillName;
    private int level;

    public Skill(String skillName) {
        this.skillName = skillName;
        this.level = 1;
    }

    public String getSkillName() {
        return skillName;
    }

    public int getLevel() {
        return level;
    }

    public void addLevel(){
        this.level ++;
    }
}
