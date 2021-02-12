package Example2;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String audioType)
    {
        if(audioType.equalsIgnoreCase("vlc"))
        {
            advancedMediaPlayer = new VlcPlayer();
        }
        else if(audioType.equalsIgnoreCase("mp4"))
        {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String auidoType, String FileName) {
        if(auidoType.equalsIgnoreCase("vlc"))
        {
            advancedMediaPlayer.playVlc(FileName);
        }
        else if(auidoType.equalsIgnoreCase("mp4"))
        {
            advancedMediaPlayer.playMp4(FileName);
        }
    }
}
