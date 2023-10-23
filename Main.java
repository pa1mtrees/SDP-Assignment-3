public class Main {
    public static void main(String[] args) {
        // Create an instance of EnglishSpeaker
        EnglishSpeaker englishSpeaker = new EnglishSpeaker();
        // Create an instance of GermanSpeaker
        GermanSpeaker germanSpeaker = new GermanSpeaker();
        // Create a Translator that adapts communication between English and German speakers
        Speaker translator = new Translator(englishSpeaker, germanSpeaker);
        // Output
        System.out.println("English Speaker:");
        englishSpeaker.speak();

        System.out.println("German Speaker:");
        germanSpeaker.speak();

        System.out.println("Translator:");
        translator.speak();
    }
}
