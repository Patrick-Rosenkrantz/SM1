public class Level4 {
    void main(){

        // Level 4,1
        int[] number = {10,20,30};

        // Level 4,2
        String[] names = {"Anna", "Bob", "Carl"};

        // Level 4,4
        boolean[] flags = {true, false, true, true};

        // Level 4,6
        int[] scores = {85, 92, 78, 88};
        int firstScore;
        firstScore = scores[0];

        // Level 4,11
        String[] names1 = {"Anna", "Bob", "Carl", "Diana"};
        int arrayLength = names1.length;

        // Level 4,13
        int[] numbers1 = {10, 20, 30, 40, 50};
        int lastNumber = numbers1[numbers1.length-1];

        // Level 4,26
        /*
        String[] items = {"Banan", "Mælk", "æg"};
        double[] prices = {3.5, 12.75, 30.0};

        int totalItems = items.length;
        double pricesTotal = prices[0] + prices[1] + prices[2];

        System.out.println("Items: " + totalItems);
        System.out.println("Total price: " + pricesTotal);
        */

        // Level 4,29
        String[] navne = {"Anna" , "Bob", "Carl", "Diana", "Eva"};
        int[] alder = {28,35,42,30,38};
        int[] løn = {45000,52000,58000,48000,51000};
        boolean[] fuldtid = {true, true, false, true, true};

        int antalMedarbejder = navne.length;
        String firstNavn = navne[0];
        String lastNavn = navne[navne.length - 1];
        double gennemsnitsalder = alder[0] + alder[1] + alder[2] / 3.0;


    }


}
