package cs.cuw.com.teamroster;

/**
 * Created by awesomefat on 11/17/16.
 */

public class Player
{
    private int jerseyNumber;
    private int skillLevel;

    public Player(int jerseyNumber, int skillLevel)
    {
        this.jerseyNumber = jerseyNumber;
        this.skillLevel = skillLevel;
    }

    public int getJerseyNumber()
    {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber)
    {
        this.jerseyNumber = jerseyNumber;
    }

    public int getSkillLevel()
    {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel)
    {
        this.skillLevel = skillLevel;
    }
}
