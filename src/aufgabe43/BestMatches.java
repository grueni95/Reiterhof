package aufgabe43;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class BestMatches{

        /**
         * A hashmap vor the riders with its matched horse
         */
        private HashMap<Riders, Horse> matchMap;

        /**
         * The score to check how many wishes are fulfilled
         */
        private int wishScore;

        /**
         * The constructor to initialize the class
         */
        public BestMatches() {
                matchMap = new HashMap<>();
                wishScore = 0;

        }

        /**
         * The getter method for the map
         * @return the map with the matches
         */
        public HashMap<Riders, Horse> getMatchMap() {
                return matchMap;
        }

        /**
         * The setter method for the matchMap
         * @param matchMap the matchMap to set
         */
        public void setMatchMap(HashMap<Riders, Horse> matchMap) {
                this.matchMap = matchMap;
        }

        /**
         * The getter method for the wishScore
         * @return the wishScore
         */
        public int getWishScore() {
                return wishScore;
        }

        /**
         * The setter method for the wishScore
         * @param wishScore the score to set
         */
        public void setWishScore(int wishScore) {
                this.wishScore = wishScore;
        }

        /**
         * A method to increase the wishScore when a wish is fulfilled
         */
        public void increaseWishScore() {
                wishScore++;
        }
        @Override
        public String toString() {
                //StringBuilder result = new StringBuilder("######Here are your best matches:######");
                System.out.println("######Here are your best matches######");
                for (Map.Entry<Riders, Horse> matches : matchMap.entrySet()) {
                        System.out.println(matches.getKey().toString() + " and so he got the Horse " + matches.getValue().toString() + " from his wishlist");
                        //result.append(String.format(" %10s -> %-10s\n", matches.getKey().getName(), matches.getValue().getNameP()));
                }
                //result.append(String.format("With ", wishScore, "fulfilled wishes"));
                System.out.println("With " +  wishScore + " fulfilled wishes");
                return null;
        }
}
