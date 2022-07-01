package aufgabe43;

public class Horse {

    /**
     * The name of the horse
     */
    private String nameP;

    /**
     * The needed skill level to ride the horse
     */
    private int skillLevel;

    /**
     * The constructor to initialize a horse
     * @param nameP the name of the horse
     * @param skillLevel the needed skillLevel for the horse
     */
    public Horse(String nameP, int skillLevel) {
        this.nameP = nameP;
        this.skillLevel = skillLevel;
    }

    @Override
    public String toString() {
        String horse = getNameP() + " with the skill " + getSkillLevel() + ".";
        return horse;
    }
    /**
     * The getter method for the horses' skill level.
     * @return The horses' skillLevel.
     */
    public int getSkillLevel() {
        return skillLevel;
    }

    /**
     * The setter method for the horses' skillLevel.
     * @param skillLevel The horses' skillLevel.
     */
    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    /**
     * The getter Method for the horses' name.
     * @return The horses name.
     */
    public String getNameP() {
        return nameP;
    }

    /**
     * The setter method for the horses' name.
     * @param nameH The horses' name.
     */
    public void setNameP(String nameH) {
        this.nameP = nameH;
    }

    /*
    public String[] getHorses(aufgabe43.Feature feature) {
        switch (feature) {
            case BEGINNER:
                String[] horsesB = {"Alex", "Pucki", "Wittchen", "Zausel"};
                return horsesB;

            case ADVANCED:
                String[] horsesA = {"Nicki", "Hurrikan", "Sturmwind"};
                return horsesA;

            case PROFI:
                String[] horsesP = {"Tornado", "Zackzack"};
                return horsesP;
            default:
                System.exit(123);

        }
        return getHorses(feature); //not like this?

    }*/

}
