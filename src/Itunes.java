public class Itunes implements IOfflineMusicPlayer{
    @Override
    public void play() {
        System.out.println("Playing music on iTunes");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music on iTunes");
    }

    @Override
    public void load() {
        System.out.println("Loading music on iTunes");
    }
}
