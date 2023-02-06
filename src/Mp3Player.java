public class Mp3Player implements IOfflineMusicPlayer{
    @Override
    public void play() {
        System.out.println("Playing music on MP3 Player\n");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music on MP3 Player");
    }

    @Override
    public void load() {
        System.out.println("Loading music on MP3 Player");
    }
}
