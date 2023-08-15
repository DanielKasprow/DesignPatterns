package StructuralDesignPatterns.Adapter.Challange;

interface AdvancedMediaPlayer {
    void loadFilename(String name);
    void listen();
}
class VlcPlayer implements AdvancedMediaPlayer{

    String filename;
    @Override
    public void loadFilename(final String filename) {
        this.filename = filename;

    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file.  Name: " + filename);

    }
}
class Mp4Player implements AdvancedMediaPlayer{
    String filename;
    @Override
    public void loadFilename(final String filename) {
        this.filename = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing mp4 file.  Name: " + filename);
    }
}
