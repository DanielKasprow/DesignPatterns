package StructuralDesignPatterns.Adapter.Challange;

class AdvancedMediaPlayerAdapter implements MediaPlayerInterface {

    AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer){
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(final String audioType, final String filename) {
        advancedMediaPlayer.loadFilename(filename);
        advancedMediaPlayer.listen();
    }
}
