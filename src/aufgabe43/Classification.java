package aufgabe43;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Classification {

    /**
     * Current list of the available horses
     */
    private ArrayList<Horse> horseArray;

    /**
     * Current list of the riders left
     */
    private ArrayList<Riders> ridersArray;

    /**
     * The constructor
     * @param horseArray the horses
     * @param ridersArray the riders
     */
    public Classification(ArrayList<Horse> horseArray, ArrayList<Riders> ridersArray) {
        //this.horseArray = horseArray;
        //this.ridersArray = ridersArray;


    }

    public Classification() {
        //createHorseArray();
        //System.out.println(getHorseArray());

        //System.out.println(getRidersArray());
        //matchMaking(ridersArray, horseArray);
    }

    public void starter() {
        createHorseArray();
        createRiderArray();

        BestMatches bm = matchMaking(getRidersArray(),getHorseArray());
        bm.toString();
    }

    public void createRiderArray() {


        List<Horse> wishListA= new ArrayList<Horse>();
        List<Horse> wishListB= new ArrayList<Horse>();
        List<Horse> wishListC= new ArrayList<Horse>();
        List<Horse> wishListD= new ArrayList<Horse>();
        List<Horse> wishListE= new ArrayList<Horse>();
        List<Horse> wishListF= new ArrayList<Horse>();
        List<Horse> wishListG= new ArrayList<Horse>();

        wishListA.add(0, horseArray.get(1));
        wishListA.add(1, horseArray.get(2));
        wishListA.add(2, horseArray.get(3));
        wishListA.add(3, horseArray.get(0));

        wishListB.add(0, horseArray.get(0));
        wishListB.add(1, horseArray.get(1));
        wishListB.add(2, horseArray.get(2));
        wishListB.add(3, horseArray.get(3));
        wishListB.add(4, horseArray.get(4));
        wishListB.add(5, horseArray.get(5));
        wishListB.add(6, horseArray.get(6));
        wishListB.add(7, horseArray.get(7));
        wishListB.add(8, horseArray.get(7));

        wishListC.add(0, horseArray.get(4));

        wishListD.add(0, horseArray.get(0));
        wishListD.add(1, horseArray.get(3));
        wishListD.add(2, horseArray.get(2));

        wishListE.add(0, horseArray.get(0));
        wishListE.add(1, horseArray.get(1));
        wishListE.add(2, horseArray.get(2));
        wishListE.add(3, horseArray.get(3));
        wishListE.add(4, horseArray.get(4));
        wishListE.add(5, horseArray.get(5));
        wishListE.add(6, horseArray.get(6));
        wishListE.add(7, horseArray.get(7));
        wishListE.add(8, horseArray.get(8));

        wishListF.add(0, horseArray.get(6));
        wishListF.add(1, horseArray.get(4));

        wishListG.add(0, horseArray.get(4));
        wishListG.add(1, horseArray.get(0));
        wishListG.add(2, horseArray.get(6));
        wishListG.add(3, horseArray.get(5));


        Riders riderA = new Riders(0, wishListA, "Anja");
        Riders riderB = new Riders(1, wishListB, "Bertram");
        Riders riderC = new Riders(2, wishListC, "Christa");
        Riders riderD = new Riders(0, wishListD, "Doris");
        Riders riderE = new Riders(0, wishListE, "Emil");
        Riders riderF = new Riders(2, wishListF, "Fritz");
        Riders riderG = new Riders(1, wishListG, "Gabi");

        ArrayList<Riders> ridersArray = new ArrayList<>();

        ridersArray.add(riderA);
        ridersArray.add(riderB);
        ridersArray.add(riderC);
        ridersArray.add(riderD);
        ridersArray.add(riderE);
        ridersArray.add(riderF);
        ridersArray.add(riderG);


        setRidersArray(ridersArray);

    }

    public void createHorseArray() {
        Horse horseA = new Horse("Alex", 0);
        Horse horseN = new Horse("Nicki", 1);
        Horse horseP = new Horse("Pucki", 0);
        Horse horseW = new Horse("Wittchen", 0);
        Horse horseH = new Horse("Hurrikan", 1);
        Horse horseT = new Horse("Tornado", 2);
        Horse horseS = new Horse("Sturmwind", 1);
        Horse horseZ = new Horse("Zausel", 0);
        Horse horseZz = new Horse("ZackZack", 2);

        ArrayList<Horse> horseArray = new ArrayList<>();

            horseArray.add(0, horseA);
            horseArray.add(1, horseN);
            horseArray.add(2, horseP);
            horseArray.add(3, horseW);
            horseArray.add(4, horseH);
            horseArray.add(5, horseT);
            horseArray.add(6, horseS);
            horseArray.add(7, horseZ);
            horseArray.add(8, horseZz);

        setHorseArray(horseArray);
        //return horseArray;
    }
    //public createHorseArray() á la getDificulty Rider und dann switch case für das String array der ponys? und das alles mit da drin?
    // and pass it/ start the matchmaking
    // and then send the result to the resultprinter from best matches
    /**
     * The rekursive method which make all possible rider-horse matches, check if it increased the score for the
     * fulfilled wishes and set's the BestMatchesMap to the one with the highest score of fulfilled wishes
     *
     * @param ridersArray The array with all the riders
     * @param horseArray The array with all the horses
     * @return a map with the best matches which can be made
     */
    public BestMatches matchMaking(@NotNull ArrayList<Riders> ridersArray, ArrayList<Horse> horseArray) { //here we need to pass a list of the riders and horses as parameters maybe out of a method to generater a list of ponys and riders or smth idk
        //ridersArray = getRidersArray();
        //horseArray = getHorseArray();
        BestMatches bestMatches = new BestMatches();
        for (Riders rider : ridersArray) {
            for (Horse horse : horseArray) {

                if (rider.getSkill() >= horse.getSkillLevel()) {

                    ArrayList<Riders> new_riderArray = new ArrayList<>(ridersArray.size());
                    new_riderArray.addAll(ridersArray);
                    new_riderArray.remove(rider);

                    ArrayList<Horse> new_horseArray = new ArrayList<>(horseArray.size());
                    new_horseArray.addAll(horseArray);
                    new_horseArray.remove(horse);

                    //rek aufruf mit der neuen liste
                    BestMatches new_bestMatches = matchMaking(new_riderArray, new_horseArray);

                    //put rider and horse into new map, start wishscore
                    new_bestMatches.getMatchMap().put(rider, horse);
                    //new_bestMatches.increaseWishScore(); //dis just double the wishscore, idc why it's there

                    //check, ob es ein wunschpferd war, scorerhöhung, falls ja
                    if (rider.getWishList().contains(horse)) {
                        new_bestMatches.increaseWishScore();
                    }

                    //new bestmatch, falls er größer als er alte score war
                    if (new_bestMatches.getWishScore() > bestMatches.getWishScore()) {
                        bestMatches = new_bestMatches;
                    }


                }
            }
        }

        return bestMatches;
    }

    /**
     * The getter method for the array of horses.
     * @return The array of horses.
     */
    public ArrayList<Horse> getHorseArray() {
        return horseArray;
    }

    /**
     * The setter method for the array of horses.
     * @param horseArray The array of horses.
     */
    public void setHorseArray(ArrayList<Horse> horseArray) {
        this.horseArray = horseArray;
    }

    /**
     * The getter method for the array if riders
     * @return The array of riders
     */
    public ArrayList<Riders> getRidersArray() {
        return ridersArray;
    }

    /**
     * The setter method for the array of riders
     * @param ridersArray The array of riders.
     */
    public void setRidersArray(ArrayList<Riders> ridersArray) {
        this.ridersArray = ridersArray;
    }
}
