package StructuralDesignPatterns.Adapter.Challange;

class Main {
    public static void main(String[] args) {
        MediaPlayerInterface mediaPlayer = new AudioPlayer();
        mediaPlayer.play("mp3", "1");
        mediaPlayer.play("mp4", "1");

        AdvancedMediaPlayerAdapter vlcPlayer = new AdvancedMediaPlayerAdapter(new VlcPlayer());
        vlcPlayer.play("", "asd");

        AdvancedMediaPlayerAdapter mp4Player = new AdvancedMediaPlayerAdapter(new Mp4Player());
        mp4Player.play("", "aaa");
    }
}

