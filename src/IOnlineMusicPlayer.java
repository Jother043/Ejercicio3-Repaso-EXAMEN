public interface IOnlineMusicPlayer extends IMusicPlayer{
    @Override
    public void play();

    @Override
    public void stop();

    public void stream();
}
