public interface IOfflineMusicPlayer extends IMusicPlayer{
    @Override
    public void play();

    @Override
    public void stop();

    public void load();
}
