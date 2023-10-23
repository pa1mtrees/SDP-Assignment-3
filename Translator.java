class Translator implements Speaker {
    private Speaker englishSpeaker; ///EnglishSpeaker
    private Speaker germanSpeaker;  ///GermanSpeaker

    /// Constructor to initialize the Translator with the English and German speakers
    public Translator(Speaker englishSpeaker, Speaker germanSpeaker) {
        this.englishSpeaker = englishSpeaker;
        this.germanSpeaker = germanSpeaker;
    }

    @Override
    public void speak() {
        // Translator begins speaking in English
        System.out.print("Translator says: ");
        englishSpeaker.speak();
        // Translator translates the message to German
        System.out.print("Translator translates: ");
        germanSpeaker.speak();
    }
}

