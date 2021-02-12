package Example2;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(String auidoType, String FileName) {
        if(auidoType.equalsIgnoreCase("mp3"))
        {
            System.out.println("Playing mp3 file. Name: " + FileName);
        }
        else if(auidoType.equalsIgnoreCase("vlc") || auidoType.equalsIgnoreCase("mp4"))
        {
            mediaAdapter = new MediaAdapter(auidoType);
            mediaAdapter.play(auidoType,FileName);
        }
        else
        {
            System.out.println("Invalid media."+ auidoType + " format not supported");
        }
    }
}
