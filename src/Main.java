public class Main {
    public static void main(String[] args) {
        IMusicPlayer[] players = new IMusicPlayer[]{new Spotify(), new Itunes(), new Mp3Player()};
        MusicApp app = new MusicApp();
        app.startMusic(players);
    }
}