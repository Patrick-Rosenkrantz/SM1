import java.util.Scanner;

public class Scanner1 {
    void main(){

        Scanner input = new Scanner(System.in);
        System.out.println("Hvad hedder du?");
        String name = input.nextLine();
        System.out.println("Hej " + name + ", hvor gammel er du?");
        int age = input.nextInt();
        System.out.println("Du er " + age + "gammel");
        System.out.println("Hvad er dit cpr nummer?");
        input.nextLine();
        String cprNummer = input.nextLine();
    }
}
