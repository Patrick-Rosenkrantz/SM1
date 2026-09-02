public class Level2 {
    void main() {

        // level 2,1
        int mymoney = 50;
        int freindmoney = 30;
        int sumofmoney = mymoney + freindmoney;
        System.out.println(sumofmoney);

        // Level 2,5
        int fries = 25;
        int burger = 75;
        int soda = 35;
        int sum = fries + burger + soda;
        int pay = 200;
        int change = pay - sum;
        System.out.println(pay);
        System.out.println(change);

        // Level 2,6
        int coockies = 10;
        int friends = 3;
        int sharedcookies = coockies / friends;
        System.out.println(sharedcookies);

        // Level 2,7
        int sumscore = 85;
        int tests = 4;
        double avereage = (double) sumscore / tests;
        System.out.println(avereage);

        // Level 2,8
        double pris = 2134.50;
        int personer = 4;
        double prisprperson = (double) pris / personer;
        System.out.println(prisprperson);

        // Level 2,11
        int totalcandy = 23;
        int kids = 4;
        int candyperkid = totalcandy / kids;
        int leftover = totalcandy % kids;
        System.out.println(candyperkid);
        System.out.println(leftover);

        // Level 2,12
        int tal = 17;
        int remainder = tal % 2;
        if (remainder == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Level 2,14
        int antalture = 17;
        int spillere = 4;
        int currentplayer = antalture%spillere;
        System.out.println("It is player " +currentplayer+ "'s turn");

        // Level 2,17
        int basispris = 100;
        int antal = 4;
        int rabat = 25;
        int prisialt = (basispris * antal) - rabat;
        System.out.println(prisialt);

        // Level 2,18
        int test1 = 25;
        int test2 = 45;
        int test3 = 95;
        double average = (double) (test1 + test2 + test3) / 3;
        System.out.println(average);

        // Level 2,20
        double priss = 300;
        double rabats = 20;
        double rabatmængde = priss * (rabats / 100);
        double finalpris = priss - rabatmængde;
        System.out.println(finalpris);

        // Level 2,22
        int alder1 = 21;
        System.out.println("Du er "+alder1+" år gammel");

        // Level 2,24
        int tal1 = 5;
        int tal2 = 8;
        System.out.println("Sum: "+ (tal1 + tal2));
        System.out.println("Sum: " + tal1 + tal2);

        // Level 2,25
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ");
        sb.append("world!");
        String result = sb.toString();
        System.out.println(sb);

    }

}
