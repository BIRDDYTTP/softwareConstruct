public class ActiveSkill extends Skill{
    private String ability;
    public ActiveSkill(String skillName, String ability) {
        super(skillName);
        this.ability = ability;
    }

    public String getAbility() {
        return ability;
    }
}
