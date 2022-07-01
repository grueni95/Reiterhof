package aufgabe43;

import java.util.List;

public class Riders {

    /**
     * The skill of the rider.
     */
    private int skill;

    /**
     * A list of horses which the rider prefers
     */
    private List<Horse> wishList;
    /**
     * The name of the rider
     */
    private String name;

    /**
     * The constructor to initialize a rider
     * @param skill The skill-class from the rider
     * @param wishList The horse wishes from the rider
     * @param name The name of the rider
     */

    public Riders(int skill, List<Horse> wishList, String name) {
        this.skill = skill;
        this.wishList = wishList;
        this.name = name;
    }

    @Override
    public String toString() {
        String rider = "Rider " + getName() + " got Skill " + getSkill();
        return rider;
    }

    /**
     * The getter method for the skill of the rider.
     * @return The skill level of the rider.
     */
    public int getSkill() {
        return skill;
    }

    /**
     * The setter method for the skill of the rider.
     * @param skill The skill of the rider.
     */
    public void setSkill(int skill) {
        this.skill = skill;
    }

    /**
     * The getter method for the wished horses from a rider.
     * @return A list of the wished horses.
     */
    public List<Horse> getWishList() {
        return wishList;
    }

    /**
     * The setter Method for the wished horses from a rider.
     * @param wishList The list of the wished horses
     */
    public void setWishList(List<Horse> wishList) {
        this.wishList = wishList;
    }

    /**
     * The getter method for the name of the rider
     * @return The name of the rider
     */
    public String getName() {
        return name;
    }

    /**
     * The setter method for the name of the rider
     * @param name The name of the rider.
     */
    public void setName(String name) {
        this.name = name;
    }
}
