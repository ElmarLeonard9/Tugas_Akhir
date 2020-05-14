package finalprojectta;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {
    
    String SpookySpookySkeleton = ".//res//SpookySpookyMusical.wav";
    Clip clip;
    
    public void SetFile(String FileName){
        try{
         File file = new File(FileName);
         AudioInputStream BGM = AudioSystem.getAudioInputStream(file);
         clip = AudioSystem.getClip();
         clip.open(BGM);
        }
        catch(Exception e){
        
        }
    }
    public void play(){
        clip.setFramePosition(0);
        clip.start();
    }
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
}
