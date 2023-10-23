class EnglishSpeaker implements Speaker {
    public void speak() {
        System.out.println("Hello, how are you?");
    }
}
///Both EnglishSpeaker and GermanSpeaker implement the Speaker interface,
///which ensures that the speak() method is defined for both.
///Allowing the translator to adapt between the two speakers.
