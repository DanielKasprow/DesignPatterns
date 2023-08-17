package StructuralDesignPatterns.Adapter.Challenge;

interface MediaPlayerInterface {
    void play(String audioType, String filename);
}
class AudioPlayer implements MediaPlayerInterface {

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.printf("Playing %s file. Name: %s\n", audioType, filename);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
