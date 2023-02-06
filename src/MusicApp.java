public class MusicApp {

    public void startMusic(IMusicPlayer[] players){
        for(IMusicPlayer player : players){
            if(player instanceof IOfflineMusicPlayer){
                ((IOfflineMusicPlayer)player).load();
            }
            if(player instanceof IOnlineMusicPlayer){
                ((IOnlineMusicPlayer)player).stream();
            }
            player.play();
            player.stop();
        }
    }
}
