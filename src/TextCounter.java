public class TextCounter {

    //Variablerna sparar totala rader och tecken
    private int antalRader;
    private int antalTecken;

    //Räknar en rad och lägger till radens tecken
    public void count(String text) {
        antalRader++;
        antalTecken += text.length();

    }
    //Returnerar antal rader
    public int getAntalRader() {
        return antalRader;
    }
    //Returnerar antal tecken
    public int getAntalTecken() {
        return antalTecken;
    }
}

