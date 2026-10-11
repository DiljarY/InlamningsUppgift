import java.util.Scanner;

public class Text {

    public static void main(String[] args) {

        //Läsa text som användaren skriver
        Scanner scan = new Scanner(System.in);
        TextCounter counter = new TextCounter();


        System.out.println("Skriv text. Skriv stop för att avsluta programmet.");

        //varibalen text sparar det användaren skrivit
        String text = "";

        //Loop fortsätter så länge användaren inte skrivers stop
        while (!text.equals("stop")) {

        //Läser en hel rad från användare
            text = scan.nextLine();

            //räknar text som inte är stopp
            if (!text.equals("stop")) {
                counter.count(text);

            }
        }

        System.out.println("Antal rader: " + counter.getAntalRader());
        System.out.println("Antal tecken: " +  counter.getAntalTecken());
    }
}
