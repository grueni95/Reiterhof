package aufgabe43;

import java.util.ArrayList;

public class Classification {

    /**
     * Current list of the available horses
     */
    public ArrayList<Horse> horseArray;

    /**
     * Current list of the riders left
     */
    public ArrayList<Riders> ridersArray;

    /**
     * The constructor
     * @param horseArray the horses
     * @param ridersArray the riders
     */
    public Classification(ArrayList<Horse> horseArray, ArrayList<Riders> ridersArray) {
        this.horseArray = horseArray;
        this.ridersArray = ridersArray;
    }

    public BestMatches matchMaking() { //here we need to pass a list of the riders and horses as parameters maybe out of a method to generater a list of ponys and riders or smth idk

        BestMatches bestMatches = new BestMatches();
        for (Riders rider : ridersArray) {
            for (Horse horses : horseArray) {

                if (rider.getSkill() >= horses.getSkillLevel()) {

                }
            }
        }
        return bestMatches;
    }
}
