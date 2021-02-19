package exam0202.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return new ArrayList<>(skills);
    }

    public void addSkills(String... skills) {
        for (String skill : skills) {
            String name = skill.substring(0, skill.indexOf("(")).trim();
            int level = Integer.parseInt(skill.substring(skill.indexOf("(") + 1, skill.indexOf(")")));
            this.skills.add(new Skill(name, level));
        }
    }

    public int findSkillLevelByName(String name) {
        for (Skill skill : skills) {
            if (skill.getName().equals(name)) {
                return skill.getLevel();
            }
        }
        throw new IllegalArgumentException("Wrong skill name!");
    }
}
